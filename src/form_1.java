import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_1 extends JFrame {
    private JTextField txtName;
    private JLabel labelName;
    private JLabel labelSurname;
    private JTextField txtSurname;
    private JLabel labelNationality;
    private JLabel labelGender;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JLabel labelAboutYou;
    private JComboBox nationsComboBox;
    private JTextPane txtAboutYou;
    private JLabel labelLectures;
    private JCheckBox OOPCheckBox;
    private JCheckBox OSComboBox;
    private JCheckBox SPComboBox;
    private JButton btnSubmit;
    private JButton btnClear;
    private JLabel labelNotice;
    private JPanel main;
    ButtonGroup sex = new ButtonGroup();

    public form_1() throws HeadlessException {
        setTitle("Form - Enter info");
        setSize(430,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sex.add(maleRadioButton);
        sex.add(femaleRadioButton);
        add(main);
        setVisible(true);
        setResizable(false);

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean errorCheck = false;
                errorCheck = isErrorHandled();//error checker
               if (errorCheck == false){
                setVisible(false);//close from 1
                form_2 frm2 = new form_2();//opening the second form

                frm2.setTxtLabelName(txtName.getText());//sends to name text field form 2
                frm2.setTxtLabelSurname(txtSurname.getText());//sends to surname text field form 2
                if(maleRadioButton.isSelected())//is male radio button selected
                     frm2.setTxtLabelGender(maleRadioButton.getText());//sends to male radio button to form 2
                 else if(femaleRadioButton.isSelected()) //is female radio button selected
                     frm2.setTxtLabelGender(femaleRadioButton.getText());//sends female radio button to form 2
                frm2.setTxtLabelNationaity((String) nationsComboBox.getSelectedItem());//sends comboBox to form 2
                frm2.setTxtLabelProfile(txtAboutYou.getText());//sends text pane to form 2
                String Lectures = "";//
                if (OOPCheckBox.isSelected())
                    Lectures += OOPCheckBox.getText();
                if (OSComboBox.isSelected())
                    Lectures += OSComboBox.getText();
                if (SPComboBox.isSelected())
                    Lectures += SPComboBox.getText();
                frm2.setTxtLabelLectures(Lectures);//sends checkboxes to form 2
            }
               else//if error found show message
                   JOptionPane.showMessageDialog(null,"Enter the required" +
                           " Information","Incomplete info",JOptionPane.ERROR_MESSAGE);
            }
        });//submit button actions

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtName.setText("");//clear name text field
                txtSurname.setText("");//clear surname text field
                txtAboutYou.setText("");//clear about you text panel
                sex.clearSelection();//clear radio button
                clearOptions();//clear check boxes
                nationsComboBox.setSelectedIndex(0);//clear comboBox

            }
        });//clear button actions
    }

    public static void main(String[] args) {
        form_1 frm1 = new form_1();
    }//main function

   private boolean isErrorHandled()//function to check for errors
   {
        boolean errorExits = false;
        if (!(this.txtName.getText().length() > 0)){
            errorExits = true;
            txtName.requestFocus();
        }
       if (!(this.txtSurname.getText().length() > 0)){
           errorExits = true;
           txtSurname.requestFocus();
       }
       if (!(this.maleRadioButton.isSelected())&&!(this.femaleRadioButton.isSelected())){
           errorExits = true;
       }
       if (this.nationsComboBox.getSelectedItem() ==""){
           errorExits = true;
       }

       return errorExits;
   }

    public void clearOptions ()//function to clear check boxes
    {
        OOPCheckBox.setSelected(false);
        OSComboBox.setSelected(false);
        SPComboBox.setSelected(false);

    }
}

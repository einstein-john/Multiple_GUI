import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_2 extends JFrame {
    private JButton btnReturn;
    private JLabel labelName;
    private JLabel labelSurname;
    private JLabel labelGender;
    private JLabel txtLabelName;
    private JLabel txtLabelSurname;
    private JLabel txtLabelGender;
    private JLabel txtLabelNationaity;
    private JLabel txtLabelProfile;
    private JLabel txtLabelLectures;
    private JLabel labelNationality;
    private JLabel labelProfile;
    private JLabel labelLectures;
    private JPanel main;

    public form_2() {
        setTitle("Form - Result");
        setSize(430,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add(main);
        setVisible(true);
        btnReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form_1 form1 = new form_1();
                setVisible(false);
                form1.setVisible(true);

            }
        });
    }

    public void setTxtLabelName(String txtLabelName) {
        this.txtLabelName.setText(txtLabelName);
    }

    public void setTxtLabelSurname(String txtLabelSurname) {
        this.txtLabelSurname.setText(txtLabelSurname);
    }

    public void setTxtLabelGender(String txtLabelGender) {
        this.txtLabelGender.setText(txtLabelGender);
    }

    public void setTxtLabelNationaity(String txtLabelNationaity) {
        this.txtLabelNationaity.setText(txtLabelNationaity);
    }

    public void setTxtLabelProfile(String txtLabelProfile) {
        this.txtLabelProfile.setText(txtLabelProfile);
    }

    public void setTxtLabelLectures(String txtLabelLectures) {
        this.txtLabelLectures.setText(txtLabelLectures);
    }
}

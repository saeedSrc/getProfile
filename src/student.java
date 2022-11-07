import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class student {
    private JTextField name;
    private JTextField lastname;
    private JTextField age;
    private JButton getResultButton;
    private JTextField result;
    private JPanel Main;


    public student() {
        getResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var tempResult = "name is : " + name.getText() + " last name is: " +  lastname.getText() + " age is: " + age.getText();
                System.out.println(tempResult);
                result.setText(tempResult);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("student");
        frame.setContentPane(new student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

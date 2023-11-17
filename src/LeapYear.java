

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LeapYear extends JFrame {


    private JLabel lyear;
    private JTextField tfYear;
    private JPanel jpanel;
    private JButton bCheck;

    public LeapYear() {
        bCheck.addActionListener(e ->  {
            int year = Integer.parseInt(tfYear.getText());

            if(year % 4 == 0) {
                JOptionPane.showMessageDialog(this, "Leap Year");
            } else {
                JOptionPane.showMessageDialog(this, "Not a leap year");
            }
        });
    }

    public static void main(String[] args) {
        LeapYear app = new LeapYear();
        app.setContentPane(app.jpanel);
        app.setSize(400, 200);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}

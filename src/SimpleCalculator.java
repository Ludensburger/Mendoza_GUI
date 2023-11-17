import javax.swing.*;

public class SimpleCalculator extends JFrame {
    private JLabel lnum1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton bcompute;
    private JComboBox cb;
    private JLabel result;
    private JPanel jpanel;

    public SimpleCalculator() {
        bcompute.addActionListener(e ->  {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());

            if(cb.getSelectedIndex() == 0) {
                int sum = num1 + num2;
                result.setText(String.valueOf(sum));
            }if(cb.getSelectedIndex() == 1) {
                int difference = num1 - num2;
                result.setText(String.valueOf(difference));
            }if(cb.getSelectedIndex() == 2) {
                int product = num1 * num2;
                result.setText(String.valueOf(product));
            }if(cb.getSelectedIndex() == 3) {
                int quotient = num1 / num2;
                result.setText(String.valueOf(quotient));
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.jpanel);
        app.setSize(800, 250);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }
}

import javax.swing.*;

public class OrderingSystem extends JFrame {


    private JPanel jpanel;
    private JLabel lfood;
    private JLabel ldiscount;
    private JCheckBox pizzaCheckBox;
    private JRadioButton noneRadioButton;
    private JButton button1;
    private JCheckBox burgerCheckBox;
    private JCheckBox friesCheckBox;
    private JCheckBox softDrinksCheckBox;
    private JCheckBox teaCheckBox;
    private JCheckBox sundaeCheckBox;
    private JRadioButton rb5off;
    private JRadioButton rb10off;
    private JRadioButton rb15off;

    public OrderingSystem() {
        button1.addActionListener(e ->  {
            double sum = 0;
            if (pizzaCheckBox.isSelected()) {
                sum += 100;
            }if (burgerCheckBox.isSelected()) {
                sum += 80;
            }if (friesCheckBox.isSelected()) {
                sum += 65;
            }if (softDrinksCheckBox.isSelected()) {
                sum += 55;
            }if (teaCheckBox.isSelected()) {
                sum += 50;
            }if (sundaeCheckBox.isSelected()) {
                sum += 40;
            }

            float result = (float) sum;
            float resultest = (float) sum;
            if(rb5off.isSelected()) {
                result = (float) (sum * 0.05);
                resultest = (float) (sum - result);
            }if(rb10off.isSelected()) {
                result = (float) (sum * 0.10);
                resultest = (float) (sum - result);
            }if(rb15off.isSelected()) {
                result = (float) (sum * 0.15);
                resultest = (float) (sum - result);
            }

            JOptionPane.showMessageDialog(this, "The total price is Php " + resultest);
        });
    }

    public static void main(String[] args) {
        OrderingSystem app = new OrderingSystem();
        app.setContentPane(app.jpanel);
        app.setSize(500, 300);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }
}

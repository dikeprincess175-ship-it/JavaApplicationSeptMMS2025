
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1212 extends JFrame implements ActionListener {

    JTextField fahrenheit;
    JLabel result;

    public Ex1212() {
        fahrenheit = new JTextField(10);
        JButton convert = new JButton("Convert");
        result = new JLabel("Celsius: ");
        setLayout(new FlowLayout());
        add(new JLabel("Fahrenheit:"));
        add(fahrenheit);
        add(convert);
        add(result);
        convert.addActionListener(this);
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double f = Double.parseDouble(fahrenheit.getText());
        double c = 5.0 / 9.0 * (f - 32);
        result.setText(String.format("Celsius: %.2f", c));
    }

    public static void main(String[] args) {
        new Ex1212();
    }
}

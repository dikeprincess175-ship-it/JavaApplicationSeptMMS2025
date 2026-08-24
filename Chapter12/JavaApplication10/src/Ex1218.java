
import java.awt.*;
import javax.swing.*;

public class Ex1218 extends JFrame {

    JLabel status = new JLabel("ATM ready");

    public Ex1218() {
        JButton removeCash = new JButton("Remove Cash");
        JButton insertEnvelope = new JButton("Insert Envelope");
        removeCash.addActionListener(e
                -> status.setText("Cash removed."));
        insertEnvelope.addActionListener(e
                -> status.setText("Deposit envelope inserted."));
        setLayout(new FlowLayout());
        add(removeCash);
        add(insertEnvelope);
        add(status);
        setSize(450, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex1218();
    }
}
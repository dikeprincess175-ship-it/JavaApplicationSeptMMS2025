package chapter13;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Ellipse2Dd extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        double x = 50, y = 50, size = 280;
        for (int i = 0; i < 8; i++) {
            g2.draw(new Ellipse2D.Double(x, y, size, size));
            x += 10;
            y += 10;
            size -= 20;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.7");
        frame.add(new Ellipse2Dd());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

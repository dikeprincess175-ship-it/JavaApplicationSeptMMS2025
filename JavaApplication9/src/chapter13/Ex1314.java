package chapter13;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class Ex1314 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        double x = 40, y = 40, cell = 35;
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                g2.draw(new Rectangle2D.Double(
                        x + col * cell, y + row * cell, cell, cell));
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.14");
        frame.add(new Ex1314());
        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

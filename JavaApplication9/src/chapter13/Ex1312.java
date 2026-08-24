package chapter13;

import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;

public class Ex1312 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        int startX = 50, startY = 50, cell = 40;
        for (int i = 0; i <= 8; i++) {
            g2.draw(new Line2D.Double(startX, startY + i * cell,
                    startX + 8 * cell, startY + i * cell));
            g2.draw(new Line2D.Double(startX + i * cell, startY,
                    startX + i * cell, startY + 8 * cell));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.12");
        frame.add(new Ex1312());
        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

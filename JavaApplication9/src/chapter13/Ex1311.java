package chapter13;

import java.awt.*;
import javax.swing.*;

public class Ex1311 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int startX = 50, startY = 50;
        int cell = 40;
        for (int i = 0; i <= 8; i++) {
            g.drawLine(startX, startY + i * cell,
                    startX + 8 * cell, startY + i * cell);
            g.drawLine(startX + i * cell, startY,
                    startX + i * cell, startY + 8 * cell);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.11");
        frame.add(new Ex1311());
        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

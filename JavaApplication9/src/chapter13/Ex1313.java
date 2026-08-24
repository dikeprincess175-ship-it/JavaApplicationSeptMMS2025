package chapter13;

import java.awt.*;
import javax.swing.*;

public class Ex1313 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 40, y = 40, cell = 35;

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                g.drawRect(x + col * cell, y + row * cell, cell, cell);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.13");
        frame.add(new Ex1313());
        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

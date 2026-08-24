package chapter13;

import java.awt.*;
import javax.swing.*;

public class Ex1323 extends JPanel {

    int x = 250, y = 200;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Turtle starting point", x, y);
        g.drawLine(x, y, x + 100, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.23 Turtle Graphics");
        frame.add(new Ex1323());
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

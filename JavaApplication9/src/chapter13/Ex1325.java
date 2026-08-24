package chapter13;

import java.awt.*;
import javax.swing.*;

public class Ex1325 extends JPanel {

    int tortoise = 0;
    int hare = 0;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
// Mountain arc
        g.drawArc(40, 40, 500, 300, 0, 180);
// Simple positions along the mountain
        int tx = 40 + tortoise;
        int hx = 40 + hare;
        g.drawString("T", tx, 180);

        g.drawString("H", hx, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.25 Tortoise and Hare");
        frame.add(new Ex1325());
        frame.setSize(650, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

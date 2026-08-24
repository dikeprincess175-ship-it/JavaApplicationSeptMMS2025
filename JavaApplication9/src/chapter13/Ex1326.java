package chapter13;

import java.awt.*;
import javax.swing.*;

public class Ex1326 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int[] x = new int[100];
        int[] y = new int[100];
        int cx = 300, cy = 200;
        double angle = 0;
        double radius = 5;
        for (int i = 0; i < 100; i++) {
            x[i] = cx + (int) (radius * Math.cos(angle));
            y[i] = cy + (int) (radius * Math.sin(angle));
            angle += Math.PI / 6;
            radius += 3;
        }
        g.drawPolyline(x, y, x.length);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.26 Spiral");
        frame.add(new Ex1326());
        frame.setSize(650, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

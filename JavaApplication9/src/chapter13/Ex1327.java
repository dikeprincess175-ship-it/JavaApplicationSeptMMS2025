package chapter13;

import java.awt.*;
import java.awt.geom.Arc2D;
import javax.swing.*;

public class Ex1327 extends JPanel {

    double[] values = {25, 35, 20, 20};

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Color[] colors = {
            Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE
        };
        double start = 0;
        for (int i = 0; i < 4; i++) {
            double angle = values[i] / 100.0 * 360;
            g2.setColor(colors[i]);
            Arc2D.Double arc = new Arc2D.Double(
                    100, 70, 250, 250,
                    start, angle, Arc2D.PIE);
            g2.fill(arc);
            start += angle;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.27 Pie Chart");
        frame.add(new Ex1327());
        frame.setSize(500, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

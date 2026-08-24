package chapter13;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.Random;
import javax.swing.*;

public class Ex138 extends JPanel {

    Random random = new Random();

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < 20; i++) {
            g2.setColor(new Color(random.nextInt(256),
                    random.nextInt(256), random.nextInt(256)));
            g2.setStroke(new BasicStroke(1 + random.nextInt(6)));
            double x1 = random.nextInt(getWidth());
            double y1 = random.nextInt(getHeight());
            double x2 = random.nextInt(getWidth());
            double y2 = random.nextInt(getHeight());
            g2.draw(new Line2D.Double(x1, y1, x2, y2));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.8");
        frame.add(new Ex138());
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

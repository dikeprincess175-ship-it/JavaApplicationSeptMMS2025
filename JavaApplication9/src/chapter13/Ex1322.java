package chapter13;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Ex1322 extends JPanel {

    Random random = new Random();

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < 25; i++) {
            int x = random.nextInt(Math.max(1, getWidth()));
            int y = random.nextInt(Math.max(1, getHeight()));
            int w = 30 + random.nextInt(100);
            int h = 30 + random.nextInt(100);
            Color c1 = new Color(random.nextInt(256),
                    random.nextInt(256), random.nextInt(256));
            Color c2 = new Color(random.nextInt(256),
                    random.nextInt(256), random.nextInt(256));
            GradientPaint gradient
                    = new GradientPaint(x, y, c1, x + w, y + h, c2);
            g2.setPaint(gradient);
            if (random.nextBoolean()) {
                g2.fillRect(x, y, w, h);
            } else {
                g2.fillOval(x, y, w, h);
            }
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.22");
        frame.add(new Ex1322());
        frame.setSize(650, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

package chapter13;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Ex1321 extends JPanel {

    Random random = new Random();

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 30; i++) {
            int x = random.nextInt(Math.max(1, getWidth()));
            int y = random.nextInt(Math.max(1, getHeight()));
            int w = 20 + random.nextInt(80);
            int h = 20 + random.nextInt(80);
            g.setColor(new Color(random.nextInt(256),
                    random.nextInt(256), random.nextInt(256)));
            int shape = random.nextInt(3);
            if (shape == 0) {
                g.drawRect(x, y, w, h);
            } else if (shape == 1) {
                g.drawOval(x, y, w, h);
            } else {
                g.drawLine(x, y, x + w, y + h);
            }
        }
        repaint();
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("13.21");
        frame.add(new Ex1321());
        frame.setSize(650, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

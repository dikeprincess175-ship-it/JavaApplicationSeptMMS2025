package chapter13;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Ex1329 extends JPanel {

    Random random = new Random();
    Color[] colors = {
        Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY,
        Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA,
        Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW
    };

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(Math.max(1, getWidth() - 80));
            int y = random.nextInt(Math.max(1, getHeight() - 80));
            int w = 20 + random.nextInt(60);
            int h = 20 + random.nextInt(60);
            g.setColor(colors[random.nextInt(colors.length)]);

            if (i % 2 == 0) {
                g.fillRect(x, y, w, h);
            } else {
                g.fillOval(x, y, w, h);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.29");
        frame.add(new Ex1329());
        frame.setSize(650, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

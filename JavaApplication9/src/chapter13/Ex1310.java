package chapter13;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Ex1310 extends JPanel {

    Random random = new Random();
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 50; i++) {
            int size = 12 + random.nextInt(35);
            int style = random.nextInt(3);
            Font font = new Font("Serif", style, size);
            g.setFont(font);
            g.setColor(new Color(random.nextInt(256),
                    random.nextInt(256), random.nextInt(256)));
            char c = chars.charAt(random.nextInt(chars.length()));
            int x = random.nextInt(Math.max(1, getWidth() - 20));

            int y = 20 + random.nextInt(Math.max(1, getHeight() - 20));
            g.drawString(String.valueOf(c), x, y);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.10");
        frame.add(new Ex1310());
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

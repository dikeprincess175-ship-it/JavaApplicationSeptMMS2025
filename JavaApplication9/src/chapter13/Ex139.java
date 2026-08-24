package chapter13;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;
import javax.swing.*;

public class Ex139 extends JPanel {

    Random random = new Random();

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < 15; i++) {
            int x = random.nextInt(400);
            int y = random.nextInt(300);
            GeneralPath triangle = new GeneralPath();
            triangle.moveTo(x, y);
            triangle.lineTo(x + 50, y + 80);
            triangle.lineTo(x - 50, y + 80);
            triangle.closePath();
            g2.setColor(new Color(random.nextInt(256),
                    random.nextInt(256), random.nextInt(256)));
            g2.fill(triangle);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.9");
        frame.add(new Ex139());
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

package chapter13;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Ex1318 extends JPanel {

    Random random = new Random();
    int lines = 0;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 100; i++) {
            g.drawLine(random.nextInt(getWidth()),
                    random.nextInt(getHeight()),
                    random.nextInt(getWidth()),
                    random.nextInt(getHeight()));
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.18");
        frame.add(new Ex1318());
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

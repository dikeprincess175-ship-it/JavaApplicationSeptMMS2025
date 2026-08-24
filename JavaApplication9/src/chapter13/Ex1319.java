package chapter13;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class Ex1319 extends JPanel implements ActionListener {

    Random random = new Random();
    Timer timer;

    public Ex1319() {
        timer = new Timer(1000, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 100; i++) {
            g.drawLine(random.nextInt(getWidth()),
                    random.nextInt(getHeight()),
                    random.nextInt(getWidth()),
                    random.nextInt(getHeight()));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.19");
        frame.add(new Ex1319());
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

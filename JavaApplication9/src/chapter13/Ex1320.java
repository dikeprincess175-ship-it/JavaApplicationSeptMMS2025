package chapter13;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class Ex1320 extends JPanel {

    Random random = new Random();
    int numberOfLines = 100;

    public Ex1320() {
        JTextField field = new JTextField("100", 5);
        field.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    numberOfLines = Integer.parseInt(field.getText());
                    repaint();
                } catch (NumberFormatException ex) {
                    numberOfLines = 100;
                }
            }
        });
        add(new JLabel("Number of lines:"));
        add(field);
        Timer timer = new Timer(1000, e -> repaint());
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < numberOfLines; i++) {
            g.drawLine(random.nextInt(Math.max(1, getWidth())),
                    random.nextInt(Math.max(1, getHeight())),
                    random.nextInt(Math.max(1, getWidth())),
                    random.nextInt(Math.max(1, getHeight())));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.20");
        frame.add(new Ex1320());
        frame.setSize(650, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

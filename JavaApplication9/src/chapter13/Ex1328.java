package chapter13;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class Ex1328 extends JPanel {

    JComboBox<String> comboBox;
    Random random = new Random();
    String shape = "Rectangle";

    public Ex1328() {
        comboBox = new JComboBox<>(
                new String[]{"Rectangle", "Oval", "Line"});
        add(comboBox);
        comboBox.addActionListener(e -> {
            shape = (String) comboBox.getSelectedItem();
            repaint();
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(Math.max(1, getWidth() - 80));
            int y = 50 + random.nextInt(Math.max(1, getHeight() - 100));
            int w = 20 + random.nextInt(60);
            int h = 20 + random.nextInt(60);
            if (shape.equals("Rectangle")) {
                g.drawRect(x, y, w, h);
            } else if (shape.equals("Oval")) {
                g.drawOval(x, y, w, h);
            } else {
                g.drawLine(x, y, x + w, y + h);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.28");
        frame.add(new Ex1328());
        frame.setSize(650, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

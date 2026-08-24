package chapter13;

import java.awt.*;
import javax.swing.*;

public class Ex1330 extends JPanel {

    Color selectedColor = Color.BLUE;

    public Ex1330() {
        JButton button = new JButton("Choose Color");
        add(button);
        button.addActionListener(e -> {
            Color color = JColorChooser.showDialog(
                    this, "Choose a Color", selectedColor);
            if (color != null) {
                selectedColor = color;
                repaint();
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(selectedColor);
        for (int i = 0; i < 20; i++) {
            int x = 30 + i * 25;
            int y = 100 + (i % 5) * 45;
            g.fillRect(x, y, 40, 30);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.30");
        frame.add(new Ex1330());
        frame.setSize(650, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

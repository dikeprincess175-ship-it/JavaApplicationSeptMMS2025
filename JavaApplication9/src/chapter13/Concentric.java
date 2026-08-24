package chapter13;


import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Concentric extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 50, y = 50, size = 280;
        for (int i = 0; i < 8; i++) {
            g.drawArc(x, y, size, size, 0, 360);
            x += 10;
            y += 10;
            size -= 20;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.6");
        frame.add(new Concentric());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

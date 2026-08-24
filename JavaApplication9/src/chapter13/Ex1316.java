package chapter13;

import java.awt.*;
import java.awt.geom.GeneralPath;
import javax.swing.*;

public class Ex1316 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        int x = 100, y = 100, s = 150, d = 60;
        GeneralPath cube = new GeneralPath();
        cube.moveTo(x, y);
        cube.lineTo(x + s, y);
        cube.lineTo(x + s, y + s);
        cube.lineTo(x, y + s);
        cube.closePath();
        cube.moveTo(x + d, y - d);
        cube.lineTo(x + s + d, y - d);
        cube.lineTo(x + s + d, y + s - d);
        cube.lineTo(x + s, y + s);
        cube.moveTo(x + d, y - d);
        cube.lineTo(x, y);
        cube.moveTo(x + s + d, y - d);
        cube.lineTo(x + s, y);
        cube.moveTo(x + s + d, y + s - d);
        cube.lineTo(x + s, y + s);
        g2.draw(cube);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.16");
        frame.add(new Ex1316());
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

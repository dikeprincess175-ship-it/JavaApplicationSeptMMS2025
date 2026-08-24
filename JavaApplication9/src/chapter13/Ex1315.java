package chapter13;

import java.awt.*;
import java.awt.geom.GeneralPath;
import javax.swing.*;

public class Ex1315 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        GeneralPath p = new GeneralPath();
        p.moveTo(200, 60);
        p.lineTo(80, 280);
        p.lineTo(320, 280);
        p.closePath();
        p.moveTo(200, 60);
        p.lineTo(200, 210);
        p.lineTo(80, 280);
        p.moveTo(200, 60);
        p.lineTo(320, 280);
        p.lineTo(200, 210);
        p.moveTo(80, 280);
        p.lineTo(320, 280);
        p.lineTo(200, 210);
        g2.draw(p);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.15");
        frame.add(new Ex1315());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

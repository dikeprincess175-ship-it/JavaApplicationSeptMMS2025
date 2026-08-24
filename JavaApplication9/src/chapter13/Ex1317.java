package chapter13;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class Ex1317 extends JPanel {

    double radius;
    double x, y;

    public Ex1317(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        g2.draw(new Ellipse2D.Double(x, y, diameter, diameter));
        g2.drawString("Diameter: " + diameter, 20, 300);
        g2.drawString("Circumference: " + circumference, 20, 320);
        g2.drawString("Area: " + area, 20, 340);
    }

    public static void main(String[] args) {
        double radius = Double.parseDouble(
                JOptionPane.showInputDialog("Enter radius:"));
        double x = Double.parseDouble(
                JOptionPane.showInputDialog("Enter x coordinate:"));
        double y = Double.parseDouble(
                JOptionPane.showInputDialog("Enter y coordinate:"));
        JFrame frame = new JFrame("13.17");
        frame.add(new Ex1317(radius, x, y));
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

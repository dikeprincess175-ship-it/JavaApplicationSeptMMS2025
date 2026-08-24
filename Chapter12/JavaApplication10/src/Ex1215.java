
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex1215 extends JFrame
        implements ActionListener, ItemListener,
        ListSelectionListener, MouseListener,
        MouseMotionListener, KeyListener {

    JTextArea output;
    JList<String> list;

    public Ex1215() {
        output = new JTextArea(15, 50);
        output.setEditable(false);
        JButton button = new JButton("Action Event");
        button.addActionListener(this);
        JCheckBox check = new JCheckBox("Item Event");
        check.addItemListener(this);
        list = new JList<>(new String[]{"One", "Two", "Three"});
        list.addListSelectionListener(this);
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(check);
        panel.add(new JScrollPane(list));
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(output), BorderLayout.CENTER);
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
        setFocusable(true);
        setSize(650, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        requestFocusInWindow();
    }

    void showEvent(Object event) {
        output.append(event.toString() + "\n\n");
    }

    public void actionPerformed(ActionEvent e) {
        showEvent(e);
    }

    public void itemStateChanged(ItemEvent e) {
        showEvent(e);
    }

    public void valueChanged(ListSelectionEvent e) {
        showEvent(e);
    }

    public void mouseClicked(MouseEvent e) {
        showEvent(e);
    }

    public void mousePressed(MouseEvent e) {
        showEvent(e);
    }

    public void mouseReleased(MouseEvent e) {
        showEvent(e);
    }

    public void mouseEntered(MouseEvent e) {
        showEvent(e);
    }

    public void mouseExited(MouseEvent e) {
        showEvent(e);
    }

    public void mouseDragged(MouseEvent e) {
        showEvent(e);
    }

    public void mouseMoved(MouseEvent e) {
        showEvent(e);
    }

    public void keyTyped(KeyEvent e) {
        showEvent(e);
    }

    public void keyPressed(KeyEvent e) {
        showEvent(e);
    }

    public void keyReleased(KeyEvent e) {
        showEvent(e);
    }

    public static void main(String[] args) {
        new Ex1215();
    }
}

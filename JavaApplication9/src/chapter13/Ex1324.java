package chapter13;

import java.awt.*;
import javax.swing.*;

public class Ex1324 extends JPanel {

    int[][] board = new int[8][8];

    public Ex1324() {
        int[][] moves = {
            {2, 1}, {1, 2}, {-1, 2}, {-2, 1},
            {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
        };
        int row = 0, col = 0;
        for (int move = 1; move <= 64; move++) {
            board[row][col] = move;
            boolean moved = false;
            for (int[] m : moves) {
                int nr = row + m[0];
                int nc = col + m[1];
                if (nr >= 0 && nr < 8 && nc >= 0 && nc < 8
                        && board[nr][nc] == 0) {
                    row = nr;
                    col = nc;
                    moved = true;
                    break;
                }
            }
            if (!moved) {
                break;
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int cell = 50;
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                g.drawRect(c * cell, r * cell, cell, cell);
                if (board[r][c] != 0) {
                    g.drawString(String.valueOf(board[r][c]),
                            c * cell + 20, r * cell + 30);
                }
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("13.24");
        frame.add(new Ex1324());
        frame.setSize(430, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

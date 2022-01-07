/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhdongho;

/**
 *
 * @author Admin
 */
import java.awt.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ĐỒNG HỒ");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setPreferredSize(new Dimension(320, 360));
          Clock clock = new Clock();
          clock.setPreferredSize(new Dimension(330, 360));
          clock.init();
          frame.setLayout(new BorderLayout());
          frame.getContentPane().add(clock, BorderLayout.CENTER);
          frame.pack();
          frame.setVisible(true);
    }
}

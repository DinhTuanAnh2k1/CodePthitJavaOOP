/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hopchonmau;

/**
 *
 * @author Admin
 */
import java.awt.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        ColorFrame f = new ColorFrame("Tô màu cho vui");
        f.setSize(500,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

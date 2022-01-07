/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J01012;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TinhCong nv = new TinhCong(in.nextLine(), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine()), in.nextLine());
        System.out.println(nv);
    }
}

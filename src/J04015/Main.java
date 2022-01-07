/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04015;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GiaoVien q = new GiaoVien(in.nextLine(), in.nextLine(), in.nextInt());
        System.out.println(q);
    }
}

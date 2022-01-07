/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoc_java_huong_doi_tuong;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J01003_Giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a==0){
            if(b==0) System.out.println("VSN");
            else System.out.println("VN");
        }
        else{
            double c = (double)-b/a;
            System.out.printf("%1.2f",c);
        }
    }
}

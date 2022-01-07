/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoc_java_huong_doi_tuong;

import java.util.Scanner;

/**
 *
 * @author Mr Hieu
 */
public class quayphai {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            sc.nextLine();
            String s[] = sc.nextLine().split("\\s+");
            while (true) {
                if (check(s))
                    break;
                String ans = "";
                for (int i = 1; i < s.length; i++)
                    ans += s[i] + " ";
                ans += s[0];
                s = ans.split("\\s+");
                count += 1;
            }
            System.out.println(count);
        }
    }

    public static boolean check(String s[]) {
        for (int i = 0; i < s.length - 1; i++)
            if (Integer.parseInt(s[i]) > Integer.parseInt(s[i + 1]))
                return false;
        return true;
    }
}

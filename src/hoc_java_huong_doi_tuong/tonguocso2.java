/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoc_java_huong_doi_tuong;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mr Hieu
 */
public class tonguocso2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt();
        int count = 0;
        long arr[] = new long[b + 1];
        Arrays.fill(arr, 1);
        for (int i = 2; i <= b; i++)
            for (int j = i * 2; j <= b; j += i)
                arr[j] += i;
        for (int i = a; i <= b; i++)
            if (arr[i] > i)
                count++;
        System.out.println(count);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so0va9;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            check(n);
            
        }
    }
    public static void check(int n){
        Queue<String> q = new LinkedList<>();
        
        q.add("9");
        while(!q.isEmpty()){
            String tmp = q.poll();
            long x = Long.parseLong(tmp);
            if(x % n == 0) {
                System.out.println(x);
                break;
            }
            q.add(tmp + "0");
            q.add(tmp + "9");
        }
        System.out.println();
    }
}

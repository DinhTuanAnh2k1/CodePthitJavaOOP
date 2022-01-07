/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solocphat;

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
            locPhat(n);
            System.out.println("");
        }
    }
    public static void locPhat(int n){
        Queue<String> q = new LinkedList<>();
        Stack<String>stk = new Stack<>();
        q.add("6");
        q.add("8");
        while(!q.isEmpty()){
            String front = q.peek();
            q.poll();
            if(check(front,n)) break;
            stk.add(front);
            q.add(front+"6");
            q.add(front+"8");
        }
        System.out.println(stk.size());
        while(!stk.empty()){
            System.out.print(stk.peek()+" ");
            stk.pop();
        }
    }
    public static boolean check(String res,int n){
        if(res.length()>n) return true;
        return false;
    }
}

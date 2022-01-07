/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsothutudaungoac;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        
        while(t-->0){
            Stack <Integer> stk = new Stack<>();
            String s = in.nextLine();
            int j=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='('){
                    ++j;
                    stk.add(j);
                    System.out.print(j+ " ");
                }
                else if(s.charAt(i)==')'){
                    System.out.print(stk.peek()+ " ");
                    stk.pop();
                }
            }
            System.out.println("");
        }
    }
}

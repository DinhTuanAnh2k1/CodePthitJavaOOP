/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xaunhiphandoixung;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Main {
    static int n, a[]=new int[100];
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int m = in.nextInt();
            for(int i=2; i<=m; i++){
                if(i%2==0){
                    n=i;
                    Try(1);
                }
            }
            
            System.out.println("");
        }
    }
    public static void Try(int i){
        for(int j = 0; j<=1; j++){
            a[i]=j;
            if(i==n){
                String kq = "";
                for(int l=1;l<=n;l++){
                    kq+=a[l];
                }
                if(check(kq)){
                    for(int l=1;l<=n;l++){
                        System.out.print(a[l]);
                    }   
                    System.out.print(" ");
                }
            }
            else Try(i+1);
        }
    }
    public static boolean check(String s){
        String res = "";
        for(int i = s.length()-1; i>=0; i--){
            res+=s.charAt(i);
        }
        if(s.equals(res)){
            return true;
        }
        return false;
    }
}

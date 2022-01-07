/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songuyenthuy;

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
            nguyenThuy(n);
            System.out.println("");
        }
    }
    public static void nguyenThuy(int n){
        Queue<String> q = new LinkedList<>();
        Queue<String> kq = new LinkedList<>();
        q.add("4");
        q.add("5");
        int count =0;
        while(!q.isEmpty()){
            
            String ktra = q.peek();
            q.poll();
            
            if(check(ktra,n)){
                kq.add(ktra);
                count++;
            }
            if(count==n) break;
            q.add(ktra+"4");
            q.add(ktra+"5");
        }
        while(!kq.isEmpty()){
            System.out.print(kq.peek()+" ");
            kq.poll();
        }
    }
    public static boolean check(String res, int n){
        int kq = 0;
        for(int i=0; i<res.length();i++){
            if(res.charAt(i)!=res.charAt(res.length()-1-i))
            {
                kq=1;
                break;
            }
        }
        
        if(kq==0&&res.length()%2==0 )
            return true;
        return false;
    }
    
}

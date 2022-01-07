/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05032;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        ArrayList<Tuoi> ds = new ArrayList<>();
        Scanner in= new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            Tuoi q = new Tuoi(in.nextLine());
            q.compareTo(q);
            ds.add(q);
        }
        Collections.sort(ds);
        for(int i=ds.size()-1; i>=0; i--){
            if(i==ds.size()-1||i==0)
                System.out.println(ds.get(i));
        }
    }
}

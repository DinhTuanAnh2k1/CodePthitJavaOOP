/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap_J07040_lietketukhacnhau;

/**
 *
 * @author Mr Hieu
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner in2 = new Scanner(new File("VANBAN.in"));
        ArrayList<String> ds1 = (ArrayList<String>) in1.readObject();
        TreeSet<String> set1 = new TreeSet<>();
        for(String tmp:ds1){
            String i[]=tmp.trim().toLowerCase().replaceAll("\\s+"," ").split(" ");
            for(String j:i){
                set1.add(j);
            }
        }
        while(in2.hasNext()){
            String s[]= in2.nextLine().trim().toLowerCase().replaceAll("\\s+", " ").split(" ");
            for(String i:s){
                if(set1.contains(i)){
                    System.out.println(i);
                    set1.remove(i);
                }
            }
        }
        
    }
}

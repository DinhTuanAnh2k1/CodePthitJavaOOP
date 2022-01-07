package ontap_J07032_sothuannghichtrongfile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ojs=new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Map<String,Integer> map=new HashMap<>();
        ArrayList<String> res=(ArrayList<String>) ojs.readObject();
        
        Scanner sc=new Scanner(new File("VANBAN.in"));
        
        for(String tmp:res){
            String i[]=tmp.trim().toLowerCase().replaceAll("\\s+"," ").split(" ");
            for(String j:i){
                map.put(j,1);
            }
        }
        
        while(sc.hasNext()){
            String s[]=sc.nextLine().trim().toLowerCase().replaceAll("\\s+", " ").split(" ");
            for(String i:s){
                if(map.containsKey(i)){
                    System.out.println(i);
                    map.remove(i);
                }
            }
        }
    }
}
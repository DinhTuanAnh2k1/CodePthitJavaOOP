package J05033;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        time a[]= new time[n+1];
        for(int i=0;i<n;i++){
            a[i]=new time();
            a[i].nhap(sc);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].second()>a[j].second()){
                    time tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
class time{
    public time(){
        
    }
    public int gio,phut,giay;
    public void nhap(Scanner sc){
        this.gio=sc.nextInt();
        this.phut=sc.nextInt();
        this.giay=sc.nextInt();
    }
    public int second(){
        return gio*3600+phut*60+giay;
    }
    @Override
    public String toString(){
        return gio+" "+phut+" "+giay;
    }
}
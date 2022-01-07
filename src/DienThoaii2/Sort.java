/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DienThoaii2;

/**
 *
 * @author Admin
 */
public class Sort implements Comparable<Sort>{
    private int tien;
    private String danhsach;
    public Sort(String a){
        this.tien=Tien(a);
        this.danhsach=a;
    }
    public String toString(){
        return this.danhsach;
    }
    private int Tien(String b){
        int res=0;
        int k=0;
        for(int i=b.length()-1; i>=0; i--){
            if(b.charAt(i)==' '){
                k=i;
                break;
            }
        }
        for(int i=k+1; i<b.length(); i++){
            res=res*10+b.charAt(i)-'0';
        }
        return res;
    }
    public int compareTo(Sort o){
        if(this.tien<o.tien) return 1;
        else if(this.tien>o.tien) return -1;
        return  0;
    }
}

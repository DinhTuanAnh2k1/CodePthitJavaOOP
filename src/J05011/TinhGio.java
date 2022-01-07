/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05011;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.time.*;
public class TinhGio implements Comparable<TinhGio>{
    private String ma, ten, giovao, giora;
    private int giochoi;
    
    public TinhGio(String ma, String ten, String giovao, String giora){
        this.ma=ma;
        this.ten=ten;
        this.giovao=giovao;
        this.giora=giora;
        this.giochoi=soPhutChoi(this.giovao,this.giora); 
    }
    public String toString(){
        return String.format("%s %s %d gio %d phut", ma, ten, (int)(giochoi/60), giochoi%60);
    }
    private int soPhutChoi(String a, String b){
        int tongphut=0,tieng1=0, tieng2=0, phut1=0, phut2=0;
        for(int i=0; i<=1; i++){
            tieng1=tieng1*10+(a.charAt(i)-'0');
        }
        for(int i=0; i<=1; i++){
            tieng2=tieng2*10+(b.charAt(i)-'0');
        }
        for(int i=3; i<=4; i++){
            phut1=phut1*10+(a.charAt(i)-'0');
        }
        for(int i=3; i<=4; i++){
            phut2=phut2*10+(b.charAt(i)-'0');
        }
        if((phut2-phut1)<0){
            tongphut = (tieng2-tieng1-1)*60+60-(phut1-phut2);
        }
        else{
            tongphut = (tieng2-tieng1)*60+phut2-phut1;
        }
        return tongphut;
    }
    public int compareTo(TinhGio o){
        if(this.giochoi<o.giochoi) return 1;
        if(this.giochoi>o.giochoi) return -1;
        return 0;
    }
}

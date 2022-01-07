/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06008_tinhgiochuan2;

/**
 *
 * @author Admin
 */
public class MonHoc {
    private String mamon, tenmon;
    public MonHoc(String mon){
        this.mamon = ma(mon);
        this.tenmon=Ten(mon);
    }
    public String toString(){
        return tenmon;
    }
    public String getMamon() {
        return mamon;
    }

    
    private String ma(String a){
        String res  ="";
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==' ')
                break;
            res+=a.charAt(i);
        }
        return res;
    }
    private String Ten(String a){
        String res  ="";
        int k=0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==' '){
                k=i+1;
                break;
            }
            
        }
        for(int i=k; i<a.length(); i++)
            res+=a.charAt(i);
        return res;
    }
}

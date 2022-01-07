/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06007;

/**
 *
 * @author Admin
 */
public class GioChuan {
    private String ma,mamon;
    private float gio;
    
    public GioChuan(String giochuan){
        this.mamon = Ten(giochuan);
        this.ma = MaMON(giochuan);
        this.gio = Float.parseFloat(Gio(giochuan));
    }

    public String getMa() {
        return ma;
    }

    public String getMamon() {
        return mamon;
    }

    public float getGio() {
        return gio;
    }
    
    private String MaMON(String a){
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
        for(int i=k; i<a.length(); i++){
            if(a.charAt(i)==' '){
                break;
            }
            else
                res+=a.charAt(i);
        }  
        return res;
    }
    private String Gio(String a){
        String res  ="";
        int k=0;
        for(int i=a.length()-1; i>=0; i--){
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

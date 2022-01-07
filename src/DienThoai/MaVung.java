/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DienThoai;

/**
 *
 * @author Admin
 */
public class MaVung {
    private int mavung, gia;
    private String tentinh;
    public MaVung(int ma, String tentinh,int gia){
        this.gia=gia;
        this.mavung=ma;
        this.tentinh=tentinh;
                
    }
    public String toString(){
        return this.tentinh;
    }

    public int getMavung() {
        return mavung;
    }

    public int getGia() {
        return gia;
    }

    public String getTentinh() {
        return tentinh;
    }

    
}

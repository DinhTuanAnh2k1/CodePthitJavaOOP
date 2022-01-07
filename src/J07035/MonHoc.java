/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07035;

/**
 *
 * @author Admin
 */
public class MonHoc {
    private String ma, name;
    private int soTin;

    public MonHoc(String ma, String name, int soTin) {
        this.ma = ma;
        this.name = name;
        this.soTin = soTin;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public int getSoTin() {
        return soTin;
    }
}

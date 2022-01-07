/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07036;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String ma, name, lop, email;

    public SinhVien(String ma, String name, String lop, String email) {
        this.ma = ma;
        String s[] = name.trim().toLowerCase().split("\\s+");
        String ans = "";
        for (String x : s)
            ans += String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1) + " ";
        this.name = ans;
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public String getLop() {
        return lop;
    }

    public String getEmail() {
        return email;
    }

}

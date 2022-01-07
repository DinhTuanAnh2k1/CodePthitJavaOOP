/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07036_bangdiemtheolop;

/**
 *
 * @author Admin
 */
public class MonHoc {
    private String mamon,tenmon,sotin;

    public MonHoc(String mamon, String tenmon, String sotin) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.sotin = sotin;
    }

    public String getMamon() {
        return mamon;
    }
    public String toString(){
        return mamon+" "+tenmon;
    }
}

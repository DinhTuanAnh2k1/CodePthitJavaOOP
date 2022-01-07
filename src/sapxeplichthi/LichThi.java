/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxeplichthi;

/**
 *
 * @author Mr Hieu
 */
public class LichThi {
    private String mamon,cathi;
    private int manhom,sosv;
    

    public LichThi(String mamon, String cathi, int manhom, int sosv) {
        this.mamon = mamon;
        this.cathi = cathi;
        this.manhom = manhom;
        this.sosv = sosv;
    }

    public String getMamon() {
        return mamon;
    }

    public String getCathi() {
        return cathi;
    }

    public int getManhom() {
        return manhom;
    }

    public int getSosv() {
        return sosv;
    }

    
    
}

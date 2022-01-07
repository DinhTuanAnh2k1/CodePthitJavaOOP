/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xephang;

/**
 *
 * @author Mr Hieu
 */
public class xep_hang {
    long T;
    long D;

    public xep_hang(long T, long D) {
        this.T = T;
        this.D = D;
    }

    public int CompareTo(xep_hang o) {
        if (this.T > o.T)
            return 1;
        else if (this.T < o.T)
            return -1;
        return 0;
    }
}

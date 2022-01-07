/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04001;

/**
 *
 * @author Admin
 */
import java.math.*;
public class Point {
    private double x1, x2, y1, y2, d, kq;
    public Point(float x1, float y1, float x2, float y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.d = (double) Math.sqrt(((this.x1 - this.x2) * (this.x1 - this.x2)) + ((this.y1-this.y2)*(this.y1-this.y2)));
        this.kq = Math.round(d*10000.0)/10000.0;
    }
    public String toString(){
        return String.format("%.4f",kq);
    }
}

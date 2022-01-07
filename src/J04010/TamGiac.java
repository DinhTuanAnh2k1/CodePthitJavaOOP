/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04010;

/**
 *
 * @author Admin
 */
import java.util.*;
public class TamGiac {
    private double x1, x2, x3, y1, y2, y3, a, b, c, dientich, bankinh, dientichhinhtron;
    public TamGiac(double x1, double y1, double x2, double y2, double x3, double y3){
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
        this.y1=y1;
        this.y2=y2;
        this.y3=y3;
        this.a = (double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        this.b = (double)Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        this.c = (double)Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
        this.dientich = 0.25*(double)Math.sqrt((this.a + this.b + this.c)*(this.a + this.b - this.c)*(this.a - this.b + this.c)*(-this.a + this.c + this.b));
        this.bankinh = (double)(this.a * this.b * this.c)/(4*this.dientich);
        this.dientichhinhtron = Math.PI*(double)(this.bankinh * this.bankinh);
    }
    public String toString(){
        if(ktr(this.a, this.b, this.c)==0){
            return String.format("INVALID");
        }
        else
            return String.format("%.3f", dientichhinhtron);
    }
    private int ktr(double c1, double c2, double c3){
        if(c1+c2<=c3) return 0;
        if(c1+c3<=c2) return 0;
        if(c2+c3<=c1) return 0;
        return 1;
    }
}

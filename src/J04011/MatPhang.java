/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04011;

/**
 *
 * @author Admin
 */
import java.util.*;
public class MatPhang {
    private int x1,x2,x3,x4,y1,y2,y3,y4,z1,z2,z3,z4,a1,a2,a3,b1,b2,b3,c1,c2,c3,m1,m2,m3,n1,n2,n3;
    private int ktr;
    public MatPhang(int x1,int y1,int z1,int x2,int y2,int z2,int x3,int y3,int z3,int x4,int y4,int z4){
        this.a1 = x2 - x1;
        this.a2 = y2 - y1;
        this.a3 = z2 - z1;
        this.b1 = x3 - x1;
        this.b2 = y3 - y1;
        this.b3 = z3 - z1;
        this.c1 = x4 - x1;
        this.c2 = y4 - y1;
        this.c3 = z4 - z1;
        this.m1 = this.a3 * this.b1 - this.a1 * this.b3;
        this.m2 = this.a1 * this.b2 - this.a2 * this.b1;
        this.m3 = this.a2 * this.b3 - this.a3 * this.b2;
        this.ktr = this.m1 * this.c1 + this.m2 * this.c2 + this.m3 * this.c3;
    }
    public String toString(){
        if(this.ktr!=0){
            return String.format("NO");
        }
        else{
            return String.format("YES");
        }
    }
}

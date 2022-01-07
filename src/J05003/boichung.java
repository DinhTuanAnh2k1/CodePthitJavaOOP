/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05003;

/**
 *
 * @author Admin
 */
import java.math.BigInteger;
import java.util.*;
public class boichung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            BigInteger c = a.multiply(b);
            System.out.println(c.divide(a.gcd(b)));
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellofile;

import java.io.*;
import java.util.*;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws IOException  { 
        Scanner in = new Scanner(new File("DATA.in"));
        while(in.hasNextLine()){
            System.out.println(in.nextLine());
        }
    }  
}

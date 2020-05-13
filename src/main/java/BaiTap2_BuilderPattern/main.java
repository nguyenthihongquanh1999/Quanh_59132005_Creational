/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2_BuilderPattern;

import BaiTap1_BuilderPattern.CTHD;
import java.text.ParseException;

/**
 *
 * @author USER
 */
public class main {
    public static void main(String[] args) throws ParseException {
        CTHD sanpham1 = new CTHD("Vo",5,5000,(float)0.8);
        CTHD sanpham2 = new CTHD("But",3,3000,(float)0.85);
        
        System.out.println(sanpham1);
        System.out.println(sanpham2);
    }
    
    
 }

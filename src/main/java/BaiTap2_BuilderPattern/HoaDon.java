/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2_BuilderPattern;

import BaiTap1_BuilderPattern.CTHD;
import BaiTap1_BuilderPattern.HoaDonHeader;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class HoaDon {
    HoaDonHeader header = new HoaDonHeader();
    ArrayList<CTHD> chitiet = new ArrayList<>();
    
       
    public String ThongTinHD(){
        String tt = "";
        for(int i = 0; i<chitiet.size();i++){
            tt  = "Ten san pham: " + chitiet.get(i).getTenSp()
                    + "So luong: " + chitiet.get(i).getSoLuong()
                    + "Don gia: " + chitiet.get(i).getDonGia()
                    + "Chiet khau: " + chitiet.get(i).getChietKhau();
        }
        return tt;
    }

  
}

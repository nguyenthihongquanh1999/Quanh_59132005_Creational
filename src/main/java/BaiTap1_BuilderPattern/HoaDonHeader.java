/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1_BuilderPattern;

import java.util.Date;

/**
 *
 * @author USER
 */
public class HoaDonHeader {
    String MaHD;
    String TenKH;
    Date NgayBan;

    public HoaDonHeader() {
    }

    public HoaDonHeader(String MaHD, String TenKH, Date NgayBan) {
        this.MaHD = MaHD;
        this.TenKH = TenKH;
        this.NgayBan = NgayBan;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public Date getNgayBan() {
        return NgayBan;
    }

    public void setNgayBan(Date NgayBan) {
        this.NgayBan = NgayBan;
    }
    
    
    
    
}

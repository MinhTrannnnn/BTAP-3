/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhangsieuthi;

import java.util.List;

/**
 *
 * @author Admin
 */
public class MatHangMua {
    private HoaDon hd;
    private int idmathangmua;
    private MatHang mh;
    private int soluong;

    public MatHangMua(HoaDon hd, int idmathangmua, MatHang mh, int soluong) {
        this.hd=hd;
        this.idmathangmua = idmathangmua;
        this.mh = mh;
        this.soluong = soluong;
    }
    
    public void ThemMatHangMuaCuaHoaDon(){
        hd.ThemHoaDon(this);
    }
    
    public double calTotal(){
        double tong=0.0;
        tong+=mh.getGia()*soluong;
        return tong;
    }
    
    @Override
    public String toString(){
        return "ID mat hang mua: "+ idmathangmua+" || Danh sach mh: "+ mh+" || So luong: "+soluong;
    }    
}

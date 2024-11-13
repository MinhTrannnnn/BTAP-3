/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhangsieuthi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDon {
    int idhoadon;
    KhachHang kh;
    String ngayban;
    float tongtien;
    private List<MatHangMua> danhSachMatHangMua;
    
    public HoaDon(int idhoadon, KhachHang kh, String ngayban) {
        this.idhoadon = idhoadon;
        this.kh = kh;
        this.ngayban = ngayban;
        this.danhSachMatHangMua = new ArrayList<>();
    }
    
    public void ThemHoaDon(MatHangMua x){
        danhSachMatHangMua.add(x);
    }
    
    public void tinhtonghoadon(){
        tongtien=0;
        for(MatHangMua x:danhSachMatHangMua){
            tongtien+=x.calTotal();
        }
    }
    
    public void InHoaDon() {
        System.out.println("ID Hoa Don: " + idhoadon);
        System.out.println("Khach Hang: " + kh.getTenkh());
        System.out.println("Ngay ban: " + ngayban);
        System.out.println("DS mat hang mua:");
        for (MatHangMua mh : danhSachMatHangMua) {
            System.out.println(mh);
        }
        System.out.println("Total: " + tongtien);
    }
}

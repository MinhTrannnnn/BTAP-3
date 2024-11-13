/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhangsieuthi;

/**
 *
 * @author Admin
 */
public class MatHang {
    private float gia;
    private int idmathang;
    private int soluong;
    private String tenmh;

    public MatHang(float gia, int idmathang, int soluong, String tenmh) {
        this.gia = gia;
        this.idmathang = idmathang;
        this.soluong = soluong;
        this.tenmh = tenmh;
    }
    
    public int getidmathang(){
        return idmathang;
    }
     
    public double getGia(){
        return this.gia;
    }
    
    public void ThemMatHangVaoKho(Kho kho){
        kho.add(this);
    }
    
    @Override
    public String toString(){
        return "ID mat hang "+ idmathang+ ", Ten mat hang: "+ tenmh+", Trong kho: "+soluong+", Price: "+gia;
    }    
}

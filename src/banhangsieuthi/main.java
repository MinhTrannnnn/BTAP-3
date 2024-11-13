/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhangsieuthi;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        // Thêm 3 mặt hàng có tên lần lượt X,Y,Z vào kho hàng:
        Kho kho = new Kho(); // Tạo kho dùng chung
        MatHang mh1=new MatHang(30, 001, 40, "X");
        MatHang mh2=new MatHang(40, 002, 20, "Y");
        MatHang mh3 = new MatHang(70, 003, 15, "Z");
        mh1.ThemMatHangVaoKho(kho);
        mh2.ThemMatHangVaoKho(kho);
        mh3.ThemMatHangVaoKho(kho);
//        System.out.println(kho);

        // Thêm 1 hóa đơn cho khách hàng Nguyễn Văn A biết rằng khách hàng này mua 2 mặt hàng có tên X, Y
        KhachHang kh=new KhachHang("Ha Dong, Ha Noi", 1, "Nguyen Van A");
        HoaDon hd=new HoaDon(1, kh, "13/11/2024");
        
        MatHangMua mhm1=new MatHangMua(hd, 1, mh1, 32);
        MatHangMua mhm2=new MatHangMua(hd, 2, mh2, 12);
        
        mhm1.ThemMatHangMuaCuaHoaDon();
        mhm2.ThemMatHangMuaCuaHoaDon();
        
        //  In ra thông tin hóa đơn cùng mặt hàng khách Nguyễn Văn A mua:
        hd.tinhtonghoadon();
        hd.InHoaDon();
    }
}

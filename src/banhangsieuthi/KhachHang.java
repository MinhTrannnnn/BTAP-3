/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhangsieuthi;

/**
 *
 * @author Admin
 */
public class KhachHang {
    String diachi;
    int idkhach;
    String tenkh;

    public KhachHang(String diachi, int idkhach, String tenkh) {
        this.diachi = diachi;
        this.idkhach = idkhach;
        this.tenkh = tenkh;
    }

    public int getIdkhach() {
        return idkhach;
    }

    public void setIdkhach(int idkhach) {
        this.idkhach = idkhach;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }
}

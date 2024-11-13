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
public class Kho {
    private List<MatHang> kho;
    public Kho(){
        kho=new ArrayList<>();
    }
    public void add(MatHang mh){
        kho.add(mh);
    }
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(MatHang x:kho){
            sb.append(x).append("\n");
        }
        return sb.toString();
    }
}

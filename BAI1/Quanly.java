/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;
import java.util.Scanner;
public class Quanly extends Nhanvien{
    private String chuyenmon;
    private double phucapchucvu;

    public Quanly() {
        this.chuyenmon="";
        this.phucapchucvu=0.0;
    }
    public Quanly(String manv,String tennv,String trinhdo,String chuyenmon,double phucapchucvu) {
        super(manv,tennv,trinhdo);
        this.chuyenmon = chuyenmon;
        this.phucapchucvu = phucapchucvu;
    }
    public String getchuyenmon() {
        return chuyenmon;
    }
    public double getphucapchucvu() {
        return phucapchucvu;
    }
    @Override
    public void nhap(){
        System.out.println("nhap thong tin Quan ly ");
        Scanner kb=new Scanner(System.in);
        super.nhap();
        System.out.println("nhap chuyen mon ");
        chuyenmon=kb.nextLine();
        System.out.println("nhap phu cap chuc vu ");
        phucapchucvu=kb.nextDouble();
    }
    @Override 
    public void xuat(){
        super.xuat();
        System.out.println("chuyen mon "+chuyenmon);
        System.out.println("phu cap chuc vu "+phucapchucvu);
    }
    @Override
    public double tinhluong(){
        return luongcb+phucapchucvu;
    }
}

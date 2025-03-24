/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;
import java.util.Scanner;
public class Nghiencuu extends Nhanvien{
    private String chuyenmon;
    private double phucapdochai;

    public Nghiencuu() {
        this.chuyenmon="";
        this.phucapdochai=0.0;
    }
    public Nghiencuu( String manv, String tennv, String trinhdo,String chuyenmon,double phucapdochai) {
        super(manv, tennv, trinhdo);
        this.chuyenmon = chuyenmon;
        this.phucapdochai = phucapdochai;
    }
    public String getChuyenmon() {
        return chuyenmon;
    }
    public double getPhucapdochai() {
        return phucapdochai;
    }
    @Override
    public void nhap(){
        System.out.println("nhap thong tin nghien cuu ");
        super.nhap();
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap chuyen mon ");
        chuyenmon=kb.nextLine();
        System.out.println("nhap phu cap doc hai ");
        phucapdochai=kb.nextDouble();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("chuyen mon "+chuyenmon);
        System.out.println("phu cap doc hai "+phucapdochai);
    }
    @Override
    public double tinhluong(){
        return luongcb+phucapdochai;
    }
}

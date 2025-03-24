/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;
import java.util.Scanner;
abstract class Nhanvien {
    protected String manv;
    protected String tennv;
    protected String trinhdo;
    protected double luongcb;
    
    public Nhanvien(){
        this.manv="";
        this.tennv="";
        this.trinhdo="";
        this.luongcb=0.0;
    }
    public Nhanvien(String manv, String tennv, String trinhdo) {
        this.manv = manv;
        this.tennv = tennv;
        this.trinhdo = trinhdo;
        this.luongcb=0.0;
    }
    public String getmanv() {
        return manv;
    }
    public String gettennv() {
        return tennv;
    }
    public String gettrinhdo() {
        return trinhdo;
    }
    public double getluongcb() {
        return luongcb;
    }
    public void setluongcb(double luongcb) {
        this.luongcb = luongcb;
    }
    public void nhap(){
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap ma nhan vien ");
        manv=kb.nextLine();
        System.out.println("nhap ten nhan vien ");
        tennv=kb.nextLine();
        System.out.println("nhap trinh do ");
        trinhdo=kb.nextLine();
        System.out.println("nhap luong co ban ");
        luongcb=kb.nextDouble();
    }
    public void xuat(){
        System.out.println("ma nhan vien "+manv+" ten nhan vien "+tennv+" trinh do "+trinhdo+" luong co ban "+luongcb);
    }
    public abstract double tinhluong();
}

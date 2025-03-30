/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5;
import java.util.Scanner;
public class Nhanvien extends Connguoi{
    private double luong;
    private String ngaynhanviec;
    private Phongkhoaban Phongkhoaban;
    
    public Nhanvien(){
        this.luong=0.0;
        this.ngaynhanviec=null;
        this.Phongkhoaban=null;
    }
    public Nhanvien(String hoten,double luong,String ngaynhanviec,Phongkhoaban Phongkhoaban){
        this.hoten=hoten;
        this.luong=luong;
        this.ngaynhanviec=ngaynhanviec;
        this.Phongkhoaban=Phongkhoaban;
    }
    public double getluong(){
        return luong;
    }
    public void setluong(double luong){
        this.luong=luong;
    }
    public String getngaynhanviec(){
        return ngaynhanviec;
    }
    public void setngaynhanviec(String ngaynhanviec){
        this.ngaynhanviec=ngaynhanviec;
    }
    public Phongkhoaban getPhongkhoaban(){
        return Phongkhoaban;
    }
    public void setPhongkhoaban(Phongkhoaban Phongkhoaban){
        this.Phongkhoaban=Phongkhoaban;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap luong ");
        luong=kb.nextDouble();
        kb.nextLine();
        System.out.println("nhap ngay nhan viec ");
        ngaynhanviec=kb.nextLine();
        this.Phongkhoaban=new Phongkhoaban();
        this.Phongkhoaban.nhap();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("luong : "+luong);
        System.out.println("ngay nhan viec : "+ngaynhanviec);
        Phongkhoaban.xuat();
    }
}

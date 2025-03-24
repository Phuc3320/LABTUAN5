/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;
import BAI1.Nhanvien;
import BAI1.Nghiencuu;
import BAI1.Quanly;
import BAI1.Phucvu;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        ArrayList<Nhanvien>dsnhanvien=new ArrayList<>();
        Quanly ql=new Quanly();
        ql.nhap();
        ql.xuat();
        System.out.println(ql.tinhluong());
        Nghiencuu nc=new Nghiencuu();
        nc.nhap();
        nc.xuat();
        System.out.println(nc.tinhluong());
        Phucvu pv=new Phucvu();
        System.out.println("nhap thong tin phuc vu ");
        pv.nhap();
        pv.xuat();
        System.out.println(pv.tinhluong());
        dsnhanvien.add(ql);
        dsnhanvien.add(nc);
        dsnhanvien.add(pv);
        System.out.println("\ndanh sach nhan vien ");
        for(Nhanvien nv:dsnhanvien){
            nv.xuat();
            System.out.println("luong "+nv.tinhluong());
        }
    }
}

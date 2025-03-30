/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5;
import BAI5.Connguoi;
import BAI5.Hocvien;
import BAI5.Nhanvien;
import BAI5.Phongkhoaban;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap thong tin hoc vien");
        Hocvien hv=new Hocvien();
        hv.nhap();
        System.out.println("nhap thong tin nhan vien");
        Nhanvien nv=new Nhanvien();
        nv.nhap();
        System.out.println("thong tin hoc vien ");
        hv.xuat();
        System.out.println("thong tin nhan vien ");
        nv.xuat();
    }
}

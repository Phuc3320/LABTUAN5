/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5;
import java.util.Scanner;
public class Hocvien extends Connguoi{
    private float diem1;
    private float diem2;
    private float diem3;

    public Hocvien() {
        this.diem1=0.0f;
        this.diem2=0.0f;
        this.diem3=0.0f;
    }
    public Hocvien(float diem1, float diem2, float diem3) {
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public Hocvien(String hoten, int namsinh,float diem1, float diem2, float diem3) {
        super(hoten, namsinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public float getDiem1() {
        return diem1;
    }
    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }
    public float getDiem2() {
        return diem2;
    }
    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }
    public float getDiem3() {
        return diem3;
    }
    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }
    @Override
    public void nhap() {
        super.nhap();
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap diem 1: ");
        this.diem1 = kb.nextFloat();
        System.out.print("Nhap diem 2: ");
        this.diem2 = kb.nextFloat();
        System.out.print("Nhap diem 3: ");
        this.diem3 = kb.nextFloat();
    }    
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Diem 1: " + diem1);
        System.out.println("Diem 2: " + diem2);
        System.out.println("Diem 3: " + diem3);
    }    
}

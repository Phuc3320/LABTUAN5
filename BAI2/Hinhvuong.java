/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;
import java.util.Scanner;
public class Hinhvuong implements Hinh{
    private float canh;

    public Hinhvuong() {
        this.canh=0.0f;
    }
    public Hinhvuong(float canh) {
        this.canh = canh;
    }
    @Override
    public void nhap(){
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap canh ");
        canh=kb.nextFloat();
    }
    @Override
    public void xuat(){
        System.out.println("hinh vuong");
        System.out.println("canh="+canh);
    }
    @Override
    public float tinhdientich(){
        return canh*canh;
    }
}

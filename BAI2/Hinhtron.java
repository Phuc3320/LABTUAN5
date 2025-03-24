/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;
import java.util.Scanner;
public class Hinhtron implements Hinh{
    private float bankinh;

    public Hinhtron() {
        this.bankinh=0.0f;
    }
    public Hinhtron(float bankinh) {
        this.bankinh = bankinh;
    }
    @Override
    public void nhap(){
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap thong tin hinh tron");
        System.out.println("nhap ban kinh ");
        bankinh=kb.nextFloat();
    }
    @Override
    public void xuat(){
        System.out.println("hinh tron");
        System.out.println("ban kinh="+bankinh);
    }
    @Override
    public float tinhdientich(){
        return pi*bankinh*bankinh;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;
import java.util.Scanner;
import java.util.Scanner;
public class Hinhchunhat implements Hinh{
    private float dai;
    private float rong;

    public Hinhchunhat() {
        this.dai=0.0f;
        this.rong=0.0f;
    }
    public Hinhchunhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }
    @Override
    public void nhap(){
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap thong tin hinh vuong");
        System.out.println("nhap chieu dai ");
        dai=kb.nextFloat();
        System.out.println("nhap chieu rong ");
        rong=kb.nextFloat();
    }
    @Override
    public void xuat(){
        System.out.println("hinh chu nhat");
        System.out.println("dai="+dai);
        System.out.println("rong="+rong);
    }
    @Override
    public float tinhdientich(){
        return dai*rong;
    }
}

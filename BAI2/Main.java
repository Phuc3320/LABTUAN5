/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;
import BAI2.Hinh;
import BAI2.Hinhchunhat;
import BAI2.Hinhtron;
import BAI2.Hinhvuong;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap so luong hinh ");
        int n=kb.nextInt();
        //kb.nextLine();
        Hinh ds[]=new Hinh[n];
        for(int i=0;i<n;i++){
            System.out.println("chon loai hinh");
            System.out.println("1.hinh vuong");
            System.out.println("2.hinh chu nhat");
            System.out.println("3.hinh tron");
            int chon;
            do{
                System.out.println("nhap lua chon");
                chon=kb.nextInt();
                switch(chon){
                    case 1:
                        ds[i]=new Hinhvuong();
                        ds[i].nhap();
                        break;
                    case 2:
                        ds[i]=new Hinhchunhat();
                        ds[i].nhap();
                        break;
                    case 3:
                        ds[i]=new Hinhtron();
                        ds[i].nhap();
                        break;
                    default:
                        System.out.println("ban phai chon 1 trong 3 loai tren");
                }
            }while(chon<1||chon>3);
        } 
        for(Hinh hinh:ds){
            hinh.xuat();
            System.out.println("dien tich="+hinh.tinhdientich());
        }
        Hinh hinhdtln=ds[0];
        for(Hinh hinh:ds){
            if(hinh.tinhdientich()>hinhdtln.tinhdientich()){
                hinhdtln=hinh;
            }
        }
        System.out.println("hinh co dien tich lon nhat");
        hinhdtln.xuat();
    }
}

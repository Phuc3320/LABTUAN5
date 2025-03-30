/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5;
import java.util.Scanner;
public class Phongkhoaban {
    private String maphongkhoaban;
    private String tenphongkhoaban;

    public Phongkhoaban() {
        this.maphongkhoaban = "";
        this.tenphongkhoaban = "";
    }    

    public Phongkhoaban(String maphongkhoaban, String tenphongkhoaban) {
        this.maphongkhoaban = maphongkhoaban;
        this.tenphongkhoaban = tenphongkhoaban;
    }
    public String getmaphonkhoagban(){
        return maphongkhoaban;
    }
    public void setmaphongkhoaban(){
        this.maphongkhoaban=maphongkhoaban;
    }
    public String gettenphongkhoaban(){
        return tenphongkhoaban;
    }
    public void settenphongkhoaban(){
        this.tenphongkhoaban=tenphongkhoaban;
    }
    public void nhap(){
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap ma phong khoa ban ");
        maphongkhoaban=kb.nextLine();
        System.out.println("nhap ten phong khoa ban ");
        tenphongkhoaban=kb.nextLine();
    }
    public void xuat(){
        System.out.println("ma phong khoa ban : "+maphongkhoaban);
        System.out.println("ten phong khoa ban : "+tenphongkhoaban);
    }
}

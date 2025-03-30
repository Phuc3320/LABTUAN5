/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5;
import java.util.Scanner;
public class Connguoi {
    protected String hoten;
    protected int namsinh;
    public Connguoi() {
        this.hoten = "";
        this.namsinh = 0;
    }
    public Connguoi(String hoten, int namsinh) {
        this.hoten = hoten;
        this.namsinh = namsinh;
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoten = scanner.nextLine();
        System.out.print("Nhap nam sinh: ");
        this.namsinh = scanner.nextInt();
    }

    public void xuat() {
        System.out.println("Ho ten: " + hoten);
        System.out.println("Nam sinh: " + namsinh);
    }   
}

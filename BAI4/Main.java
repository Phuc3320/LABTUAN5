/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4;
import BAI4.Movable;
import BAI4.MovableCircle;
import BAI4.MovablePoint;
public class Main {
    public static void main(String[] args) {
        System.out.println("nhap thong tin hinh tron");
        MovableCircle circle=new MovableCircle(0,0,0,0,0);
        circle.nhap();
        System.out.println("vi tri ban dau "+circle.toString());
        circle.moveUp();
        System.out.println("sau khi di chuyen len"+circle.toString());
        circle.moveDown();
        System.out.println("sau khi di chuyen xuong"+circle.toString());
        circle.moveLeft();
        System.out.println("sau khi di chuyen sang trai"+circle.toString());
        circle.moveRight();
        System.out.println("sau khi di chuyen sang phai"+circle.toString());
    }
}

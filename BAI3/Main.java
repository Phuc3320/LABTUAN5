/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;
import BAI3.Shape;
import BAI3.Circle;
import BAI3.Rectangle;
import BAI3.Square;
public class Main {
    public static void main(String[] args) {
        Circle tron=new Circle(5,"blue",true);
        Rectangle hcn=new Rectangle(4,6,"green",false);
        Square hv=new Square(3,"yellow",true);
        System.out.println("thong tin hinh tron");
        tron.toString();
        System.out.println("thong tin hinh chu nhat");
        hcn.toString();
        System.out.println("thong tin hinh vuong");
        hv.toString();
        System.out.println("kiem tra equals");
        System.out.println("Circle va Rectangle co bang nhau khong "+tron.equals(hcn));
        System.out.println("Rectangle va Square co bang nhau khong "+hv.equals(hv));
    }
}

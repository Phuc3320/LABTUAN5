/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4;
import java.util.Scanner;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius) {
        this.center=new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public MovablePoint getCenter() {
        return center;
    }
    public void setCenter(MovablePoint center) {
        this.center = center;
    }
    public void nhap(){
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap center");
        center.nhap();
        System.out.println("nhap ban kinh ");
        radius=kb.nextInt();
    }
    @Override
    public String toString(){
        return "hinh tron tai "+center.toString()+" ban kinh="+radius;
    }
    @Override
    public void moveUp(){
        center.moveUp();
    }
    @Override
    public void moveDown(){
        center.moveDown();
    }
    @Override
    public void moveLeft(){
        center.moveLeft();
    }
    @Override
    public void moveRight(){
        center.moveRight();
    }
}

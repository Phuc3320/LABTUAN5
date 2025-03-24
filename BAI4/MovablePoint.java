/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4;
import java.util.Scanner;
public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public int getx() {
        return x;
    }
    public void setx(int x) {
        this.x = x;
    }
    public int gety() {
        return y;
    }
    public void sety(int y) {
        this.y = y;
    }
    public int getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
    public int getySpeed() {
        return ySpeed;
    }
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void nhap(){
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap x");
        x=kb.nextInt();
        System.out.println("nhap y");
        y=kb.nextInt();
        System.out.println("nhap xSpeed");
        xSpeed=kb.nextInt();
        System.out.println("nhap ySpeed");
        ySpeed=kb.nextInt();
    }
    @Override
    public String toString(){
        return +x+y+" speed="+xSpeed+ySpeed;
    }
    @Override 
    public void moveUp(){
        y-=ySpeed;
    }
    @Override 
    public void moveDown(){
       y += ySpeed;
    }
    @Override
    public void moveLeft(){
        x -= xSpeed;
    }
    @Override
    public void moveRight(){
       x += xSpeed;
    }    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

/**
 *
 * @author khoav
 */
public class Circle extends Shape{
    private double radius;

    public Circle() {
        this.radius=0.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getradius() {
        return radius;
    }
    public void setradius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getarea(){
        return 3.14*radius*radius;
    }
    @Override
    public double getperimeter(){
        return 2*3.14*radius;
    }
    @Override 
    public String toString(){
        return "Hinh tron ban kinh="+radius+" mau "+color+" filled "+isfilled();
    }
}

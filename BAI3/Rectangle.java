/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;
public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        this.width=0.0;
        this.length=0.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length,String color,boolean filled) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    public double getwidth() {
        return width;
    }
    public void setwidth(double width) {
        this.width = width;
    }
    public double getlength() {
        return length;
    }
    public void setlength(double length) {
        this.length = length;
    }
    @Override
    public double getarea(){
        return width*length;
    }
    @Override
    public double getperimeter(){
        return 2*(width*length);
    }
    @Override
    public String toString(){
        return "hinh chu nhat dai="+length+" rong="+width+" mau "+color+" filled "+isfilled();
    }
}

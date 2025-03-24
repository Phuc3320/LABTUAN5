/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

/**
 *
 * @author khoav
 */
abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color="red";
        this.filled=true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getcolor() {
        return color;
    }
    public void setcolor(String color) {
        this.color = color;
    }
    public boolean isfilled() {
        return filled;
    }
    public void setfilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getarea();
    public abstract double getperimeter();
    public abstract String toString();
    @Override
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null||getClass()!=obj.getClass())return false;
        Shape shape=(Shape)obj;
        return filled=shape.filled&&color.equals(shape.color);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

/**
 *
 * @author khoav
 */
public class Square extends Rectangle{

    public Square() {
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getside(){
        return getwidth();
    }
    public void setside(double side){
        setwidth(side);
        setlength(side);
    }
    @Override
    public void setwidth(double width){
        setside(width);
    }
    @Override
    public void setlength(double length){
        setside(length);
    }
    @Override
    public String toString() {
        return "Square "+getside()+","+super.toString();
    }
}

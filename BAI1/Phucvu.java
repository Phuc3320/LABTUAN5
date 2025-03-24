/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;
public class Phucvu extends Nhanvien{

    public Phucvu() {
    }
    public Phucvu(String manv, String tennv, String trinhdo) {
        super(manv, tennv, trinhdo);
    }
    @Override
    public double tinhluong(){
        return luongcb;
    }
}

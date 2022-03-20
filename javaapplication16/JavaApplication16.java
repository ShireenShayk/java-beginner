/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication16;

/**
 *
 * @author SHEIKH
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
A obj=new A();
obj.cir(2);
obj.sq(2);

// TODO code application logic here
    }
        
}  

interface area_peri{
    void cir(int r);
    void sq(int s);

}
class A implements area_peri{
    public void cir(int r){
    System.out.println("area:"+(3*r*r));
    System.out.println("area:"+(3*2*r));
    }
public void sq(int r){
    System.out.println("area:"+(r*r));
    System.out.println("peri:"+(4*r));
    }
}
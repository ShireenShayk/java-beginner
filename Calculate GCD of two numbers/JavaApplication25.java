/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication25;

/**
 *
 * @author SHEIKH
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
gcd obj=new gcd();
System.out.println(obj.gcdcal(492,248));
System.out.println(obj.gcdcal(248,492));// TODO code application logic here*/
        
  int x=10,y=20,z=30;
  x=x+y+z;
  y=x-y-z;
  z=x-y-z;
  x=x-y-z;
  System.out.println(x+"\t"+y+"\t"+z);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
/*class gcd{
public int gcdcal(int num1,int num2){
  
    if (num2<num1 && num2!=0){
         return gcdcal(num2, num1 % num2);
      }
    else if(num2>num1 && num1!=0)
        return gcdcal(num2,num1);
    else 
    {
         return num1;
    }
    
}



}*/
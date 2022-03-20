/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dft;
import java.lang.Math.*;
import java.util.*;
/**
 *
 * @author SHEIKH
 */
public class Dft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("enter N");
            int N=s.nextInt();
            number[] x=new number[N];
            number[] X=new number[N];
      //      double[] Ximg=new double[N];
            System.out.println("enter input elements");
            for(int i=0;i<N;i++){
                x[i]=new number();
                x[i].real=s.nextInt();
                 x[i].img=s.nextInt();
            
            }
            
           for(int k=0;k<N;k++){
               
               X[k]=new number();
               X[k].real=0;
                for(int n=0;n<N;n++){
                     
                    X[k].real+=( ( x[n].real*Math.cos((2*k*n*Math.PI)/N) )+(x[n].img*Math.sin((2*k*n*Math.PI)/N)));
                    X[k].img+= ( (x[n].img*Math.cos((2*k*n*Math.PI)/N)) -( x[n].real*Math.sin((2*k*n*Math.PI)/N)  ));
            
            }
           }

                  
        /*   for(int i=0;i<N;i++){
                System.out.println(((100.0*Xreal[i])/100.0)+"+j"+"("+((100.0*Ximg[i])/100.0)+")");
            
            
           }*/
          for(int i=0;i<N;i++){
                System.out.println(Math.round(X[i].real)+"+j"+"("+Math.round(X[i].img)+")");
          }
// TODO code application logic here
    }
    
}
class number{
    double real,img;
    

}
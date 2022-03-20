/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.*;

/**
 *
 * @author SHEIKH
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        another o = new another();
   //     o.display1d();
       o.display2d();
        // TODO code application logic here
       //  o.display3d();
    
        
    }

}

class another {

    void display1d() 
    {
        int[] a = new int[5];
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("enter elements(5)");
        for (i = 0; i < 5; i++)
        
            a[i] = s.nextInt();
        
        for (i = 0; i < 5; i++) 
            System.out.print(a[i]);
        

    }

    void display2d() {
        Scanner s=new Scanner(System.in);
         System.out.println("enter r1,c1");
        int r1=s.nextInt();
         int c1=s.nextInt();
         System.out.println("enter r2,c2");
          int r2=s.nextInt();
           int c2=s.nextInt();
        int[][] a= new int[r1][c1];
        int[][] b= new int[r2][c2];
         int[][] c= new int[r1][c2];
        int i, j;
       
        System.out.println("enter elements");
        for (i = 0; i < r1; i++)
        {
            for (j = 0; j < c1; j++) 
                a[i][j] = s.nextInt();
            
        }
        System.out.println("enter elements");
        for (i = 0; i < r2; i++)
        {
            for (j = 0; j < c2; j++) 
                b[i][j] = s.nextInt();
            
        }
        for (i = 0; i <r1; i++)
        {
            for (j = 0; j < c2; j++) 
            {
                for(int k=0;k<r2;k++)
                    c[i][j]+=( a[i][k]*b[k][j] );
            
            }
            
        }

         for (i = 0; i < r1; i++)
         {
            for (j = 0; j < c2; j++) 
            {
                 System.out.print("\t"+c[i][j]);
            }
             System.out.println();
        }

    }
    void display3d() {
        int[][] a= new int[3][3];
        int[][] b= new int[3][3];
         int[][] c= new int[3][3];
        int i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("enter elements");
        for (i = 0; i < 3; i++)
        {
            for (j = 0; j <3; j++) 
                a[i][j] = s.nextInt();
            
        }
        System.out.println("enter elements");
        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++) 
                b[i][j] = s.nextInt();
            
        }
        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++) 
            {
                for(int k=0;k<3;k++)
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
            
            }
            
        }

         for (i = 0; i < 3; i++)
         {
            for (j = 0; j < 3; j++) 
            {
                 System.out.print("\t"+c[i][j]);
            }
             System.out.println();
        }

    }
    

    
    
   }

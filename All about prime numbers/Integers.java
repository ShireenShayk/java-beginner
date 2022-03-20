/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package integers;
import java.util.*;
/**
 *
 * @author SHEIKH
 */
public class Integers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       /*                     int i,n,flag=0;
        System.out.println("enter a number");
        Scanner s=new Scanner (System.in);
        n=s.nextInt();
        
        for(i=2; i<= n/2; i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
       if (flag==1)
           System.out.println("not prime");
       else
           System.out.println("prime");
         
    // TODO code application logic here                    */
      
    System.out.println("enter a number");
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();   
        
        int c=0;                           //counting no. of digits.
        int temp = n;
        while(n>0){
            c++;
            n=n/10;
        }
       
        for(int i=0; i<c; i++)
        {
            int r=temp%10;
                if( r==2 || r==3 || r==5 || r==7)
                    System.out.println(r + "prime");
                else
                    System.out.println(r + "not prime");
            temp=temp/10;
        }  
    }
}
// prime no.s display
/*      int n,i;
        System.out.print("prime no.s b/w 1 and 100"+" "+2);
        n=3;
         while(n<100)
         {
                int flag=0;
             for(i=2;i<=n/2;i++)
             {
                 if(n%i==0)
                 {
                    flag=1;
                    break;
                 }
                
             }
            if(flag==0)  
                System.out.print(" "+n);
            n=n+1;
            
         }*/
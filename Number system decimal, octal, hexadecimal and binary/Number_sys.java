/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package number_sys;
import java.util.*;

import static java.lang.Math.*;
/**
 *
 * @author SHEIKH
 */
public class Number_sys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Conversion o=new Conversion();
        System.out.println("enter [1] for decimal input\n[2]for binary input\n [3]for octal input \n[4]for hexadecimal input");
        int ch=s.nextInt();
        
       if(ch==1){
        System.out.println("enter no. in decimal");  
        int nd=s.nextInt();
        
        System.out.println("dec to bin");   
        o.dec_bin(nd);
     
       System.out.println("\ninto hexadecimal");       //bin-hex
       o.dec_hex(nd);
     
       System.out.println("\ninto octal");
       o.dec_oct(nd);
       }
       
       else if(ch==2){
       System.out.println("enter binary no.");
       String bin_in=s.next();
       int n=Integer.parseInt(bin_in);
       
       System.out.print("Into decimal:"); 
       int x=o.bin_dec(n);
       System.out.println(x);
       
       System.out.print("\nInto octal:");
       o.dec_oct(x);
      
       System.out.print("\ninto hexadecimal:");
       o.dec_hex(x);
       }
       
       else if(ch==3){
       System.out.println("enter octal no.");
       String oct_in=s.next();
       int n=Integer.parseInt(oct_in);
       
       System.out.print("Into decimal:"); 
       int x=o.oct_dec(n);
       System.out.println(x);
       
       
       System.out.print("\nInto binary:");
       o.dec_bin(x);
      
       System.out.print("\ninto hexadecimal:");
       o.dec_hex(x);
       }
       
       
       else if(ch==4){
       
        System.out.println("enter hexadecimal no.");
       String hex_in=s.next();
       
       System.out.print("Into decimal:"); 
       int x=(int) o.hex_dec(hex_in);
       System.out.println(x);
       
       
       System.out.print("\nInto binary:");
       o.dec_bin(x);
      
       System.out.print("\ninto octal:");
       o.dec_oct(x);
       }
// TODO code application logic here
    }
}
class Conversion{
    
    void dec_bin(int nd){
        int[] a=new int[100];
        int i=0;
        while(nd!=0){
            a[i]=nd%2;
            nd=nd/2;
            i++;
         }
        for(int j=i-1;j>=0;j--){
            System.out.print(a[j]);
        }
    }
    void dec_oct(int nd){
         int[] a=new int[100];
         int i=0;
          while(nd!=0){
            a[i]=nd%8;
            nd=nd/8;
            i++;
         }
           for(int j=i-1;j>=0;j--){
            System.out.print(a[j]);
        }
      
    }
     
    int bin_dec(int n){
        int result=0;
        int i=0;
        while(n!=0){
            result= (int) (result+((n%10)*Math.pow(2,i)));
            n=n/10;
            i++;
        }
        return result;
    }
    int oct_dec(int n){
        int result=0;
        int i=0;
        while(n!=0){
            result= (int) (result+((n%10)*Math.pow(8,i)));
            n=n/10;
            i++;
        }
        return result;
    }
    int hex_dec(String n){
        int result=0;
        int b=0;
        for(int i=(n.length())-1;i>=0;i--){
            if (n.charAt(i) >= '0' && n.charAt(i) <= '9') 
            { 
                result=(int) (result  + (n.charAt(i) - 48)*(Math.pow(16,b))); 
                b=b+1; 
            } 
            
             else if (n.charAt(i) >= 'A' && n.charAt(i) <= 'F') 
            { 
                result= (int) (result + (n.charAt(i) - 55)*(Math.pow(16,b))); 
                b=b+1;
                
            }
        }
        return result;
    }
    void dec_hex(int n){
        int temp;
        char[] hex=new char[25];
        int i=0;
        while(n!=0){    
            temp=n%16;
            if(temp<10){
                hex[i]=(char) (temp+48);
                i++;
            }
            else {
                hex[i]=(char) (temp+55);
                i++;
            }
        n=n/16;       
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(hex[j]);
        }
    }
}
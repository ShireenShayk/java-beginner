/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication8;
import java.util.*;
/**
 *
 * @author SHEIKH
 */
public class Teacher_perform {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
    
        System.out.println("enter no. of teachers");
        Scanner s=new Scanner(System.in);
          int n=s.nextInt();
         
           performance[]  p = new performance[n];
          for(i=0;i<n;i++)
          {     
              p[i]=new performance();
          p[i].details();
         p[i].evaluate();
          p[i].display();
          
          }
// TODO code application logic here
    }
    
}
class Teacher{
    String name,sub,cl;
    
    int i,n;
    void details()
    {
    Scanner s=new Scanner(System.in);
    System.out.println("enter name,class and subject");

    name=s.nextLine();
    sub=s.next();
    cl=s.next();
 /*   
    System.out.println("enter no. of subjects");
    n=s.nextInt();
    String[] sub=new String[n];
    for(i=0;i<n;i++)
    {
        sub[i]=new String();
         System.out.println("enter name of subject"+(i+1));    
        
        sub[i]=s.next();
     }*/
    }
}
class performance extends Teacher
{
    char grade;
    int t;
    double pp,p;
    void evaluate(){
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter no. of students present");
         t=s.nextInt();
        System.out.println("enter no. of students passed");
         p=s.nextDouble();
         
         pp=((p/t)*100);
        if(pp>=85.0)
            grade='A';
        else if(pp<85 || pp>75)
            grade='B';
        else if(pp<75 || pp>60)
            grade='C';
        else 
            grade='D';
    
    }
    void display(){
        System.out.println("name:"+name+"\tsubject:"+sub+"\tclass:"+cl+"\ttotal:"+t+"\tno. passed"+(int)p+"\tgrade:"+grade);
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scope;

import java.util.Scanner;

/**
 *
 * @author SHEIKH
 */
public class Scope {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
         
        Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       Student[] s2=new Student[n];
   for(int i=0;i<n;i++){
   s2[i]=new Student();
   s2[i]=s2[i].update();
   
   
   
   
   
   
   }       
       Student so=new Student();
       so.sort(s2);
     
    }
   
}

class Student{
String name;
int roll;
Student update()
    {
            Scanner s=new Scanner(System.in);
            System.out.println("enter name");
            name=s.next();
            System.out.println("enter roll");
           
          roll=s.nextInt();
          return this;
    }

void sort(Student[] s1){


int n=s1.length;
 for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               if(s1[i].roll>s1[j].roll){
                   Student c;
                   c = s1[i];
                   s1[i]=s1[j];
                   s1[j]=c;
               
               }
           }
       } 

 for(int i=0;i<n;i++){
     
         System.out.print(s1[i]+"\t");
     }









}








}
 
 

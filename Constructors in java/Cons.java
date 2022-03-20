/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cons;
import java.util.*;
/**
 *
 * @author SHEIKH
 */
public class Cons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r,a;
        String n;
        Scanner s1=new Scanner(System.in);
        System.out.println("enter no. of students");
        int ns=s1.nextInt();
          //  String[] n=new String[ns];
        //int[] r=new int[ns]; 
        //int[] a=new int[ns]; 
            students[]  s = new students[ns];
        for(int i=0;i<ns;i++)
        {
               
             System.out.println("enter name");
             n=s1.next();
             System.out.println("enter rollno");
             r=s1.nextInt();
             System.out.println("enter age");
              a=s1.nextInt();
             
            
             s[i]=new students();
            
             s[i]=new students(r,n,a);
             s[i].display();
             s[i]=new students(r,n);
             s[i].display();
      
        }
    
      
         System.out.println("copy cntrs");
      
        s[2]=new students(s[1]);
        s[2].display();
        
    }
    
}

class students
{
int roll,age;
String name;
students()
{
    System.out.println("default const");

}
students(int roll,String name)
{
    this.roll=roll;
    this.name=name;

}
students(int roll,String name,int age)
{
    this.roll=roll;
    this.name=name;
    this.age=age;
}
students(students c)
{
    roll=c.roll;
    name=c.name;
    
}
void display()
{
    System.out.println(roll+" "+name+" "+age);
}




}
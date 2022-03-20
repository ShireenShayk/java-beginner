/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;

/**
 *
 * @author SHEIKH
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*int n,temp,r,sum=0;
       String st;
Scanner s=new Scanner(System.in);
Scanner s1=new Scanner(System.in);
System.out.println("enter a number");
n=s.nextInt();
temp=n;
System.out.println("reverse no. is"+sum);
if(temp==sum)
System.out.println("palindrome");
else
System.out.println("not palindrome");  


//string testing*/


String s=new String("Madam");
//String r=new String();
int l=s.length();
/*for(int i=l-1;i>=0;i--)
    r=r+s.charAt(i);
if(r.equalsIgnoreCase(s))
    System.out.println("palindrome"+" "+r);*/
for(int i=0;i< l;i++){
if(s.charAt(i)==s.charAt(l-1-i))
    System.out.println("palindrome");
else 
System.out.println("not palindrome");
}
 // TODO code application logic here
    }
    
}

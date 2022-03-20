/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interthread;
import java.lang.*;
/**
 *
 * @author SHEIKH
 */
public class Interthread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Customer c=new Customer();
         new Thread(){
   
           public void run(){
               c.withdraw(15000);
           }
         }.start();
        new Thread(){

           public void run(){
               c.deposit(10000);
           }
       }.start();// TODO code application logic here
    }
    
}
class Customer{
    int amount=10000;   
    synchronized void withdraw(int amount){
       // System.out.println("going to withdraw...");
    if(this.amount<amount){
        System.out.println("Less balance; waiting for deposit...");
        try{
            wait();
        }
        catch(Exception e){
            
        }
    } 
    this.amount-=amount;
    System.out.println("withdraw completed...");
    } 
    synchronized void deposit(int amount){
        System.out.println("going to deposit...");
        this.amount+=amount;
        System.out.println("deposit completed... ");
        notify();
    } 
}
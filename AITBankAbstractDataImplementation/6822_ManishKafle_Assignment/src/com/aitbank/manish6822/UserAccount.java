/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aitbank.manish6822;

import java.util.Scanner;

/**
 *
 * @author k4fledmanish
 */

abstract class UserAccount
    {    
    
    
    public int amount;
    public Scanner sc = new Scanner(System.in); // this scans the input from user. Scanner imported from java.util class.
    public double balance ;
    public double withDrawLimit;
    public double interest;
    public String user;
    public boolean withdrawBefore = true;

   
    
    
    abstract public double callInterest();
    // This prints out the receipt after transaction performed
    public void receipt()
    {
        System.out.println("           _____________________________________________           \n ");
        System.out.println("                              Receipt                                ");
        System.out.println("           _____________________________________________            \n");
        
        System.out.println("\t     You have: " + balance + " in your bank account.");
        System.out.println("\t     The calculated interest is: " + interest + ".");
        System.out.println("\t     The balance after interest is: " + (balance - interest)+ ".");
        System.out.println("\t     Your current Balance is: " + (balance - interest - amount)+".\n");
        
    }
    
    // This shows the cash of 20s, 50s, 100s to take after withdraw.
    
    public void Withdrawal()
    {
        
        if (amount % 10 == 0){            
            if ( amount % 100 == 0)
            {
                receipt();
                System.out.println("\t            Please take " + (amount/100) + " 100s notes");
            } else if (amount % 50 == 0){
                receipt();
                System.out.println("\t            Please take " + (amount/50) + " 50s notes");
            } else if (amount % 20 == 0){
                receipt();
                System.out.println("\t            Please take " + (amount/20) + " 20s notes");   
            }
            
        } 
        else 
        {

        System.out.println("           _____________________________________________           \n ");
        System.out.println("             Please enter correct amount. Try Again !                ");
        System.out.println("           _____________________________________________            \n");         
        }
    }
}

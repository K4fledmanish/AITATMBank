/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aitbank.manish6822;
import java.util.*;
/**
 *
 * @author k4fledmanish
 */

public class AITBank {
    
    
    static int amount;
    static Scanner sc = new Scanner(System.in); // this scans the input from user. Scanner imported from java.util class.
    static double balance = 500000.00;
    static double withDrawLimit = 5000.00;
    static double interest;
    static String user;
    static boolean withdrawBefore = true;
    
    public static void main(String[] args) {
        
        UserAccount ua = new UserAccount() {
           @Override
           public double callInterest() {return 0;}
        };

        
    // Creating a simple Command based UI for the ATM System 
    
        System.out.println("           _____________________________________________           \n ");
        System.out.println("                       Welcome to AIT Bank                          ");
        System.out.println("           _____________________________________________            \n");
        
        
    // Setting up and Using switch case to choose between different types of accounts for transaction 
        
        System.out.print("  Please choose your Account type by entering the dedicated number    \n\n");
        System.out.println("1.Saving Account\n2.Net Savers Account \n3.Cheque Account\n4.Fixed Account");
  
     
        int Acct=0;
        Acct = sc.nextInt();
        
        int withdraw;
        
    // Savings Account
        
            switch (Acct) {
                case 1:
                        System.out.println("           _____________________________________________           \n ");
                        System.out.println("                       AIT Bank Savings Account                       ");
                        System.out.println("           _____________________________________________            \n");
                        
                        SavingsAccount sa = new SavingsAccount();
                    
                    interest = sa.callInterest();
                    
    //Savings account lets you to withdraw and change the withdraw limits. So, it has been set here.
                    
                    do{
                        System.out.println("Please chose the option by entering the number: \n\n1) To Withdraw Amount \n2) To change the Amount Withdraw Limit.");
                        
                       
                       // this checks the user input and redirects according to the user input. 
                        withdraw = sc.nextInt();
                        
                        if(withdraw == 1 ){
                            System.out.print("Please enter the amount: ");
                            amount = sc.nextInt();
                            
                                if (amount <= withDrawLimit){
                                        ua.Withdrawal();
                                    } else {
                                        System.out.println("The withdraw amount exceeds the maximum limit. Please check withdraw limit and try again.");
                                    }
                                
                                        break;
                                        
                                     } else if (withdraw == 2){
                            
                                        withDrawLimit = sa.diffLimit();
                                        System.out.println("Your amount has been changed to $" + withDrawLimit);
                                        System.out.print("Would you like to continue and withdraw money? (Y/N)\n");
                                        
                                        user = sc.next();
                                        
                                            if (user.equals("Y") || user.equals("y")){
                                                System.out.println("Yes\n");
                                            } else if (user.equals("N") || user.equals("n")){
                                                
                                            break;
                                            
                                            }       
                                 } else {
                                         System.out.println("You have to enter correct option else the sum is more than the withdrawal limit");
                                 }
                    }
                    
                    while (withdraw != 0);
                    
                    break;
                  
                    
        // Net Saver Account        
                    
                case 2:
                        System.out.println("           _____________________________________________           \n ");
                        System.out.println("                   AIT Bank Net Savers Account                       ");
                        System.out.println("           _____________________________________________            \n");
                    
                    NetSaverAccount na = new NetSaverAccount();
                    
                    interest = na.callInterest();
                    
                    
                    
                    do{
                        System.out.print("Please enter the amount: ");
                        amount = sc.nextInt();
                        if(amount<=withDrawLimit){
                            na.Withdrawal();
                            break;
                        } else {
                            System.out.println("The amount is more than withdrawal limit.");
                            System.out.println("Would you like to get another amount? (Y/N)");
                            user = sc.next();

                        }
                    }while( user.equals("Y")  || user.equals("y"));
                        break;
                case 3:
                        System.out.println("           _____________________________________________           \n ");
                        System.out.println("                   AIT Bank Cheque Account                       ");
                        System.out.println("           _____________________________________________            \n");
                    
                    ChequeAccount ca = new ChequeAccount();
                    
                    System.out.print("Please enter the amount: ");
                    amount = sc.nextInt();
                    
                    ca.Withdrawal();
                    
                    break;
                    
            // Fixed Account              
                    
                case 4:
                        System.out.println("           _____________________________________________           \n ");
                        System.out.println("                   AIT Bank Fixed Account                       ");
                        System.out.println("           _____________________________________________            \n");
                    
                    FixedAccount fa = new FixedAccount();
                    
                    System.out.print("Please enter the amount: ");
                    amount = sc.nextInt();
                    interest = fa.callInterest();
                    fa.Withdrawal();
                    System.out.println("\n\t           Calculated Interest is " + interest);
                    
                    
                    break;
                    
                    
                    // If user inputs wrong amount
                    
                default:
                    
                    System.out.println("Please choose correct account. Try Again !");
            }
            
                        System.out.println("           _____________________________________________           \n ");
                        System.out.println("                  Thank you for using our service !                  ");
                        System.out.println("           _____________________________________________            \n");
                           
    }
}

   

        

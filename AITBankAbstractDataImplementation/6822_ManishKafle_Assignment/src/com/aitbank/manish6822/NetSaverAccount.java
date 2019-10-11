/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aitbank.manish6822;

/**
 *
 * @author k4fledmanish
 */
public class NetSaverAccount extends UserAccount {
    
    
    // Change the new amount withdrawl limit
    
    public double changeLimit()
    {
        System.out.println("Please enter new withdrawal limit: ");
        withDrawLimit=sc.nextInt();
        return withDrawLimit;
    }

    @Override
    public double callInterest() {
        interest=(balance *1.2)/100.00;
        return interest;
    }
    
    
}



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
public class FixedAccount extends UserAccount {
    
    
    //overriding
    @Override
    public double callInterest() {
        if(withdrawBefore == false)
        {
            interest=(balance*1.1)/100.00;
        }
        else
        {
            interest=0;
        }
        return interest;
    }
    
    
}


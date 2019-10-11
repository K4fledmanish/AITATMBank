/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.aitbankatm.Manishkafle6822;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author k4fledmanish
 */

public class ChequeAccount extends PersonalAccount{
 
    static JFrame chqacc = new JFrame("CHEQUE ACCOUNT");
    static JLabel Title = new JLabel("Your Cheque Account");
    static JLabel TypeAc = new JLabel("This is your Cheque");
  
    //This is a methods of cheque class
  
    public void funcCheq()
    {
        Title.setBounds(100, 10, 400, 20);
      
        accountNum.setBounds(60, 40, 300, 20);
        accType.setBounds(60, 70, 300, 20);
        accCurrentBalance.setBounds(60, 100, 300, 20);
        accAmountAvailable.setBounds(60, 130, 300, 20);
        
       
        accountNum.setBounds(200, 40, 200, 20);
        TypeAc.setBounds(200, 70, 200, 20);
        currentBalance.setBounds(200, 100, 200, 20);
        currentBalance.setText("$10000");
        availableFromDate.setBounds(200, 130, 200, 20);
       
        chqacc.add(Title);
        chqacc.add(accountNum);
        chqacc.add(TypeAc);
        chqacc.add(currentBalance);
        chqacc.add(availableFromDate);
        
       
        chqacc.add(accountNum);
        chqacc.add(TypeAc);
        chqacc.add(currentBalance);
        chqacc.add(availableFromDate);
       
        chqacc.setSize(500, 500);
        chqacc.setLayout(null);
        chqacc.setVisible(true);
        chqacc.setLocationRelativeTo(null);
       
      
    }
}
    
    
 





 

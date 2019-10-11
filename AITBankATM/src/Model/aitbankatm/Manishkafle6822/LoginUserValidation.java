/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.aitbankatm.Manishkafle6822;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;


/**
 *
 * @author k4fledmanish
 */

public class LoginUserValidation extends JFrame implements ActionListener
{
    
    JFrame AITBank = new JFrame("AIT Bank ATM");
    
    JLabel Title = new JLabel("Welcome to AIT Bank ATM");  
    
    JLabel lblBsb = new JLabel("BSB");
    JLabel lblaccountnumber = new JLabel("Account Number");
    JLabel lblpin=new JLabel("Pin Number");
    
    JTextField txtbsb=new JTextField();
    JTextField txtaccountnumber=new JTextField();
    
    JTextField txtpin = new JTextField();
    JButton btnLogin = new JButton("Login");

    
    //The function writen for Login class
    
    
    
    public void FuncChngPage(){
        
        //Add parameters for Header,Button,... in Login class
        
        Title.setBounds(120, 30, 400, 30);
       
        lblBsb.setBounds(50, 90, 250, 20);
        lblaccountnumber.setBounds(50, 120, 250, 20);
        lblpin.setBounds(50,150,250,20);
        
        
        txtbsb.setBounds(170,90,150,20);
        txtaccountnumber.setBounds(170,120,150,20);
        txtpin.setBounds(170, 150, 150, 20);
        btnLogin.setBounds(170, 190, 90, 40);
   
        
        AITBank.add(Title);
        AITBank.add(lblBsb);
        AITBank.add(lblaccountnumber);
        AITBank.add(lblpin);
        
        AITBank.add(txtbsb);
        AITBank.add(txtaccountnumber);
        AITBank.add(txtpin);
        AITBank.add(btnLogin);

        
        AITBank.setSize(400, 300);
        AITBank.setLayout(null);
        AITBank.setVisible(true);
        AITBank.setLocationRelativeTo(null);
        
        
        btnLogin.addActionListener(this);
     
        
        AITBank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
        
    }
      PersonalAccount acc = new PersonalAccount();
      
    
    
     //This function will override when you implement actionlistener 
   
        
           
        @Override
   
    public void actionPerformed(ActionEvent e) {
        
     
        // User Validation implemented while triggering the Login Button. 
    
        // Used UserValidation.txt file for validiating the user details.
        
        
     String bsb = txtbsb.getText();
     String accountNumber = txtaccountnumber.getText();
     String pin;
        pin = txtpin.getText();
     
     try {
            Scanner in = new Scanner(new File("src/LoginValidator/LoginValidator.txt"));
            while (in.hasNextLine())
            {
              String s = in.nextLine();  
              String[] sArray = s.split(",");
              
              System.out.println(sArray[0]); //Just to verify that file is being read
              System.out.println(sArray[1]);
              System.out.println(sArray[2]);

              
              if (bsb.equals(sArray[0]) && accountNumber.equals(sArray[1]) && pin.equals(sArray[2]))
              {
                JOptionPane.showMessageDialog(null, "Login Successful");
                   acc.functionAccount();
                   AITBank.dispose();
              }
                
              
              else
              {
                JOptionPane.showMessageDialog(null,
                    "Invalid Username / Password Combo", "Error",
                    JOptionPane.ERROR_MESSAGE);
              }
            }
            
            in.close();
            
        } 
     catch (FileNotFoundException a) {
            JOptionPane.showMessageDialog(null,
                    "User Database Not Found", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    
     
    }  
}


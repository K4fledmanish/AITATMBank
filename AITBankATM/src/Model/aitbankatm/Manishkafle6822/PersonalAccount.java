/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.aitbankatm.Manishkafle6822;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author k4fledmanish
 */

public class PersonalAccount implements ActionListener
{    
     String display = " ";
     double balance = 10000;
     double result;
    //Account attrible
    static   Frame allAccounts = new Frame("Welcome to your Account");
       
    static   JButton btnSaving = new JButton("Savings Account");
    static   JButton btnNetSaver = new JButton("NetBank Account");
    static   JButton btnCheque = new JButton("Cheque Account");
    static   JButton btnFixed = new JButton("Fixed Account");
    static   JButton btnExit = new JButton("Exit");
    
    // Below are attribute which are written for child class. Child class will extend from here.
    
    static   JButton Num1 = new JButton("1");
    static   JButton Num2 = new JButton("2");
    static   JButton Num3 = new JButton("3");
    static   JButton Num4 = new JButton("4");
    static   JButton Num5 = new JButton("5");
    static   JButton Num6 = new JButton("6");
    static   JButton Num7 = new JButton("7");
    static   JButton Num8 = new JButton("8");
    static   JButton Num9 = new JButton("9");
    static   JButton Num0 = new JButton("0");
    static   JButton Num10 = new JButton(".");
    static   JButton Clr = new JButton("C");
    
    static   JButton Withdraw = new JButton("Withdraw");
    static   JButton Deposit = new JButton("Deposit");
    static   JButton Balance = new JButton("Balance Inquiry");
    static   JButton Help = new JButton("Help");
    static   JButton Enter = new JButton("Enter");
    static   JButton Cancel = new JButton("Cancel");
    
   static JLabel accountNum = new JLabel("Account Number: ");
   static JLabel accType = new JLabel("Account Type: ");
   static JLabel accInterest = new JLabel("Account Interest: ");
   static JLabel accCurrentBalance = new JLabel("Current balance: ");
   static JLabel accTotalAmount = new JLabel("Amount: ");
   static JLabel accAmountAvailable = new JLabel("Available from: ");
    
  static JLabel accNumber = new JLabel("123-456789-6822");
  static  JTextField currentBalance = new JTextField();
  static  JTextField totalAmount = new JTextField();
  static JLabel availableFromDate = new JLabel("10/06/2019");
  
  
  //Function and methods for PersonalAccount
  //Created different 4 pages and will load differently. Exit button will exit the whole application.
  
    public void functionAccount(){
      btnSaving.setBounds(160, 60, 200, 50);
      btnSaving.setForeground(Color.BLACK);
      
      btnNetSaver.setBounds(160, 130, 200, 50);
      btnNetSaver.setForeground(Color.darkGray);
      
      btnCheque.setBounds(160, 200, 200, 50);
      btnCheque.setForeground(Color.MAGENTA);
      
      btnFixed.setBounds(160, 270, 200, 50);
      btnFixed.setForeground(Color.blue);
      
      btnExit.setBounds(160, 350, 200, 50);
      btnExit.setForeground(Color.RED);
       
       
       allAccounts.add(btnSaving);
       allAccounts.add(btnNetSaver);
       allAccounts.add(btnCheque);
       allAccounts.add(btnFixed);
       allAccounts.add(btnExit);
       
       allAccounts.setSize(500, 500);
       allAccounts.setLayout(null);
       allAccounts.setVisible(true);
       
       PersonalAccount account = new PersonalAccount();
       btnSaving.addActionListener(account);
       btnNetSaver.addActionListener(account);
       btnCheque.addActionListener(account);
       btnFixed.addActionListener(account);
       btnExit.addActionListener(account);
       
        allAccounts.setLayout(null);
        allAccounts.setVisible(true);
        allAccounts.setLocationRelativeTo(null);
      
       
    }
    // This function overrides when action listener is implemented and then must import API.
    
    public void actionPerformed(ActionEvent e){
        Object ob = e.getSource();
        if(ob == btnSaving){
            SavingAccount saving = new SavingAccount();
            saving.funcSavingAccount();
            allAccounts.dispose();
        }else if(ob == btnCheque){
            ChequeAccount cheque = new ChequeAccount();
            cheque.funcCheq();
            allAccounts.dispose();
        }else if(ob == btnFixed){
            FixedAccount fixed = new FixedAccount();
            fixed.funcFixed();
            allAccounts.dispose();
        }else if (ob == btnNetSaver){
            NetBankAccount net = new NetBankAccount();
            net.funcNetBankAcc();
            allAccounts.dispose();
        }
        else if(ob == btnExit){
            System.exit(0);
            LoginUserValidation log = new LoginUserValidation();
            log.FuncChngPage();
          
            }
        }
    }

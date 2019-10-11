/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.aitbankatm.Manishkafle6822;

import static Model.aitbankatm.Manishkafle6822.PersonalAccount.currentBalance;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author k4fledmanish
 */

public class SavingAccount extends PersonalAccount{
 
  static   JFrame SavingAccount = new JFrame("Saving Account");
  static JLabel Title = new JLabel("Saving Account");
  static JLabel TypeAc = new JLabel("Savings");
  static JLabel InterAc = new JLabel("Daily");
  
    //This is a function of Saving class
    public void funcSavingAccount(){
      
       SavingAccount ac = new SavingAccount();
       //Add action for button 1,2,3
       Num1.addActionListener(ac);
       Num2.addActionListener(ac);
       Num3.addActionListener(ac);
       //Add action for button 4,5,6
       Num4.addActionListener(ac);
       Num5.addActionListener(ac);
       Num6.addActionListener(ac);
       //Add action for button 7,8,9
       Num7.addActionListener(ac);
       Num8.addActionListener(ac);
       Num9.addActionListener(ac);
       //Add action for button 0
       Num0.addActionListener(ac);
       //Add action for button .
       Num10.addActionListener(ac);
       //Add action for button CRL
       Clr.addActionListener(ac);
       //Add action for button Withdraw
       Withdraw.addActionListener(ac);
       //Add action for button Deposit
       Deposit.addActionListener(ac);
       //Add action for button Balance
       Balance.addActionListener(ac);
       //Add action for button Help
       Help.addActionListener(ac);
       //Add action for button Cancel
       Cancel.addActionListener(ac);
       
       Title.setBounds(100, 10, 400, 20);
       accNumber.setBounds(60, 40, 300, 20);
       accType.setBounds(60, 70, 300, 20);
       accInterest.setBounds(60, 100, 300, 20);
       accCurrentBalance.setBounds(60, 130, 300, 20);
       accTotalAmount.setBounds(60, 160, 300, 20);
       accAmountAvailable.setBounds(60, 190, 300, 20);
       
       accNumber.setBounds(200, 40, 200, 20);
       TypeAc.setBounds(200, 70, 200, 20);
       InterAc.setBounds(200, 100, 200, 20);
       currentBalance.setBounds(200, 130, 200, 20);
       totalAmount.setBounds(200, 160, 200, 20);
       availableFromDate.setBounds(200, 190, 200, 20);
       //Row 1
       Num1.setBounds(60, 240, 50, 40);
       Num2.setBounds(120, 240, 50, 40);
       Num3.setBounds(180, 240, 50, 40);
       Withdraw.setBounds(250, 240, 160, 40);
       //Row 2
       Num4.setBounds(60, 280, 50, 40);
       Num5.setBounds(120, 280, 50, 40);
       Num6.setBounds(180, 280, 50, 40);
       Deposit.setBounds(250, 280, 160, 40);
       //Row 3
       Num7.setBounds(60, 320, 50, 40);
       Num8.setBounds(120, 320, 50, 40);
       Num9.setBounds(180, 320, 50, 40);
       Balance.setBounds(250, 320, 160, 40);
       //Row 4
       Num0.setBounds(60, 360, 50, 40);
       Num10.setBounds(120, 360, 50, 40);
       Clr.setBounds(180, 360, 50, 40);
       Help.setBounds(250, 360, 160, 40);
       //Row 5
       Enter.setBounds(60, 410, 160, 40);
       Cancel.setBounds(250, 410, 160, 40);
       
       SavingAccount.add(Num1);
       SavingAccount.add(Num2);
       SavingAccount.add(Num3);
       SavingAccount.add(Num4);
       SavingAccount.add(Num5);
       SavingAccount.add(Num6);
       SavingAccount.add(Num7);
       SavingAccount.add(Num8);
       SavingAccount.add(Num9);
       SavingAccount.add(Num0);
       SavingAccount.add(Num10);
       SavingAccount.add(Clr);
       SavingAccount.add(Withdraw);
       SavingAccount.add(Deposit);
       SavingAccount.add(Balance);
       SavingAccount.add(Help);
       SavingAccount.add(Enter);
       SavingAccount.add(Cancel);
       
     
       SavingAccount.add(Title);
       SavingAccount.add(accNumber);
       SavingAccount.add(accType);
       SavingAccount.add(accInterest);
       SavingAccount.add(accCurrentBalance);
       SavingAccount.add(accTotalAmount);
       SavingAccount.add(accAmountAvailable);
       
       SavingAccount.add(accNumber);
       SavingAccount.add(TypeAc);
       SavingAccount.add(InterAc);
       SavingAccount.add(currentBalance);
       SavingAccount.add(totalAmount);
       SavingAccount.add(availableFromDate);
       
       SavingAccount.setSize(500, 500);
       SavingAccount.setLayout(null);
       SavingAccount.setVisible(true);
       SavingAccount.setLocationRelativeTo(null);
    }
    //Function when click on the Account

    public void actionPerformed(ActionEvent e){
        Object ob = e.getSource();
        
        
        if(ob == Num1){
        display = totalAmount.getText();
        totalAmount.setText(display + "1");
        System.out.println("Key 1 already press");
        }else if(ob == Num2){
        display = totalAmount.getText();
        totalAmount.setText(display + "2");
        System.out.println("Key 2 already press");
        }else if(ob == Num3){
        display = totalAmount.getText();
        totalAmount.setText(display + "3");
        System.out.println("Key 3 already press");
        }else if(ob == Num4){
        display = totalAmount.getText();
        totalAmount.setText(display + "4");
        System.out.println("Key 4 already press");
        }else if(ob == Num5){
        display = totalAmount.getText();
        totalAmount.setText(display + "5");
        System.out.println("Key 5 already press");
        }else if(ob == Num6){
        display = totalAmount.getText();
        totalAmount.setText(display + "6");
        System.out.println("Key 6 already press");
        }else if(ob == Num7){
        display = totalAmount.getText();
        totalAmount.setText(display + "7");
        System.out.println("Key 7 already press");
        }else if(ob == Num8){
        display = totalAmount.getText();
        totalAmount.setText(display + "8");
        System.out.println("Key 8 already press");
        }else if(ob == Num9){
        display = totalAmount.getText();
        totalAmount.setText(display + "9");
        System.out.println("Key 9 already press");
        }else if(ob == Num0){
        display = totalAmount.getText();
        totalAmount.setText(display + "0");
        System.out.println("Key 0 already press");
        }else if(ob == Num10){
        display = totalAmount.getText();
        totalAmount.setText(display + ".");
        System.out.println("Key . already press");
        }else if(ob == Clr){
        totalAmount.setText(null);
        currentBalance.setText(null);
        System.out.println("Key clear already press");
        }else if(ob == Withdraw){
//Withdraw 
        if(totalAmount.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please put number of cash you want !");
        }else{
            calculator ca = new calculator();
            ca.withdraw();
        }
        }else if(ob == Deposit){
//Deposit        
            if(totalAmount.getText().equals("")){
            JOptionPane.showMessageDialog(totalAmount, "Please insert the number of cash you want !");
            }else{
            calculator ca = new calculator();
            ca.deposite();
            }
        System.out.println("Key Deposit already press");
        }else if(ob == Balance){
            if(currentBalance.getText().equals("")){
                currentBalance.setText("0");
            }else{
                calculator ca = new calculator();
                ca.inquiry();
            }
        System.out.println("Key Balance already press");
        }else if(ob == Help){
        JOptionPane.showMessageDialog(null, "Please come to ABC Bank if you have any problem!");
        System.out.println("Key Help already press");
        }else if(ob == Enter){
        System.out.println("Key Enter already press");
        }else if(ob == Cancel){
        PersonalAccount pa = new PersonalAccount();
        //system.exit(0) use to stop application
        System.exit(0);
      }
    }
    //This is a specialized class include 2 funtion withdraw and deposite
class calculator{
    String x = totalAmount.getText();
    double a = Double.parseDouble(x);
    public void withdraw(){
    if(a > balance){
        JOptionPane.showMessageDialog(null, "Please check your balance");
    }else{
    result = balance - a;
    String cur = String.valueOf(result);
    currentBalance.setText(cur);
    JOptionPane.showMessageDialog(null, "Successfully withdrawed!!!");
    }
   }
    public void deposite(){ 
    result = (balance + a)+(a*0.2);
    String cur = String.valueOf(result);
    currentBalance.setText(cur);
    JOptionPane.showMessageDialog(null, "Successfully deposited!!!");
    }
    public void inquiry(){
        result = a*0.2;
    String cur = String.valueOf(result);
    currentBalance.setText(cur);
    }
   }
}

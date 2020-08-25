# AITATMBank
ATM Application


Java Application (ATM SYSTEM )



Part 1. ADT Implementation

First, you need to implement Abstract Data Type.
 
 
 Situation
 
 Following discussions at the recent annual directors meeting of the AITBank financial organization, it has been
 decided to embrace the benefits of Information Technology in streamlining their customer services.


To this end AITBank has decided to implement a new Transaction processing system that will allow customer to withdraw money from their accounts as well as make deposits to their accounts. It is envisaged that there will be multiple customer interfaces to this system such as Web based access and automatic teller machines (ATMs).


AITBank has 4 account types, which need to be used with the system.
-Saving accounts
-Cheque accounts
-Net-saver accounts
-Fixed accounts


Savings Account

Savings account offer interest which is calculated daily. Savings account have daily withdrawal limits. Users can set their own withdrawal limit.


Net Savings Account

Net Savings offer interest higher then savings but its calculated monthly. They have a daily withdrawal limit but the user cannot set/change this limit.Cheque AccountCheque account offers no interest and it also has no daily withdrawal limit.


Fixed Account

Fixed offers the biggest interest rate, however it is only calculated after a fixed contract period. If user witdraws before this contract period, they receive no interest (assume any withdrawal is too early, so keep track of early withdrawal in a boolean attribute for the class). Fixed account has no daily withdraw limit.



 // NOTE: Don’t worry about time and dates. Assume someone is writing that side of the project. So for calculating
 //interest just provide a function to add interest to the account and assume it will be called at the right times. The
 //special case for this in the Fixed Account, which may yield no interest if withdrawn from early.
 
 //In addition, ATMs can give only 20, 50 and 100 notes.
 
 Task A
 Design a simple ADT or class diagram to demonstrate your class hierarchies. Implement your ADT designs using Java.Note: Remember that your classes should only model the data, transactions and business logic of the bank and NOT the interface.
 Task B
 Create a set of concrete classes to demonstrate the abstract data types are working properly. Note: State clearly any assumptions you make. Testing all of your methods work correctly is also marked.




Part 2. GUI Implementation

Develop ATM system Graphic User Interface, for the AITBank System developed in Assignment 1. Your system should be designed base on real ATM machine, sample design above, however you should demonstrate your design creativity on layout and messages are displayed. Other functions are list below:

-Your system design, ATM interface, should allow users to make multiple transactions on the same account without having to re-enter their password number.
-You have to also document any assumptions that you make about the functionality of the interface.
-Make sure that your code is well-formatted, good notation and has comments to make it easily readable and reusable, recommend JavaDoc style comment.




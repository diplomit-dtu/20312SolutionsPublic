//********************************************************************
//  Banking.java       Author: Lewis/Loftus
//
//  Driver to exercise the use of multiple Account objects.
//********************************************************************

package opg05_05_Banking.step2;

import opg05_05_Banking.Address;

public class Transactions
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Account acct1 = new Account("Ted Murphy", 72354, 102.56, new Address("Foo St", "Software City", "Javaland", 1337));
      Account acct2 = new Account("Jane Smith", 69713, 40.00, new Address("Bar St", "Software City", "Javaland", 1337)) ;
      Account acct3 = new Account("Edward Demsey", 93757, 759.32, new Address("Hello St", "Software City", "Javaland", 1337));

      acct1.deposit (25.85);

      double smithBalance = acct2.deposit (500.00);
      System.out.println ("Smith balance after deposit: " +
                          smithBalance);

      System.out.println ("Smith balance after withdrawal: " + 
                          acct2.withdraw (430.75, 1.50));


      acct3.withdraw (800.00, 0.0);  // exceeds balance

      acct1.addInterest();
      acct2.addInterest();
      acct3.addInterest();

      acct1.transferToAccount(acct2, 100, 1.5);
      System.out.println("Murphy balance after transfer to Smith: "+acct1.getBalance());
      System.out.println("Smith balance after transfer from Murphy: "+acct2.getBalance());

      System.out.println ();
      System.out.println (acct1);
      System.out.println (acct2);
      System.out.println (acct3);
   }
}

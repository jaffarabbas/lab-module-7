import java.util.Scanner;
import java.util.Random;

class SavingAccount
 {
      static double annualInterestRate;
      static double savingBalance;
      static double balance;

      SavingAccount(double balance)
      {
            this.balance = balance;
      }

      static void modifyInterestRate()
      {
          annualInterestRate=10;
      }

      static void calculateMonthlyInterest()
      {
          modifyInterestRate();
          savingBalance = balance+ (balance*annualInterestRate)/12; 
          System.out.println(savingBalance);
      }

      static void printBalance()
      {
          calculateMonthlyInterest();
      }

      static void monthlyInt(float a)
      {
          annualInterestRate=a;
          savingBalance = balance+ (balance*annualInterestRate)/1; 
          System.out.println(savingBalance);
      }

 }
public class task1 {
    public static void main(String[] args) {
        SavingAccount obj = new SavingAccount(100);
        SavingAccount obj2 = new SavingAccount(200);
        obj.printBalance();
        obj2.printBalance();

        System.out.println("MOnthly : ");
        obj.monthlyInt(0.3f);
        obj2.monthlyInt(0.4f);
    }
}
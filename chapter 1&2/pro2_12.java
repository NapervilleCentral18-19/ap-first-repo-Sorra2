import java.util.Scanner;
import java.text.NumberFormat;
/**
 * Write a description of class pro2_12 here.
 * Determines value of coins in a jar by receiving pennies, dimes, nickels and
 * quarters from user
 * 
 * @author Sorra Tweed
 * @version 9/16/20
 */
public class pro2_12
{
   public static void main()
   {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Enter the number of coins of each type.");
       
       //gathering coin amounts from user
       System.out.print("Quarters: ");
       int Q = keyboard.nextInt();
       //System.out.println("\n");
       
       System.out.print("Dimes: ");
       int D = keyboard.nextInt();
       //System.out.println("\n");
       
       System.out.print("Nickels: ");
       int N = keyboard.nextInt();
       //System.out.println("\n");
       
       System.out.print("Pennies: ");
       int P = keyboard.nextInt();
       //System.out.println("\n");
       
       //converting coin amounts to money value
       double qValue = (Q*25)/100.0;
       double dValue = (D*10)/100.0;
       double nValue = (N*5)/100.0;
       double pValue = (P)/100.0;
       //don't need to multiply P by anything, since its money value is 1
       
       //calculating total money value
       double moneyValue = qValue+dValue+nValue+pValue;
       
       //for formatting value in money form
       NumberFormat money = NumberFormat.getCurrencyInstance();
       
       System.out.println("The total value of the coins is "+money.format(moneyValue));
   }
}

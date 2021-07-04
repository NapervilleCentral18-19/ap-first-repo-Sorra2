import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Write a description of class pro2_10 here.
 *  A simple program to
 *
 * @author Sorra Tweed
 * @version 9/15/20
 */
public class pro2_10
{   
      public static void main()
      {
          Scanner keyboard = new Scanner(System.in);
          System.out.println("Enter values of the three sides");
          
          double a = keyboard.nextDouble();
          double b = keyboard.nextDouble();
          double c = keyboard.nextDouble();
          
          // s is the semiperimeter
          double s = (a+b+c)/2;
          //heron's formula to calculate area
          double area = s*(s-a)*(s-b)*(s-c);
          
          //to shorten to two decimals
          DecimalFormat fmt = new DecimalFormat("0.##");
          
          System.out.println("The area is "+fmt.format(Math.sqrt(area)));
          
      }
}

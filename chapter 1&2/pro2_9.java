import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class pro2_9 here.
 * Calculates the volume and surface area of a sphere
 * @author Sorra Tweed
 * @version 9/16/20
 */
public class pro2_9
{
   public static void main()
   {
       Scanner keyboard = new Scanner(System.in);
       
       System.out.println("Enter the radius of the sphere: ");
       double radius = keyboard.nextDouble();
       
       //shortens decimals to 4 places
       DecimalFormat fmt = new DecimalFormat("0.0000");
       
       double sArea = 4*Math.PI*Math.pow(radius,2);
       double volume = 4.0/3.0*Math.PI*Math.pow(radius,3);
       
       System.out.println("The volume of the sphere is "+fmt.format(volume));
       System.out.println("The surface area of the sphere is "+fmt.format(sArea));
       
   }
}

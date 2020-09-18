import java.util.Scanner;
/**
 * Write a description of class pro2_7 here.
 * Convert's user's input in seconds to hour:minute:second format 
 *
 * @author Sorra Tweed
 * @version 9/15/20
 */
public class pro2_7
{
 public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of seconds to be converted:");
        
        //grabs user input as an int
        int seconds = keyboard.nextInt();
        
        //converts seconds input into minutes
        int minutes = (seconds/60);
        //grabs remaining seconds if there are any
        int remSeconds = (seconds % 60);
        
        //converts minutes into hours
        int hours = (minutes/60);
        //grabs remaining minutes if there are any
        int remMinutes = (minutes % 60);
        
        System.out.println("The value you entered is: ");
        System.out.println(hours+" hours");
        System.out.println(remMinutes+" minutes");
        System.out.println(remSeconds+" seconds");
        
        
        
    }
}

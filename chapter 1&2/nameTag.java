import java.util.Scanner;
/**
 * Write a description of class nameTag here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nameTag
{
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter your full name:");
        String fullName = keyboard.nextLine();
        
        //grabs location of first space, to separate first and middle names
        int firstSpace = fullName.indexOf(" ");
        
        /*  grabs first letter of middle name
         *  +1 to make sure substring starts on first letter
        */
        int middleFirst = fullName.charAt(firstSpace + 1);
        
        
    }
}

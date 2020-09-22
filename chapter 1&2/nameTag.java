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
        
        
        //FIRST NAME OBTAINED
        String firstName = fullName.substring(0,firstSpace);
        
        
        /*  grabs first letter of middle name
         *  MIDDLE INITIAL OBTAINED
         *  +1 to make sure substring starts on first letter
        */
        char middleFirst = fullName.charAt(firstSpace + 1);
        
        //gets variable of middle and last name
        String middleLast = fullName.substring(firstSpace + 1);
        
        //uses variable just created to grab final space in name
        int secondSpace = middleLast.indexOf(" ");
        
        //uses location of second space to grab last name
        //LAST NAME OBTAINED
        String lastName = middleLast.substring(secondSpace + 1);
        
        //this is to convert to the requested format
        String fmtdName = firstName + " " + middleFirst + ". " + lastName;
        
        
        System.out.println("Here is your full name, formatted: " + fmtdName);
        
    }
}

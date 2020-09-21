import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
/**
 * Write a description of class myFirstProgram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class myFirstProgram
{
        public static void main(String[] args) 
 {  
  Scanner keyboard = new Scanner (System.in);
  int x = 5;
  //list of primitive data types
  float num = 9;
  double number = 8.4,num1,num2,num3,num4;
  boolean choice = true;
  short a = 2; //not used in APCS
  long b = 3;
  char letter = 'a'; //only time use single quotes
  String first, last, othername;

  //class         objects   id    memory    constructor
    String         word      =     new      String("Thank god it's Friday");
  String word2 = "yippy!!!";
  //Address mine = new Address("123 Elm st,","Naperville",60165,"IL");
  //student you = new Student("First",1234,mine);

  //oop (java)
  //python functional print(len(word))
  System.out.println(word.length());





  System.out.println("Hello world!");
  //System.out.print("Enter first name");
  //first = keyboard.nextLine();
  //last = keyboard.nextLine();


  //System.out.println(first);
  //System.out.println(first+"-"+last);
  /*
  
  
  //next vs nextLine
  //next = input to first space
  //nextLine = input to first new line
  System.out.println("Enter your full name");
  String fullname = keyboard.next();

    System.out.println("Full name: "+fullname);
  //clear input so int age doesn't get input of \n
  keyboard.nextLine();
  System.out.println("Enter your age");
  int age = keyboard.nextInt();

  System.out.println("Enter GPA");
  double gpa = keyboard.nextDouble();

  
  
  //p78 of book (89 in ver 4 online)
  

  System.out.println(5 == 5);
  System.out.println(5 == 2);
  //are fullname and othername same object?vv
  System.out.println(fullname == othername);
  //are fullname and othername equal?vv
  System.out.println(fullname.equals(othername));
  */
 
  //COD newsniper = new COD("GOAT");
  //newsniper.shoot
  //must know String methods (online p89)
  othername = new String ("Sorra R. Tweed");
  
  System.out.println(othername.length());
  System.out.println(othername.replace('r','*'));
  System.out.println(othername.compareTo("Rin"));
  System.out.println(othername.substring(1,10));

  //p88 list of Math Class methods
  //no obj of Math class - NO! Math helper = new Math(); ERROR
  System.out.println(Math.abs(-4));
  System.out.println(Math.sqrt(25));
  System.out.println(Math.pow(2,3));
  System.out.println(Math.PI);//not method, constant in Math class
  
  num1 = 23.8765;
  num2 = 3.4;
  
  
  //formatting output
  DecimalFormat fmt = new DecimalFormat("0.##"); //## will not pad with 0.5
  DecimalFormat fmt2 = new DecimalFormat("0.00"); //00 will pad with 0.5
  NumberFormat money = NumberFormat.getCurrencyInstance();
  
   System.out.println("Sub Total: "+money.format(num1));
   System.out.println("Sub Total: "+fmt.format(num1));
   System.out.println("Sub Total: "+fmt.format(num2));
   
   
   
 }
}

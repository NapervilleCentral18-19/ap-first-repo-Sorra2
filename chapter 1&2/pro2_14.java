import java.util.Random;
/**
 * Write a description of class pro2_14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pro2_14
{
   public static void main()
   {
       Random gen = new Random();
       int areaCode1, areaCode2, areaCode3, middleNum, lastNum;
       
       //randomly determines each digit of area code
       areaCode1 = gen.nextInt(8);
       areaCode2 = gen.nextInt(8);
       areaCode3 = gen.nextInt(8);
       
       //concantenates area code digits together
       String fullCode = "" + areaCode1 + areaCode2 + areaCode3;
       
       //allows any num up to 742, but not past
       middleNum = gen.nextInt(743);
       
       //allows any num up to 9999, but not past
       lastNum = gen.nextInt(10000);
       
   } 
}

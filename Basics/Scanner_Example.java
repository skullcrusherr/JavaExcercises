package corp.skull.Basics;
import java.util.Scanner;
/**
 * Program to impliment Scanner class
 */
public class Scanner_Example {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter two Numbers : ");
        int a= ip.nextInt();
        int b= ip.nextInt();
        System.out.println("Value of a is : "+a+"\nValue of b is : "+b);
    }
}
/*
nextLine()
next()
nextInt()
nextFloat()
nextBoolean()
nextByte()
nextDouble()
nextShort()
nextLong()
*/
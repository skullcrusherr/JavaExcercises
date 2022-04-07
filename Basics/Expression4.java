package corp.skull.Basics;
import java.util.Scanner;
public class Expression4 {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a= ip.nextInt();
        int b= ip.nextInt();
        int c= ip.nextInt();
        double r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        double r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("Root 1 : "+r1+"\nRoot 2 : "+r2);
    }
}

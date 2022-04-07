package corp.skull.Basics;
import java.util.Scanner;
public class Expression2 {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        int x=ip.nextInt();
        int y=3*x*x+5*x+2;
        System.out.println("Result : "+y);
    }
}

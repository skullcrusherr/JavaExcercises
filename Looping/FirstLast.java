package corp.skull.Looping;
import java.util.Scanner;
public class FirstLast {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a= ip.nextInt();
        int fn=a,ln=a%10;
        while(a>=10){
            a/=10;
            fn=a;
        }
        System.out.println("First Number : "+fn);
        System.out.println("Last Number : "+ln);
    }
}

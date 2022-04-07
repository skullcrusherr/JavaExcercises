package corp.skull.Looping;
import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a= ip.nextInt(),i;
        for(i=2;i<=a/2;i++){
            if(a%i==0){
                System.out.println("Number is not prime");
                return;
            }
        }
        System.out.println("Number is prime");
    }
}

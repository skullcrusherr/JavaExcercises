package corp.skull.Looping;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=ip.nextInt();
        int sum=0;
        while(a!=0){
            sum+=a%10;
            a/=10;
        }
        System.out.println("Sum is : "+sum);
    }
}

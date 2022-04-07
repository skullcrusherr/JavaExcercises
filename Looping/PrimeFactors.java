package corp.skull.Looping;
import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int i, j, num, isPrime;
        System.out.println("Enter a number : ");
        num=ip.nextInt();
        System.out.println("Prime Factors are : ");
        for(i=2; i<=num; i++)
        {
            if(num%i==0)
            {
                isPrime = 1;
                for(j=2; j<=i/2; j++)
                {
                    if(i%j==0)
                    {
                        isPrime = 0;
                        break;
                    }
                }
                if(isPrime==1)
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
}

package corp.skull.Looping;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=ip.nextInt();
        int sum=0;
        for(int i=2;i<=n;i+=2)
        {
            sum+=i;
        }
        System.out.println("Sum is : "+sum);
    }
}

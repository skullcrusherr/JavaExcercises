package corp.skull.Looping;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=ip.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Sum is : "+sum);
    }
}

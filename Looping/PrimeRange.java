package corp.skull.Looping;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter min : ");
        int min= ip.nextInt();
        System.out.println("Enter max : ");
        int max= ip.nextInt();
        System.out.println("Prime numbers are : ");
        for(int i=min;i<=max;i++){
            int flag=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0)
                {
                    flag=1;
                }
            }
            if(flag==0) {
                System.out.print(i+", ");
            }
        }
    }
}

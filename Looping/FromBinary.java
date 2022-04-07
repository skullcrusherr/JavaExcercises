package corp.skull.Looping;

import java.util.Scanner;

public class FromBinary {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a= ip.nextInt();
        int b=0;
        int n=String.valueOf(a).length();
        for(int i=0;i<n;i++,a/=10){
            b+=Math.pow(2,i)*a%10;
        }
        System.out.println("Decimal Result : "+b);
    }
}

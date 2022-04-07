package corp.skull.Looping;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=ip.nextInt();
        int b=0;
        while(a!=0){
            b=b*10+a%10;
            a/=10;
        }
        System.out.println("Reverse : "+b);
    }
}

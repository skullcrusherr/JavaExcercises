package corp.skull.Looping;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=ip.nextInt(),r=1;
        for(int i=a;i>0;i--){
            r*=i;
        }
        System.out.println("Factorial is : "+r);
    }
}

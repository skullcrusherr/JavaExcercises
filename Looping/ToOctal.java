package corp.skull.Looping;

import java.util.Scanner;

public class ToOctal {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=ip.nextInt();
        String b="";
        while(a!=0){
            b=a%8+b;
            a/=8;
        }
        System.out.println("Octal Result : "+b);
    }
}

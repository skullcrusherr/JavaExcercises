package corp.skull.Looping;

import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=ip.nextInt();
        String b="";
        while(a!=0){
            b=a%2+b;
            a/=2;
        }
        System.out.println("Binary Result : "+b);
    }
}

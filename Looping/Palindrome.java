package corp.skull.Looping;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=ip.nextInt();
        int b=0,c=a;
        while(a!=0){
            b=b*10+a%10;
            a/=10;
        }
        if(c==b){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
}

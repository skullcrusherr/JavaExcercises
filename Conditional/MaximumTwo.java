package corp.skull.Conditional;

import java.util.Scanner;

public class MaximumTwo {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a=ip.nextInt();
        int b= ip.nextInt();
        if(a>b){
            System.out.println("a is bigger");
        }
        else{
            System.out.println("b is bigger");
        }
    }
}

package corp.skull.Conditional;

import java.util.Scanner;

public class TriangleSides {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter legths of three sides of triangle : ");
        int a= ip.nextInt();
        int b= ip.nextInt();
        int c= ip.nextInt();
        if(a>0&&b>0&&c>0){
            if(a+b>c&&b+c>a&&c+a>b){
                System.out.println("Triangle can be formed");
            }
            else{
                System.out.println("Triangle cannot be formed");
            }
        }
        else{
            System.out.println("Triangle cannot be formed");
        }
    }
}

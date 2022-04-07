package corp.skull.Conditional;

import java.util.Scanner;

public class TriangleAngle {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter three angles : ");
        int a=ip.nextInt();
        int b= ip.nextInt();
        int c=ip.nextInt();
        if(a>0&&b>0&&c>0){
            if(a+b+c==180){
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

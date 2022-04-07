package corp.skull.Basics;
import java.util.Scanner;
public class Expression1 {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter four numbers : ");
        int a= ip.nextInt();
        int b= ip.nextInt();
        int c= ip.nextInt();
        int d= ip.nextInt();
        int y=a*b+c*d;
        System.out.println("Result : "+y);
    }
}

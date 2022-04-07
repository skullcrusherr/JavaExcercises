package corp.skull.Conditional;
import java.util.Scanner;
public class IfElseExample {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a= ip.nextInt();
        int b= ip.nextInt();
        if(a==b){
            System.out.println("a is equal to b");
        }
        else{
            System.out.println("a is not equal to b");
        }
    }
}

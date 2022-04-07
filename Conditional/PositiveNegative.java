package corp.skull.Conditional;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        int a= ip.nextInt();
        if(a>=0){
            System.out.println("a is positive");
        }
        else{
            System.out.println("a is negative");
        }
    }
}

package corp.skull.Basics;
import java.util.Scanner;
public class Expression3 {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        float n= ip.nextInt();
        float a= ip.nextInt();
        float d= ip.nextInt();
        float y=n/2*(2*a+(n-1)*d);
        System.out.println("Result : "+y);
    }
}

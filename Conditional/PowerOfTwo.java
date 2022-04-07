package corp.skull.Conditional;
import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=ip.nextInt();
        double b=Math.log(a)/Math.log(2);
        if(b==(int)b){
            System.out.println("Its a Power of Two");
        }
        else{
            System.out.println("Its not a Power of Two");
        }
    }
}

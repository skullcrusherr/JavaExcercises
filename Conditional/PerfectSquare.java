package corp.skull.Conditional;
import java.util.Scanner;
public class PerfectSquare {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=ip.nextInt();
        double b=Math.sqrt(a);
        if(b==(int)b){
            System.out.println("Its a Perfect Square");
        }
        else{
            System.out.println("Its not a Perfect Square");
        }
    }
}

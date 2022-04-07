package corp.skull.Looping;
import java.util.Scanner;
public class PowerLoop {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the base : ");
        int b=ip.nextInt();
        System.out.println("Enter the Exponent : ");
        int e=ip.nextInt();
        int r=1;
        for(int i=0;i<e;i++){
            r*=b;
        }
        System.out.println("Power is : "+r);
    }
}

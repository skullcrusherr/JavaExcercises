package corp.skull.NumberSeries;
import java.util.Scanner;

/**
 * 2, 4, 6, 8, 10, ...n,
 */
public class EvenNumbers {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=ip.nextInt();
        System.out.print("Series : ");
        for(int i=2;i<=n;i+=2)
        {
            System.out.print(i+", ");
        }
    }
}

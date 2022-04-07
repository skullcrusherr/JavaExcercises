package corp.skull.NumberSeries;
import java.util.Scanner;

/**
 * 1, 3, 5, 7, 9, ...n,
 */
public class OddNumbers {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=ip.nextInt();
        System.out.print("Series : ");
        for(int i=1;i<=n;i+=2)
        {
            System.out.print(i+", ");
        }
    }
}

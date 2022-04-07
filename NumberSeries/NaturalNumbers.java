package corp.skull.NumberSeries;
import java.util.Scanner;
/**
 * 1, 2, 3, 4, 5, ... n,
 */
public class NaturalNumbers {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=ip.nextInt();
        System.out.print("Series : ");
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+", ");
        }
    }
}

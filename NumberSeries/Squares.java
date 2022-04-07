package corp.skull.NumberSeries;
import java.util.Scanner;

/**
 * 1, 4, 9, 16, 25, 36, ...n,
 */
public class Squares {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=ip.nextInt();
        System.out.print("Series : ");
        for(int i=1;i<=n;i++)
        {
            System.out.print(i*i+", ");
        }
    }
}

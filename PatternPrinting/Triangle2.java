package corp.skull.PatternPrinting;
import java.util.Scanner;
/*

 * * * * *
 * * * *
 * * *
 * *
 *

 */
public class Triangle2 {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=ip.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

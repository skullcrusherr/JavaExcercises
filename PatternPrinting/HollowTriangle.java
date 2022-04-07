package corp.skull.PatternPrinting;
import java.util.Scanner;
/*

 *
 * *
 *   *
 *     *
 * * * * *

 */
public class HollowTriangle {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=ip.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                if(j==0||i==j||i==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

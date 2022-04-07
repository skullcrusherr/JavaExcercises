package corp.skull.NumberSeries;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n= ip.nextInt();
        int a=0,b=1,c;
        System.out.print("Series is : \n"+a+" "+b+" ");
        for(int i=0;i<n-2;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}

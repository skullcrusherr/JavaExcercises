package corp.skull.Looping;
import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        int a= ip.nextInt();
        int i=0;
        while(a!=0){
            a/=10;
            i++;
        }
        System.out.println("Number of Digits : "+i);
    }
}

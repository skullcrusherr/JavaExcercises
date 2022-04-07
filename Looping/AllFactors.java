package corp.skull.Looping;
import java.util.Scanner;
public class AllFactors {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a=ip.nextInt();
        System.out.print("Factors : ");
        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.print(i+", ");
            }
        }
    }
}

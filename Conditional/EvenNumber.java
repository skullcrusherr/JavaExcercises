package corp.skull.Conditional;
import java.util.Scanner;
public class EvenNumber {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=ip.nextInt();
        if(a%2==0){
            System.out.println("a is even");
        }
        else{
            System.out.println("a is odd");
        }
    }
}

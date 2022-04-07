package corp.skull.Conditional;
import java.util.Scanner;
public class NoOfDays {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the Month no : ");
        int n=ip.nextInt();
        System.out.println((n==2)?"It's 28 or 29 Days":(n>=8)?(n%2==0)?"It's 31 Days":"It's 30 Days":(n%2==0)?"It's 30 Days":"It's 31 Days");
        if(n==2){
            System.out.println("It's 28 or 29 Days");
        }
        else{
            if(n>=8)
            {
                if(n%2==0){
                    System.out.println("It's 31 Days");
                }
                else{
                    System.out.println("It's 30 Days");
                }
            }
            else{
                if(n%2==0){
                    System.out.println("It's 30 Days");
                }
                else{
                    System.out.println("It's 31 Days");
                }
            }
        }
    }
}

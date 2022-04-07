package corp.skull.Conditional;
import java.util.Scanner;
/**
 * Percentage >= 90% : Grade A
 * Percentage >= 80% : Grade B
 * Percentage >= 70% : Grade C
 * Percentage >= 60% : Grade D
 * Percentage >= 40% : Grade E
 * Percentage < 40% : Grade F
 */
public class GradeDisplay {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter Percentage : ");
        int p=ip.nextInt();
        if(p>=90&&p<=100){
            System.out.println("Grade A");
        }
        else if(p>=80&&p<90){
            System.out.println("Grade B");
        }
        else if(p>=70&&p<80){
            System.out.println("Grade C");
        }
        else if(p>=60&&p<70){
            System.out.println("Grade D");
        }
        else if(p>=40&&p<60){
            System.out.println("Grade E");
        }
        else if(p>=0&&p<40){
            System.out.println("Grade F");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}

package corp.skull.Conditional;
import java.util.Scanner;
/**
 * Basic Salary <= 10000 : HRA = 20%, DA = 80%
 * Basic Salary <= 20000 : HRA = 25%, DA = 90%
 * Basic Salary > 20000 : HRA = 30%, DA = 95%
 */
public class SalaryCalculation {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter Basic Salary : ");
        int s= ip.nextInt();
        if(s<=10000&&s>=0){
            System.out.println("Gross Salary : "+(s+s*0.2+s*0.8));
        }
        else if(s<=20000&&s>10000){
            System.out.println("Gross Salary : "+(s+s*0.25+s*0.9));
        }
        else if(s>20000){
            System.out.println("Gross Salary : "+(s+s*0.3+s*0.95));
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}

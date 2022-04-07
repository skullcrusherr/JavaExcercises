package corp.skull.Conditional;
import java.util.Scanner;
/**
 * For first 50 units Rs. 0.50/unit
 * For next 100 units Rs. 0.75/unit
 * For next 100 units Rs. 1.20/unit
 * For unit above 250 Rs. 1.50/unit
 * An additional surcharge of 20% is added to the bill
 */
public class ElectricityBill {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the no of units used : ");
        int unit=ip.nextInt();
        double amt,total_amt, sur_charge;
        if(unit <= 50)
        {
            amt = unit * 0.50;
        }
        else if(unit <= 150)
        {
            amt = 25 + ((unit-50) * 0.75);
        }
        else if(unit <= 250)
        {
            amt = 100 + ((unit-150) * 1.20);
        }
        else
        {
            amt = 220 + ((unit-250) * 1.50);
        }
        sur_charge = amt * 0.20;
        total_amt  = amt + sur_charge;
        System.out.println("Electricity Bill : "+total_amt);
    }
}

package corp.skull.Conditional;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter Selling Price : ");
        int sp= ip.nextInt();
        System.out.println("Enter Cost Price : ");
        int cp= ip.nextInt();
        if(cp>sp){
            System.out.println("Loss : "+(sp-cp));
        }
        else{
            System.out.println("Profit : "+(sp-cp));
        }
    }
}

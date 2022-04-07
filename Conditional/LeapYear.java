package corp.skull.Conditional;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year= ip.nextInt();
        if(((year % 4 == 0) && (year % 100 !=0)) || (year % 400==0)){
            System.out.println("It's a Leap Year");
        }
        else{
            System.out.println("It's not a Leap Year");
        }
    }
}

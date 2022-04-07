package corp.skull.Looping;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        int i, num1, num2, min, hcf=1;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        num1=ip.nextInt();
        num2=ip.nextInt();
        min = Math.min(num1, num2);
        for(i=1; i<=min; i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                hcf = i;
            }
        }
        System.out.println("HCF is : "+hcf);
    }
}

package corp.skull.Looping;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int i, num1, num2, max, lcm;
        System.out.println("Enter 2 numbers : ");
        num1= ip.nextInt();
        num2=ip.nextInt();
        max = Math.max(num1, num2);
        i = max;
        while(true)
        {
            if(i%num1==0 && i%num2==0)
            {
                lcm = i;
                break;
            }
            i += max;
        }
        System.out.println("LCM is : "+lcm);
    }
}

package corp.skull.oops;

import java.util.Scanner;

public class Function1 {
    public int add(int a,int b)
    {
        int c;
        c=a+b;
        return c;
    }

    public static void main(String[] args) {
        Function1 obj=new Function1();
        int a,b;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a=ip.nextInt();
        b= ip.nextInt();
        System.out.println("Sum is : "+obj.add(a,b));
    }
}

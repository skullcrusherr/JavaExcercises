package corp.skull.Looping;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        String[] number={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        System.out.println("Enter a Number : ");
        int a=ip.nextInt(),b=0;
        while(a!=0){
            b=b*10+a%10;
            a/=10;
        }
        while(b!=0){
            System.out.print(number[b%10]+" ");
            b/=10;
        }
    }
}

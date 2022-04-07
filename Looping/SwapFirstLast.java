package corp.skull.Looping;

import java.util.Scanner;

public class SwapFirstLast {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        int num, swappedNum,firstDigit, lastDigit, digits;
        System.out.println("Enter a number : ");
        num=ip.nextInt();
        lastDigit  = num % 10;
        digits     = (int)Math.log10(num);
        firstDigit = (int)(num / Math.pow(10, digits));
        swappedNum  = lastDigit;
        swappedNum *= (int) Math.pow(10, digits);
        swappedNum += num % ((int) Math.pow(10, digits));
        swappedNum -= lastDigit;
        swappedNum += firstDigit;
        System.out.println("Swapped Number : "+swappedNum);
    }
}

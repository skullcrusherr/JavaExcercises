package corp.skull.Conditional;

import java.util.Scanner;

public class NoOfNotes {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        int amount;
        int note500 = 0, note100 = 0, note50 = 0, note20 = 0, note10 = 0, note5=0, note2=0, note1=0;
        System.out.println("Enter the amount : ");
        amount=ip.nextInt();
        if(amount >= 500){
            note500 = amount/500;
            amount -= note500 * 500;
        }
        if(amount >= 100){
            note100 = amount/100;
            amount -= note100 * 100;
        }
        if(amount >= 50){
            note50 = amount/50;
            amount -= note50 * 50;
        }
        if(amount >= 20){
            note20 = amount/20;
            amount -= note20 * 20;
        }
        if(amount >= 10){
            note10 = amount/10;
            amount -= note10 * 10;
        }
        if(amount >= 5){
            note5 = amount/5;
            amount -= note5 * 5;
        }
        if(amount >= 2){
            note2 = amount /2;
            amount -= note2 * 2;
        }
        if(amount >= 1){
            note1 = amount;
        }
        System.out.println("500 : "+note500+"\n100 : "+note100+"\n50 : "+note50+"\n20 : "+note20+"\n10 : "+note10+"\n5 : "+note5+"\n2 : "+note2+"\n1 : "+note1);
    }
}

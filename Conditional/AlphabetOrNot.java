package corp.skull.Conditional;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char a=ip.next().charAt(0);
        if((a>='A'&&a<='Z')||(a>='a'&&a<='z')){
            System.out.println("It's an Alphabet");
        }
        else{
            System.out.println("It's not an Alphabet");
        }
    }
}

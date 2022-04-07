package corp.skull.Conditional;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char a=ip.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='O'||a=='U'){
            System.out.println("It's a Vowel");
        }
        else{
            System.out.println("It's a Consonent");
        }
    }
}

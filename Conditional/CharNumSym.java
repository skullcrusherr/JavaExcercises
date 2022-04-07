package corp.skull.Conditional;

import java.util.Scanner;

public class CharNumSym {
    public static void main(String [] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char a=ip.next().charAt(0);
        if(a>='A'&&a<='Z'){
            System.out.println("Capital Letter");
        }
        else if(a>='a'&&a<='z'){
            System.out.println("Small Letter");
        }
        else if(a>='0'&&a<='9'){
            System.out.println("Number");
        }
        else{
            System.out.println("Special Character");
        }
    }
}

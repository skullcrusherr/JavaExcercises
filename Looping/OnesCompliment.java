package corp.skull.Looping;
import java.util.Scanner;
public class OnesCompliment {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a binary number : ");
        String bin=ip.nextLine();
        char[] a=bin.toCharArray();
        char[] b=new char[100];
        for(int i=0; i<bin.length(); i++)
        {
            if(a[i] == '1')
            {
                b[i] = '0';
            }
            else if(a[i] == '0')
            {
                b[i] = '1';
            }
            else
            {
                System.out.println("Invalid Input");
                break;
            }
        }
        bin="";
        for(int i=0;i< a.length;i++){
            bin+=b[i];
        }
        System.out.println("Ones Compliment : "+bin);
    }
}

package corp.skull.Looping;
import java.util.Scanner;
public class Tables {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=ip.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a+"*"+i+"="+a*i);
        }
    }
}

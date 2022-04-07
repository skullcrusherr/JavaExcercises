package corp.skull.NumberSeries;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
        int a,b,c,i,n;
        int[] arr=new int[100];
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a number : ");
        c=a= ip.nextInt();
        i=0;
        while(a!=0){
            arr[i++]=a%10;
            a/=10;
        }
        n=i;
        b=0;
        for(i=0;i<n;i++){
            b+=Math.pow(arr[i],n);
        }
        if(b==c){
            System.out.println("Number is Armstrong");
        }
        else {
            System.out.println("Number is not Armstrong");
        }
    }
}

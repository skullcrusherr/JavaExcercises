package corp.skull.Array;
import java.util.Scanner;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int[] a=new int[100];
        int i,n,r;
        System.out.println("Enter n : ");
        n=ip.nextInt();
        System.out.println("Enter Array Elements : ");
        for(i=0;i<n;i++){
            a[i]=ip.nextInt();
        }
        System.out.println("Enter r : ");
        r= ip.nextInt();
        System.out.println("Array After Rotation : ");
        for(i=r;i<n;i++){
            System.out.print(a[i]+", ");
        }
        for(i=0;i<r;i++){
            System.out.print(a[i]+", ");
        }
    }
}

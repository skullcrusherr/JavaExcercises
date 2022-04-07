package corp.skull.Array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int[] a=new int[100];
        int n,i;
        System.out.println("Enter n : ");
        n=ip.nextInt();
        System.out.println("Enter array elements : ");
        for(i=0;i<n;i++){
            a[i]= ip.nextInt();
        }
        System.out.println("Reverse of Array is : ");
        for (i=n-1;i>=0;i--){
            System.out.print(a[i]+", ");
        }
    }
}

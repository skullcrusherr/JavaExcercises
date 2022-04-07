package corp.skull.Array;

import java.util.Scanner;

public class ArraySeperation {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int[] a=new int[100];
        int i,n;
        System.out.println("Enter n : ");
        n=ip.nextInt();
        System.out.println("Enter Array Elements : ");
        for(i=0;i<n;i++){
            a[i]=ip.nextInt();
        }
        System.out.println("Even Elements : ");
        for(i=0;i<n;i++){
            if(a[i]%2==0) {
                System.out.println(a[i] + ", ");
            }
        }
        System.out.println("Odd Elements : ");
        for(i=0;i<n;i++){
            if(a[i]%2!=0) {
                System.out.println(a[i] + ", ");
            }
        }
    }
}

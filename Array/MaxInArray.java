package corp.skull.Array;

import java.util.Scanner;

public class MaxInArray {
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
        int max=a[0];
        for(i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum is : "+max);
    }
}

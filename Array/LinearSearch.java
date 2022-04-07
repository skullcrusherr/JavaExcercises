package corp.skull.Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int[] a=new int[100];
        int i,n,data;
        System.out.println("Enter n : ");
        n=ip.nextInt();
        System.out.println("Enter Array Elements : ");
        for(i=0;i<n;i++){
            a[i]=ip.nextInt();
        }
        System.out.println("Enter Data to Search : ");
        data= ip.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==data){
                System.out.println("Elemet Found");
                System.exit(0);
            }
        }
        System.out.println("Element not Found");
    }
}

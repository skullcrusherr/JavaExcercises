package corp.skull.Array;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int[] a=new int[100];
        int i,j,n,key,temp,first,last,middle;
        System.out.println("Enter n : ");
        n= ip.nextInt();
        System.out.println("Enter Array Elements : ");
        for(i=0;i<n;i++) {
            a[i]= ip.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Enter key for Searching : ");
        key= ip.nextInt();
        first = 0;
        last = n - 1;
        middle = (first+last)/2;
        while (first <= last)
        {
            if (a[middle] < key) first = middle + 1;
            else if (a[middle] == key)
            {
                System.out.println(key+" found at position "+middle);
                break;
            }
            else last = middle - 1;
            middle = (first + last)/2;
        }
        if (first > last)
            System.out.println("Key not Found");
    }
}

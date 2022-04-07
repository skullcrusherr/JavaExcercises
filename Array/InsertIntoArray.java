package corp.skull.Array;
import java.util.Scanner;
public class InsertIntoArray {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int[] a=new int[100];
        int i,n,data,index;
        System.out.println("Enter n : ");
        n=ip.nextInt();
        System.out.println("Enter Array Elements : ");
        for(i=0;i<n;i++){
            a[i]=ip.nextInt();
        }
        System.out.println("Enter Index to Insert : ");
        index=ip.nextInt();
        if(index>=n){
            System.out.println("Incorrect Index");
            System.exit(0);
        }
        System.out.println("Enter Data to Insert : ");
        data=ip.nextInt();
        for(i=n;i>index;i--){
            a[i]=a[i-1];
        }
        a[index]=data;
        n++;
        System.out.println("Array After Insertion : ");
        for(i=0;i<n;i++){
            System.out.print(a[i]+", ");
        }
    }
}

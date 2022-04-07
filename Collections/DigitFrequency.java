package corp.skull.Collections;

import java.util.Scanner;
import java.util.TreeMap;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a number : ");
        long a= ip.nextLong();
        TreeMap <Integer,Integer> digitFreq=new TreeMap();
        while(a!=0){
            if(digitFreq.containsKey((int)a%10)){
                digitFreq.put((int) (a%10),digitFreq.get((int)a%10)+1);
            }
            else{
                digitFreq.put((int) (a%10),1);
            }
            a/=10;
        }
        for(Integer i:digitFreq.keySet()){
            System.out.println(i+" : "+digitFreq.get(i));
        }
    }
}

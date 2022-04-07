package corp.skull.Collections;
import java.util.ArrayList;
public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("Apple");
        al.add(100);
        al.add(2.3f);
        al.add('a');
        System.out.println(al);
        for(Object i:al){
            System.out.println(i);
        }
    }
}

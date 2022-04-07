package corp.skull.Collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push("Apple");
        s.push("Ball");
        s.push("Cat");
        System.out.println(s);
        int n= s.size();
        for(int i=0;i<n;i++){
            System.out.println(s.pop());
        }
    }
}

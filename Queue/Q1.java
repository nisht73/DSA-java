import java.util.*;

public class Q1 {
    public static  ArrayList<String> genrateBinary(int n){
         Queue<String> q = new LinkedList<>();
         ArrayList<String> result = new ArrayList<>();
         q.add("1");

         while(n-- > 0){
            String s1 = q.peek();
            q.remove();
            result.add(s1);
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");

         }
         return result;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(genrateBinary(n));
    }
}

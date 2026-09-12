import java.util.*;

public class Q4 {
    public static Queue reverseKel(Queue<Integer> q , int k){
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }
        for (int i = 0; i < k; i++) {
            q.add(s.pop());
        }
        for (int i = 0; i <q.size() - k; i++) {
            q.add(q.remove());
        }

        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        System.out.print(reverseKel(q, 5));

    }
}

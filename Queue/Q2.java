import java.util.PriorityQueue;

public class Q2 {
    public static int minCost(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i =0 ; i< arr.length; i++){
            pq.add(arr[i]);
        }
        int minCost = 0;
        while(pq.size() > 1){
            int s1 = pq.poll();
            int s2 = pq.poll();

            minCost += s1 + s2;
            pq.add(s1+s2);
        }
        return minCost;
    }
    public static void main(String[] args) {
        int arr [] = {3,2,4,5};
        System.out.println(minCost(arr));
    }
}

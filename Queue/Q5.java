import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Q5 {

    public static ArrayList<Integer> MaxSubarr(int arr[] , int n , int k){
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            
            //remove elements that are outside the window
            if (!dq.isEmpty() && dq.peekFirst() <= i-k) {
                dq.removeFirst();
            }
            //remove smaller elements from back
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.removeLast();
            }

            // add the current index
            dq.addLast(i);

            //when the window size reaches k , front is the maximum
            if (i >= k-1) {
                ans.add(arr[dq.peekFirst()]);
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,4,5,2,3,6};
        int N = arr.length;
        
        System.out.print(MaxSubarr(arr,N,3));
    }
}

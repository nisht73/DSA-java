import java.util.*;

public class fracKnapsack{
    public static void main(String[] args) {
        int wt[] = {10, 20, 30};
        int value[] = {60, 100, 120};
        int W = 50;

        double ratio[][] = new double[value.length][2];
        // 0th col => idx; 1st col => ratio

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)wt[i];
        }
         
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        
        int capacity = W;
        int finalValue =0;
        for (int i = ratio.length - 1; i >=0; i--) {
            int idx = (int)ratio[i][0];
            if(capacity >= wt[idx]){ //include full item
                finalValue += value[idx];
                capacity -= wt[idx];
            } else{
                //include fractional
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("final value = " + finalValue);
    }
}
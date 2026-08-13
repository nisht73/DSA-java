package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activitySelection {

    public static int activitySelect(int start[],int end[], ArrayList<Integer> ans){
        
        //sorting
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        } 

        Arrays.sort(activities, Comparator.comparing(o -> o[2]));
         


        //1st activity 
        int maxAct = 1;
        ans.add(activities[0][0]);               // .add(0)
        int lastEnd = activities[0][2];         // end[0]
        for (int i = 1; i < end.length; i++) {
            if(activities[i][1] >= lastEnd){    //start[i]
                //activity select
                maxAct++;
                ans.add(activities[i][0]);      //add(i)
                lastEnd = activities[i][2];     // end[i]
            }
        }
        return maxAct;
    }
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5 };
        int end[] = {2, 4, 6, 7, 9, 9};

        //end time basis sorted
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println("max activities = " + activitySelect(start, end, ans));

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();


    }
}

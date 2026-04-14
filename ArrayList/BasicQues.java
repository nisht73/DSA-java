import java.util.ArrayList;
import java.util.Collections;

public class BasicQues {

    public static void swap(ArrayList<Integer> list , int idx1,int idx2){
           int temp = list.get(idx1);
           list.set(idx1, list.get(idx2));
           list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int idx1 = 1 , idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        System.out.println(list);

        // soting
        Collections.sort(list); //ascending
        System.out.println(list);

        //descending
        Collections.sort(list, Collections.reverseOrder());
        //comparator - fnx logic
        System.out.println(list);

        //multidimensional Arraylist
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainlist.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(16);
        mainlist.add(list2);

        for(int i=0; i<mainlist.size();i++){
            ArrayList<Integer> currList = mainlist.get(i);
           for(int j=0; j<currList.size();j++) {
            System.out.print(currList.get(j) + " ");
           }
           System.out.println();
        }
    }
}

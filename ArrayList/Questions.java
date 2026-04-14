import java.util.ArrayList;
import java.util.Collections;

public class Questions {
    public static boolean isMono(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                dec = false;
            }
            if (list.get(i) < list.get(i + 1)) {
                inc = false;
            }
        }
        return inc || dec;
    }

    public static ArrayList<Integer> findLonely(ArrayList<Integer> list){
        Collections.sort(list);
        ArrayList<Integer> lone = new ArrayList<>();
        for(int i =1; i<list.size()-1; i++){
            if(list.get(i-1) + 1 < list.get(i) && list.get(i) +1 < list.get(i+1)){
                lone.add(list.get(i));
            }
        }
        if(list.size() ==1){
            lone.add(list.get(0));
        }
        
        if(list.size()>1){
            //for first element
            if(list.get(0) +1 < list.get(1)){
                lone.add(list.get(0));
            }
            //for last element
            if(list.get(list.size()-2) +1 < list.get(list.size()-1)){
                lone.add(list.get(list.size()-1));
            }
        }

        return lone;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(9);
        System.out.println(findLonely(list));
    }

}
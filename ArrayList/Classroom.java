import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        // Java collection framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);

        // list.add(1,9); //O(n)

        // // delete
        // list.remove(2);

        // // get operation
        // int element = list.get(2);
        // System.out.println(element);

        // //set operation
        // list.set(2,10);
        // System.out.println(list);

        // //contains
        // System.out.println(list.contains(1));

        //reverse print
        for(int i = list.size() -1; i>=0; i-- ){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Max
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }

        System.out.println("maxElement: " + max);
        
        
    }
}

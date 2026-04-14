import java.util.ArrayList;
 public class pairSum1 {

    // public static boolean pairSum(ArrayList<Integer> list, int target){
    //     for(int i=0; i<list.size();i++){
    //         for(int j= i+1; j<list.size();j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //2 pointer
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp =0 ;
        int rp = list.size()-1;

        while(lp != rp){
            //case1
            if(list.get(rp)+ list.get(lp) == target){
                return true;
            }
            if(list.get(rp)+ list.get(lp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;

        System.out.println(pairSum(list, target));
    }
    
 }
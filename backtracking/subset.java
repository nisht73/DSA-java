package backtracking;

public class subset {
    public static void findSubset(String str,String ans , int i ){
         //base case
          if(i== str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
            System.out.println(ans);               
            }
            return;
          }
         //recursion
         //yes choice
         findSubset(str, ans+str.charAt(i), i+1);
        //no choice
        findSubset(str, ans, i+1);

    }

    public static void findPermutation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String Newstr = str.substring(0,i) + str.substring(i+1);
            findPermutation(Newstr, ans+curr);
        }
    
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}

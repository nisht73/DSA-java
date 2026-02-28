public class Duplicates {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr , boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int freindsPairing(int n){
     if(n==1 || n==2){
        return n;
     }

        // //choices
        // //single
        // int fnm1 = freindsPairing(n-1);

        // //pair
        // int fnm2 = freindsPairing(n-2);
        // int pairways = (n-1)* fnm2;

        // //totalWays
        // int totalWays = fnm1 + pairways;
        // return totalWays;

        return freindsPairing(n-1) + (n-1) * freindsPairing(n-2)
    }
    public static void main(String[] args) {
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26] );

        System.out.println(freindsPairing(3));
    }
}

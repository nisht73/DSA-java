class Questions {

    // public static String longestCommonPrefix(String[] strs) {
    //     StringBuilder target = new StringBuilder(strs[0]);
    //     StringBuilder sb = new StringBuilder("");

    //     for (int i = 1; i < strs.length; i++) {
    //         for (int j = 0; j < Math.min(strs[i].length(), target.length()); j++) {
    //             if (strs[i].charAt(j) == target.charAt(j)) {
    //                 sb.append(strs[i].charAt(j)); 
    //             } else {
    //                 return "not found"; 
    //             }
    //         }
    //         target = sb; 
    //         sb = new StringBuilder("");
    //         if (target.length() == 0) return "";
    //     }

    //     return target.toString(); 
    // }

    public static String longestCommonPrefix(String[] strs){
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
       System.out.println(longestCommonPrefix(strs));
    }
}
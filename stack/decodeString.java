import java.util.Stack;

public class decodeString {
    public static String Decode(String s){
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        int count = 0 ;
        String curr = "";
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                count = count * 10 + ( c - '0');
            } else if(c == '['){
                countStack.push(count);
                stringStack.push(curr);
                count = 0 ;
                curr = "";
            } else if(c == ']'){
                StringBuilder decodedString = new StringBuilder(stringStack.pop());
                int repeat = countStack.pop();
                for(int i =1 ; i<=repeat;i++){
                    decodedString.append(curr);
                }
                curr = decodedString.toString();
            } else{
                curr += c;
            }
        }
        return curr;
    }
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(Decode(s));
    }
}

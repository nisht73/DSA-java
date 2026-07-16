import java.util.Stack;

public class SimplifyPath {
    public static String simplifyPath(String path){
        Stack<String> s = new Stack<>();
        String[] arr = path.split("/");
        
        for(String i : arr){
            // Use .equals() for content comparison
            if (i.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else if (!i.isEmpty() && !i.equals(".")) {
                s.push(i);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(String i : s){
            sb.append("/");
            sb.append(i);
        }
        
        return sb.length() == 0 ? "/" : sb.toString();
    }

    public static void main(String[] args) {
        String path = "/a/..";
        System.out.println(simplifyPath(path)); // Outputs: /
    }
}
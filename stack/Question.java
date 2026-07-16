import java.util.*;

 class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            this.next = null;
        }
}

public class Question {
    public static Boolean isPalindrome(Node head){
        Node temp = head;
        Stack<Character> stack = new Stack<>();

        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            char top = stack.pop();

            if(temp.data != top){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head = new Node('A');
        head.next = new Node('D');
        head.next.next = new Node('c');
        head.next.next.next = new Node('B');
        head.next.next.next.next = new Node('A');
        
        if(isPalindrome(head)){
            System.out.println("Yes it is Palindrome");
        }else{
            System.out.println("False");
        }
    }

}

import java.util.Scanner;

public class q1 {
    public static int average(int a,int b ,int c){
        int avg = (a + b + c )/3;
        return avg;
    }
    public static boolean isEven(int a){
        if(a%2 == 0){
            return true;
        };
        return false;
    }
    public static boolean palindrome(int a){
        int reversed = 0;
        int number = a;
        
        while(a != 0){
            int digit = a % 10;
            reversed = reversed * 10 + digit;
            a/= 10;
        };
        if(reversed == number){
            return true;
        };
         return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println(isEven(a));
        System.out.println(palindrome(a));
    }
}

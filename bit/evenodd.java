package bit;

public class evenodd {
    public static void checkEvenOdd(int num){
        int bitMask = 1;
        if((num & bitMask) == 0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd ");
        }
    }
    public static void main(String[] args) {
        checkEvenOdd(3);
        checkEvenOdd(14);
    }
}

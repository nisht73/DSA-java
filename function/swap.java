public class swap {
    public static void swapp(int a, int b){
         //swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.err.println("b =" + b); 
    }
    public static void main(String[] args) {
        //swap values exchange
        int a =5;
        int b = 10;
        swapp(a , b);  

    }
}

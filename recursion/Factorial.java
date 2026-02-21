package recursion;

public class Factorial {
    public static int Printfac(int n){
        if(n == 0){
            return 1;
        }
        return n * Printfac(n-1);

    }
    public static int sumNnum(int n){
        if(n==1){
            return 1;
        }
        return n + sumNnum(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumNnum(n));
    }
}
  
public class factorial {
    public static int factorials(int n){
        int f=1;

        for(int i =1; i<=n; i++){
             f*= i;
        }
        return f; //factorial of n
    }
    public static int binCoeff(int n , int r){
       int fact_n = factorials(n);
       int fact_r = factorials(r);
       int fact_nmr =factorials(n-r);
       int binCoeff = fact_n/ (fact_r *fact_nmr);
       return binCoeff;
    }
    //  // add two numbers
    // public static int sum (int a, int b){
    //     return a + b;
    // }
    //   // add three numbers
    //  public static int sum (int a, int b, int c){
    //     return a + b + c;
    // }

    public static int sum(int a , int b){
        return a + b;
    }
    public static float sum(float a , float b){
        return a + b;
    }

    public static void main(String[] args) {
        // int fac = factorials(8);
        // System.out.println(fac);

        // int bino = binCoeff(8, 5);
        // System.out.println(bino );
           System.out.println(sum(8,5));
           System.out.println(sum(5.8f,4.8f));

    }
   
}
 
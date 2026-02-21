package recursion;

public class Fibonaccinum {
    public static int Printfibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return Printfibonacci(n-1)+ Printfibonacci(n-2);
    }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(isSorted(arr, 0));
    }
}

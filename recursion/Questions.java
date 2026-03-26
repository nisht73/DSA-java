public class Questions{
        static String nums[] = {"zero","one","two","three","four","five", "six","seven","eight","nine"};
    public static int PrintOccurence(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        if( arr[i] == key){
            System.out.print(i + " ");
        }
        return PrintOccurence(arr, i+1, key);
    }

    public static void NumToString(String nums[], String number, int i) {
    if(i == number.length()){
        return;
    }

    int digit = number.charAt(i) - '0';
    System.out.print(nums[digit] + " ");

    NumToString(nums, number, i+1);
   }
   public static int length(String str, int i){
    if(i == str.length()){
        return 0 ;
    }
    return 1 + length(str, i+1);
   }
    public static void main(String[] args) {
        
        int arr[] ={3,2,4,5,6,2,7,2,2};
        int key = 2;
        System.out.println(length("helloooo", 0));
    };
}
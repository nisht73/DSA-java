public class reverse {
    // reverse an array

    public static void revArray(int numbers[]){
         int first = 0 , last = numbers.length -1;

        while(first < last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] =temp;

            first++;
            last--;
        }
    }
    public static void pairs(int numbers[]){
        for(int i=0; i<numbers.length; i++) {
            int current = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + current + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }
    public static void printSubarray(int numbers[]){
        int ts= 0;
        for(int i=0 ; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays =  " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = {2 , 4 , 6 , 8 , 10 };

        // revArray(numbers);
        // for(int i=0; i<numbers.length; i++){
        //     System.out.print(numbers[i] +" ");

        // }
        // System.out.println();
        // pairs(numbers);
        printSubarray(numbers);
    }
}

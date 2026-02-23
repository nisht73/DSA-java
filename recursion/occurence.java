public class occurence {
    public static int FirstOccurence(int arr[],int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOccurence(arr,key,i+1);
    }
    public static int LastOccurence(int arr[],int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = LastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }
    public static int pow(int x , int n){
        if(n == 0){
            return 1;
        }
        return x * pow(x, n-1);

    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(pow(2, 5));
    }
}
public class Question3 {
    public static int mergeSort(int arr[], int si, int ei ){
        int count = 0;
        
        if(si<ei){
        int mid = si + (ei-si)/2;
        count += mergeSort(arr, si, mid);
        count += mergeSort(arr, mid+1, ei);
        count += merge(arr, si, mid, ei) ;
        }
        return count;
    }
    public static int merge(int arr[], int si ,int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid +1;
        int k =0 ;
        int count = 0;

        while(i <= mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = temp[j++];
                count += (mid -i +1); // key line
            }
        }
        //left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for(k=0, i=si; k<temp.length; k++,  i++){
            arr[i] = temp[k];
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        int result = mergeSort(arr, 0, arr.length-1);
        System.out.println("inversion count:" + result);
    }
}

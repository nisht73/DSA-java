public class Question2 {
    public static int majorityElement(int nums[]){
        return solve(nums,0,nums.length-1);
    }
    private static int solve(int nums[],int lo, int hi){
        //base case
        if(lo==hi) return nums[lo];

        int mid = lo + (hi-lo)/2;

        //recurse both halves
        int leftMaj = solve(nums, lo, mid);
        int rightMaj = solve(nums, mid+1, hi);

        //if both halves agree no need to count
        if(leftMaj == rightMaj) return leftMaj;

        //count each candidate in the current range

        int leftCount = countInRange(nums, leftMaj,lo,hi);
        int rightCount = countInRange(nums,rightMaj,lo,hi);

        return leftCount > rightCount ? leftMaj : rightMaj;
    }
    private static int countInRange(int nums[],int target, int lo, int hi){
        int count = 0;
        for(int i=lo ; i<=hi ; i++){
            if(nums[i]==target) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] ={2,2,1,1,2};
        System.out.println(majorityElement(nums));
    }
}

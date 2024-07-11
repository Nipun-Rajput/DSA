public class Binary_search {
    public static void main(String[] args) {
        int arr[] = {10,20,30,35};
        int low = 0;
        int high = arr.length-1;
        int target = 35;
        int ans = 0;
        while(high>=low){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                ans = mid;
                break;
            }
            else if(target>mid){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        System.out.println(ans);
    }
}

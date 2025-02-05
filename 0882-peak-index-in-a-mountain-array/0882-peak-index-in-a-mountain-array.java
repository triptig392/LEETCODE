class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int si = 0;
        int ei = arr.length-1;
        int mid = 0;

        while(si<=ei){
            if(ei-si < 2){
                if(si != -1 && ei != -1 && arr[si]>arr[ei]){
                    return si;
                }else{
                    return ei;
                }
            }

            mid = (si+ei)/2;

            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }else if(arr[mid] < arr[mid-1]){
                ei = mid-1;
            }else{
                si=mid+1;
            }
        }

        return si;
    }
}
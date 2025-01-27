class Solution {
    public int mySqrt(int x) {
        if(x==0 || x == 1){
            return x;
        }
        int l = 1;
        int r = x;

        while(l<=r){
            int mid = l+(r-l)/2;
            long sq = (long)mid*mid;

            if(sq == x){
                return mid;
            }else if(sq < (long)x){
                l = mid+1;
            }else{
                r=mid-1;
            }
        }
        System.out.println(l+"  " +r);
        return Math.round(r);
    }
}
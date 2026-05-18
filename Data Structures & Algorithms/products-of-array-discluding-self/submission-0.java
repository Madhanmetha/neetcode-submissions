class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int a=1;
            for(int j=0;j<nums.length;j++){
                if(j!=i) {
                     a*=nums[j];
                }
            }
                arr[i]=a;

        }return arr;
    }
}  

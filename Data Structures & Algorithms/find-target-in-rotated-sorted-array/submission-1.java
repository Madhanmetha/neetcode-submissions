class Solution {
    public int search(int[] nums, int target) {
        int pivot = pivotFind(nums);
        int ans = search(pivot, nums, target);
        return ans;
    }

    static int binarySearch(int target, int[] arr, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }return -1;
    }

    static int search(int pivot, int[] arr, int target){
        if(pivot == -1) return binarySearch(target, arr, 0, arr.length - 1);
        else if(arr[pivot] == target) return pivot;
        else if(arr[0] > target) return binarySearch(target, arr, pivot+1, arr.length - 1);
        else return binarySearch(target, arr, 0, pivot);
    }

    static int pivotFind(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start+(end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1]) return mid;
            else if(mid > start && arr[mid] < arr[mid - 1]) return mid-1;
            else if(arr[mid] >= arr[start]) start = mid + 1;
            else end = mid - 1; 
        }return -1;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] arr = new int[k];
        ArrayList<Integer> dum = new ArrayList<>(map.keySet());
        dum.sort((a,b) -> map.get(b) - map.get(a));

        for(int i = 0 ; i < k ; i++){
            arr[i] = dum.get(i);
        }
        
        return arr;
    }
}

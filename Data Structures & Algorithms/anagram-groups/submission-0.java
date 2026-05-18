class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String join = new String(arr);
            if(!map.containsKey(join)){
                map.put(join,new ArrayList<>());
            }
            map.get(join).add(word);
        }return new ArrayList<>(map.values());
    }
}

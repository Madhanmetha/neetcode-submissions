class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> arr = new ArrayList<>();
        int i = 0;
        while (i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int size = Integer.parseInt(str.substring(i,j));
            j++;
            String word = str.substring(j,j+size);
            arr.add(word);
            i = j + size;

        }
        return arr;
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        while(left<=right){
            

            // skip non-alphanumeric on left
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            // skip non-alphanumeric on right
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            // fails when not same
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            
            else {
                left++;
                right--;
            }
        }return true;
    }
}

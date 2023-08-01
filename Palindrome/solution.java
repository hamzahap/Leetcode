class Solution {
    public boolean isPalindrome(int x) {
        String y = String.valueOf(x);
        for(int i = 0; i < y.length()/2;i++)
        {
            if(!(y.substring(i,i+1)).equals(y.substring(y.length()-1-i,y.length()-i)))
            {
                return false;
            }
        }
        return true;
    }
}
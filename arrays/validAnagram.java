
class Solution {
    public boolean isAnagramn(String s, String t){
        //checkign to se iof both strigns re same length becuase if not, return false since they cant be anagaram
        if (s.length() != t.length()) return false;

        //create an array to count character frequencies, 26 letters for alphabet
        int[] charCounts = new int[26];

        //increment count for each character in s and decrement for each in t
        for (int i= o; i < s.length(); i++){
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        //now check if all counts are zero. if count is not 0 then should return fals since it is not anagram
        for( int count : charCounts ){
            if (count != 0) return false;
        }
         return true;
    }
}
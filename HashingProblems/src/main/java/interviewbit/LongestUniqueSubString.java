package interviewbit;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string,
 find the length of the longest substring without repeating characters.

 Example:

 The longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.

 For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class LongestUniqueSubString {

    public int lengthOfLongestSubstring(String a) {

        if(a == null || a.length() == 0) {
            return 0;
        }

        int max_length = Integer.MIN_VALUE;
        int currLength = 0 ;

        Map<Character, Integer> charToIndexMap = new HashMap<Character, Integer>();
        int i = 0;
        while(i < a.length()) {
            char c = a.charAt(i);
            if(!charToIndexMap.containsKey(c)) {
                currLength++;
                charToIndexMap.put(c, i);
                i++;
            } else {
                if(currLength > max_length) {
                    max_length = currLength;
                }
                i = charToIndexMap.get(c) + 1;
                charToIndexMap.clear();
                currLength = 0;
            }
        }
        if(currLength > max_length) {
            max_length = currLength;
        }
        return max_length;
    }

    public static void main(String args[]) {
        System.out.println(new LongestUniqueSubString().lengthOfLongestSubstring("dadbc"));
    }
}

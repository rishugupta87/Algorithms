package interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to
 the target, where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based.
 Put both these numbers in order in an array and return the array from your function ( Looking at the
 function signature will make things clearer ). Note that, if no pair exists, return empty list.

 If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions with the
 minimum index2, choose the one with minimum index1 out of them.

 Input: [2, 7, 11, 15], target=9
 Output: index1 = 1, index2 = 2
 */
public class TwoSum {

    public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
        Map<Integer, Integer> numToIndexMap = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        //iterate over the list, if map does not contain(target - current) put in map else note indices
        for(int i = 0 ; i < a.size(); i++) {
            int numToLook = b - a.get(i);

            //the second condition is for handling duplicates. need to take minimum index of duplicate
            if(!numToIndexMap.containsKey(numToLook) && (!numToIndexMap.containsKey(a.get(i)))) {
                numToIndexMap.put(a.get(i), i + 1);
            } else if(numToIndexMap.containsKey(numToLook)){ //you found a pair
                int index1 = numToIndexMap.get(numToLook);
                int index2 = i+1;
                if(!result.isEmpty()) {
                    if(index2 < result.get(1)) {
                        result.set(0, index1);
                        result.set(1, index2);
                    } else if(index2 == result.get(1) && index1 < result.get(0)) {
                        result.set(0, index1);
                        result.set(1, index2);
                    }
                } else {
                    result.add(index1);
                    result.add(index2);
                }
            }
        }

        return result;
    }

    public static void main(String args[]) {
        System.out.println(new TwoSum().twoSum(Arrays.asList(4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8), -3));
    }
}

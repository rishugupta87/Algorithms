package geeks;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an unsorted array of integers, find a subarray which adds to a given number.
 * If there are more than one subarrays with sum as the given number, print any of them.
 */
public class SubarrayGivenSum {

    /**
     * An efficient way is to use a map. The idea is to maintain sum of elements encountered so far in a variable (say curr_sum).
     * Let the given number is sum. Now for each element, we check if curr_sum – sum exists in the map or not. If we found it in the map that means,
     * we have a subarray present with given sum, else we insert curr_sum into the map and proceed to next element. If all elements of the array are processed
     * and we didn’t find any subarray with given sum, then subarray doesn’t exists.
     *
     * @param arr
     * @param n
     * @param sum
     * @return
     */
    void subArraySum(int arr[], int n, int sum) {

        Map<Integer, Integer> currSumToIndexMap = new HashMap<Integer, Integer>();

        int currSum = 0;
        for(int i = 0 ; i < n; i++) {
            currSum+= arr[i];

            if(!currSumToIndexMap.containsKey(currSum - sum)) { //no such subarray
                currSumToIndexMap.put(currSum, i);
            } else { //there is such a subarray so need to exlude this subarray to get the right sum
                int subArrayEndIndex = currSumToIndexMap.get(currSum - sum); //there is a subarray existing with this end index.
                //so the right subarray should exists from (subArrayEndIndex+1, i)
                System.out.printf("subarray exists from %d to %d", subArrayEndIndex+1, i);
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        SubarrayGivenSum arraysum = new SubarrayGivenSum();
        int arr1[] = {1, 4, 20, 3, 10, 5};
        int arr2[] = {-10, 0, 2, -2, -20, 10};
        int n = arr2.length;
        arraysum.subArraySum(arr1, n, 33);
        System.out.println();
        arraysum.subArraySum(arr2, n, -12);
    }
}

package geeks;

/**
 * Given an array of integers, find the length of the longest sub-sequence such that elements in the
 * subsequence are consecutive integers, the consecutive numbers can be in any order.
 *
 Input: arr[] = {1, 9, 3, 10, 4, 20, 2};
 Output: 4
 The subsequence 1, 3, 4, 2 is the longest subsequence
 of consecutive elements

 Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}
 Output: 5
 The subsequence 36, 35, 33, 34, 32 is the longest subsequence
 of consecutive elements.
 */
public class LongestConsecutiveSubsequence {

    /**
     * One Solution is to first sort the array and find the longest subarray with consecutive elements.
     * Time complexity of this solution is O(nLogn). Thanks to Hao.W for suggesting this solution here.

     We can solve this problem in O(n) time using an Efficient Solution. The idea is to use Hashing. We
     first insert all elements in a Hash. Then check all the possible starts of consecutive subsequences.
     Below is complete algorithm.
     *
     */
}

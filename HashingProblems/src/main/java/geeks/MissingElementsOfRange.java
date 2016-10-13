package geeks;

/**
 * Given an array arr[0..n-1] of distinct elements and a range [low, high], find all numbers that
 * are in range, but not in array. The missing elements should be printed in sorted order.
 *
 * Input: arr[] = {10, 12, 11, 15},
 low = 10, hight = 15
 Output: 13, 14

 Input: arr[] = {1, 14, 11, 51, 15},
 low = 50, height = 55
 Output: 50, 52, 53, 54
 */
public class MissingElementsOfRange {

    /**
     *
     * Put all elements between low and high in the linked hashmap with element and count
     * Then iterate over the array and check if the element exists, if yes increment count by 1
     * at the end print elements from map which have count > 1
     */

}

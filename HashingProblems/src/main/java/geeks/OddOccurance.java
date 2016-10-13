package geeks;

import java.util.Arrays;

/**
 * Created by rg029761 on 9/24/16.
 */
public class OddOccurance {

    /**
     * Given an array of positive integers. All numbers occur even number of times except one number
     * which occurs odd number of times. Find the number in O(n) time & constant space.

       Example:
       I/P = [1, 2, 3, 2, 3, 1, 3]
       O/P = 3
     */
    int getOddOccurrence(int ar[], int ar_size) {
        int res = 0;
        for (int i = 0; i < ar_size; i++) {
            res = res ^ ar[i];
        }
        return res;
    }

    /**
     * Find the two numbers with odd occurrences in an unsorted array
     *
     Input: {12, 23, 34, 12, 12, 23, 12, 45}
     Output: 34 and 45

     Input: {4, 4, 100, 5000, 4, 4, 4, 4, 100, 100}
     Output: 100 and 5000

     Input: {10, 20}
     Output: 10 and 20


     Solutions:
     We can use sorting to get the odd occurring numbers in O(nLogn) time. First sort the numbers using an O(nLogn) sorting algorithm
     like Merge Sort, Heap Sort.. etc. Once the array is sorted, all we need to do is a linear scan of the array and print the odd occurring number.

     We can also use hashing. Create an empty hash table which will have elements and their counts. Pick all elements of input array one
     by one. Look for the picked element in hash table. If the element is found in hash table, increment its count in table. If the element is not
     found, then enter it in hash table with count as 1. After all elements are entered in hash table, scan the hash table and print elements with odd count.
     This approach may take O(n) time on average, but it requires O(n) extra space.

     Best Solution with O(1) space:
     Example: arr[] = {3,5,5,3,8,6,8,15,1,1}
     take xor of all these elements: we get 9(1001) = 6(0110)^15(1111)
     looking at 9 we know that first and last bit is 1 which means the corresponding bits in x and y would be difference.
     we can use this to divide the array in two groups(one group will have all elements with last bit set as 1, other with last bit set as 0)
     group1= {3,5,5,3,15,1,1} = taking xor gives = 15
     group2= {8,6,8} = taking xor gives = 6
     */
    int[] getTwoOddOccurrence(int ar[], int ar_size) {
        //first take xor of all the elements
        int res = 0;
        for(int i = 0 ; i < ar_size; i++) {
            res = res ^ ar[i];
        }

        int leftRes = 0;
        int rightRes = 0;
        //Now divide the array in two groups
        for(int i = 0 ; i < ar_size; i++) {
            int curr = ar[i];
            String lowest = Integer.toBinaryString(curr);
            int rightbit = Character.getNumericValue(lowest.charAt(lowest.length() - 1));
            if(rightbit == 1) {
                leftRes = leftRes ^ curr; //xor left group
            } else {
                rightRes = rightRes ^ curr; //xor right group
            }
        }
        return new int[]{leftRes, rightRes};
    }

    public static void main(String[] args) {
        OddOccurance occur = new OddOccurance();
        int ar[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int n = ar.length;
        System.out.println(occur.getOddOccurrence(ar, n));

        int ar2[] = new int[]{3,5,5,3,8,6,8,15,1,1};
        int res[] = occur.getTwoOddOccurrence(ar2, ar2.length);
        System.out.printf("(%d, %d)",res[0], res[1]);
    }

}

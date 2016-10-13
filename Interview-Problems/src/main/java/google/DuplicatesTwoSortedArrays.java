package google;

/**
 * Created by rg029761 on 10/1/16.
 */
public class DuplicatesTwoSortedArrays {

    /**
     * Questions1:
     * Find duplicates between two sorted arrays
     *
     * Answer 1:
     * For Intersection of two arrays, print the element only if the element is present in both arrays.
     1) Use two index variables i and j, initial values i = 0, j = 0
     2) If arr1[i] is smaller than arr2[j] then increment i.
     3) If arr1[i] is greater than arr2[j] then increment j.
     4) If both are same then print any of them and increment both i and j.
     Time (O (m + n))
     *
     *
     * Question2:
     * What is the sizes of the two arrays is huge ?
     *
     * Solution2:
     * The idea is to iterate through the shorter array and do a binary search for every element of
     * short array in big array (note that arrays are sorted). Time complexity of this solution is
     * O(min(mLogn, nLogm)). This solution works better than the above approach when ratio of larger length
     * to smaller is more than logarithmic order.
     *
     * Question3:
     * Then the interviewer extended that question to 'second list is so long that
     * it has to be put on different block in the disk, NOW, how will you find the numbers?,
     * with minimized disk accesses!'
     *
     * Solution3:
     * Since the longlist is in different blocks, first identify min and max of each block, keep min
     * and max infor in hash table . For each block maintain a list. Check if for the new array what element lies
     * in which block and add to each block list . Now for each block ,search for all the entries in its
     * list using binary search.This way we have minimized the number of disk block accesses,which is the bottleneck.
     *
     * 
     *
     */
}

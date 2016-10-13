package karamunchi;

import java.util.Arrays;

/**
 * Created by rg029761 on 9/25/16.
 */
public class RemoveDuplicates {

    /**
     * Remove duplicates from unsorted array.
     *
     * Can be solved using hashmap if memory is allowed.
     *
     * @param arr
     * @return
     */
    int[] removeDuplicates(int[] arr) {
        return null;
    }

    /**
     * Remove duplicates from sorted array in place i.e with constant memory.
     *
     * @param arr
     * @return
     */
    int[] removeDuplicatesFromSortedArray(int[] arr) {
        if(arr.length == 0 ) {
            return null;
        }

        if(arr.length == 1) {
            return arr;
        }

        int i = 0 ;
        int j = 1;
        while(j < arr.length) {
            if(arr[i] == arr[j]) {
                j++;
                continue;
            }
            arr[++i] = arr[j];
            j++;
        }

        return Arrays.copyOf(arr, i + 1);
    }

    public static void main(String args[]) {
        int[] arr = {2,2,2,3,3,3,4,5,6,6,7,7,7,7,8};
        System.out.println(Arrays.toString(new RemoveDuplicates().removeDuplicatesFromSortedArray(arr)));
    }
}

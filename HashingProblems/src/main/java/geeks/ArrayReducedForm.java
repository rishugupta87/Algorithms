package geeks;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * Given an array with n distinct elements, convert the given array to a
 * form where all elements are in range from 0 to n-1. The order of elements is same,
 * i.e., 0 is placed in place of smallest element,
 * 1 is placed for second smallest element, … n-1 is placed for largest element.
 *
 * Input:  arr[] = {10, 40, 20}
 Output: arr[] = {0, 2, 1}

 Input:  arr[] = {5, 10, 40, 30, 20}
 Output: arr[] = {0, 1, 4, 3, 2}

 */
public class ArrayReducedForm {

    int[] convertArrayToReducedForm(int[] arr) {
        Map<Integer, Integer> valueToIndexMap = new TreeMap<Integer, Integer>();//treemap is internally implemented using  red black bst

        for(int i = 0 ; i< arr.length; i++) {
            valueToIndexMap.put(arr[i], i);
        }

        int i = 0;
        //Now get elements from treemap
        for(Map.Entry<Integer, Integer> entry: valueToIndexMap.entrySet()) {
            int key = entry.getKey(); //when you retrieve from tree map it will be like traversing bst inorder
            int indexInArray = entry.getValue();
            int rank = i; //since they will be fetched in order keep track from lowest to highest
            arr[indexInArray] = rank; //set this rank to array index position.
            i++;
        }

        return arr;
    }

    public static void main(String args[]) {
        int[] arr = {5, 10, 40, 30, 20};
        System.out.println(Arrays.toString(new ArrayReducedForm().convertArrayToReducedForm(arr)));
    }
}

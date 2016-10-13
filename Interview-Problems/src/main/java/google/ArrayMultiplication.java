package google;

import java.util.Arrays;

/**
 * 1.There is an array A[N] of N numbers. You have to
 * compose an array Output[N] such that Output[i] will be equal to multiplication of all
 * the elements of A[N] except A[i]. For example Output[0] will be multiplication of A[1] to A[N-1]
 * and Output[1] will be multiplication of A[0] and from A[2] to A[N-1].

 Solve it without division operator and in O(n).
 */
public class ArrayMultiplication {
    /**
     * Solution:
     * inputArr[] = {3, 2, 4, 3, 5, 1}
     * outputArr[] = {120, 60, 15, 5, 1, 1}
     *
     * Scan inputArr twice
     * In first pass for each element calculate cumulative multiplication on its left. we can keep storing result is some variable so we dont
     * have to do multi for every element on left.
     * store this in outputArr.
     *
     * In second pass start from right of array:
     * multiple element in outputArray with cumulative multiplication on right
     */
    public int[] findArrayMultiplcationExceptSelf(int[] inputArray) {
        int[] outputArray = new int[inputArray.length];
        int result = 1;
        //first pass
        for(int i = 0 ; i < inputArray.length; i++) {
            outputArray[i] = result;
            result = result*inputArray[i];
        }
        //second pass
        result = 1;
        for(int i = inputArray.length - 1 ; i >= 0; i--) {
            outputArray[i] = outputArray[i]*result;
            result = result*inputArray[i];
        }
        return outputArray;
    }

    public static void main(String args[]) {
        int[] array = {3, 2, 4, 3, 5, 1};
        System.out.println(Arrays.toString(new ArrayMultiplication().findArrayMultiplcationExceptSelf(array)));
    }
}

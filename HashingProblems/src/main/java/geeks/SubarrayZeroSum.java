package geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Find the largest continuous sequence in a array which sums to zero.
 *
 * Example:
   Input:  {1 ,2 ,-2 ,4 ,-4}
  Output: {2 ,-2 ,4 ,-4}


     Solution Approach: http://krishnalearnings.blogspot.in/2016/07/largest-sub-array-with-sum-equal-to.html
     ex: 1,2,-2,-1,1,2
     Sum at each index would be 1,3,1,0,1,2
     So we start searching from left 1-->3-->1. We found 1 again. It appears that after the 1st '1' we added
     something and ended with '1' again. Hence the part added i.e. <2,-2> adds up to '0', since the sum remains the same.
     Hence we can say that whenever we find 2 equal sums, nothing really got added b/w them, hence 0 is present b/w them.

 1,2,-3,-1,1,2
 1,3,0, -1,0
 */
public class SubarrayZeroSum {
    public static void main(String[] args) {
        int[] array = { -2, -2, 0, 4, 3, 2, -5 };
        int result = maxLength(array);

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(-19, 8, 2, -8, 19, 5, -2, -23));
        lszero(list);
        System.out.println(result);
    }

    public static int maxLength(int A[]) {
        int n = A.length;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int sum = 0;
        int maxLength = 0;
        hashMap.put(0, -1); // initialization
        for (int i = 0; i < n; i++) {
            sum = sum + A[i];
            Integer pSumIndex = hashMap.get(sum);
            if (pSumIndex != null) {
                int localLength = i - pSumIndex;
                if (maxLength < localLength) {
                    maxLength = localLength;
                }
            } else {
                hashMap.put(sum, i);
            }
        }
        return maxLength;
    }

    public static ArrayList<Integer> lszero(ArrayList<Integer> a) {
        Map<Integer, Integer> sumToIndexMap = new HashMap<Integer, Integer>();
        sumToIndexMap.put(0, -1);
        int currSum = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Point> list = new ArrayList<Point>();

        for(int i = 0 ; i < a.size(); i++) {
            currSum += a.get(i);
            if(sumToIndexMap.containsKey(currSum)) {
                list.add(new Point(sumToIndexMap.get(currSum), i));
            } else {
                sumToIndexMap.put(currSum, i);
            }
        }

        if(list.isEmpty()) {
            return new ArrayList<Integer>();
        }
        //sort the list based on length of two indices
        Collections.sort(list , new LengthComparator());

        for(int i = list.get(0).x + 1; i <= list.get(0).y; i++) {
            result.add(a.get(i));
        }

        return result;
    }

    static class LengthComparator implements Comparator<Point> {
        public int compare(final Point point1, final Point point2) {
            int length1 = point1.y-point1.x;
            int length2 = point2.y-point2.x;
            if(length2 > length1) {
                return 1;
            } else if(length2 == length1) {
                return 0;
            }
            return -1;
        }
    }
    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

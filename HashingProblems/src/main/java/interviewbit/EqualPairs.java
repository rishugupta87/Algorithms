package interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.interviewbit.com/problems/equal/
 *
 * Given an array A of integers, find the index of values that satisfy A + B = C + D,
 * where A,B,C & D are integers values in the array
 *
1) Return the indices `A1 B1 C1 D1`, so that
 A[A1] + A[B1] = A[C1] + A[D1]
 A1 < B1, C1 < D1
 A1 < C1, B1 != D1, B1 != C1

 2) If there are more than one solutions,
 then return the tuple of values which are lexicographical smallest.

 Assume we have two solutions
 S1 : A1 B1 C1 D1 ( these are values of indices int the array )
 S2 : A2 B2 C2 D2

 S1 is lexicographically smaller than S2 iff
 A1 < A2 OR
 A1 = A2 AND B1 < B2 OR
 A1 = A2 AND B1 = B2 AND C1 < C2 OR
 A1 = A2 AND B1 = B2 AND C1 = C2 AND D1 < D2

 Example:

 Input: [3, 4, 7, 1, 2, 9, 8]
 Output: [0, 2, 3, 5] (O index)
 *
 */
public class EqualPairs {

    /**
     * create a map of sum and list of indexes, for a particular sum you have one solution since first solution will be l
     * lexicographically smallest. However there can be multiple solutions for multiple sums.
     * Then we need to select the one which i lexicographically smallest
     *
     * 1) keep two variables to track the sum i,j
     * 2) create a map of sum(), List of indexes (i,j)
     * 3) if the sum not in map add
     * 4) if the sum is in the map, first check if the solution for that sum is already calculated by checking size
     *    if not check if the current two indexes are valid if yes add
     * 5) get all possible solutions(size == 4)
     * 6) lexicographically select the one.
     *
     * @param integers
     * @return
     */
    public ArrayList<Integer> equal(ArrayList<Integer> integers) {
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

        for(int i = 0;i < integers.size(); i++) {
            for(int j = i+1; j < integers.size(); j++) {
                int sum = integers.get(i) + integers.get(j);

                if(!map.containsKey(sum)) {
                    List<Integer> tmpList = new ArrayList<Integer>();
                    tmpList.add(i);
                    tmpList.add(j);
                    map.put(sum, tmpList);
                } else {
                    List<Integer> existingList = map.get(sum);
                    if(existingList.size() !=4 && isValid(i,j,existingList)) {
                        existingList.add(i);
                        existingList.add(j);
                    }
                }
            }
        }

        List<Solution> result = new ArrayList<Solution>();
        for(List<Integer> list : map.values()) {
            if(list.size() == 4) {
                result.add(new Solution(list.get(0), list.get(1), list.get(2), list.get(3))); //these are possible solutions
            }
        }

        Collections.sort(result, new ResultComparator());
        Solution solution = result.get(0);
        //
        return new ArrayList<Integer>(Arrays.asList(solution.index1, solution.index2, solution.index3, solution.index4));
    }

    class ResultComparator implements Comparator<Solution> {
        public int compare(final Solution solution1, final Solution solution2) {
            if(solution1.index1 < solution2.index1) {
                return -1;
            } else if(solution1.index1 == solution2.index1 && solution1.index2 < solution2.index2) {
                return -1;
            } else if(solution1.index2 == solution2.index2 && solution1.index3 < solution2.index3) {
                return -1;
            } else if(solution1.index3 == solution2.index3 && solution1.index3 < solution2.index3) {
                return -1;
            }
            return 1;
        }
    }

    class Solution {
        int index1;
        int index2;
        int index3;
        int index4;

        public Solution(int index1, int index2, int index3, int index4) {
            this.index1 = index1;
            this.index2 = index2;
            this.index3 = index3;
            this.index4 = index4;
        }
    }

    boolean isValid(int i, int j, List<Integer> list) {
        return list.get(0) < i && list.get(1) != i && list.get(1) != j;
    }

    public static void main(String args[]) {
        System.out.println(new EqualPairs().equal(new ArrayList<Integer>(Arrays.asList(3, 4, 7, 1, 2, 9, 8))));
    }
}

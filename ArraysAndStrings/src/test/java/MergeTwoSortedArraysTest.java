import org.junit.Test;

import java.util.Arrays;

/**
 * Created by rg029761 on 10/8/16.
 */
public class MergeTwoSortedArraysTest {

    @Test
    public void test1() {
        int[] a1 = {1, 5, 10, 15, 30, 50, 60, 0,0,0,0};
        int[] a2 = {3, 8, 20, 40};
        System.out.println(Arrays.toString(MergeTwoSortedArrays.merge(a1, 7, a2, 4)));
    }

    @Test
    public void test2() {
        int[] a1 = {4, 5, 10, 15, 30, 50, 60, 0, 0, 0};
        int[] a2 = {1, 2, 3};
        System.out.println(Arrays.toString(MergeTwoSortedArrays.merge(a1, 7, a2, 3)));
    }
}

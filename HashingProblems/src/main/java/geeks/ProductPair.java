package geeks;

/**
 * Given an array and a number x, find if there is a pair with product equal to x.
 */
public class ProductPair {

    /**
     * Efficient Solution ( O(n) ): We can improve time complexity to O(n) using hashing. Below are steps.

     Create an empty hash table
     Traverse array elments and do following for every element arr[i].
     If arr[i] is 0 and x is also 0, return true, else ignore arr[i].
     If x % arr[i] is 0 and x/arr[i] exists in table, return true.
     Insert arr[i] into the hash table.
     Return false

     Test cases:
     Input : arr[] = {10, 20, 9, 40};
     int x = 400;
     Output : Yes

     Input : arr[] = {10, 20, 9, 40};
     int x = 190;
     Output : No

     Input : arr[] = {-10, 20, 9, -40};
     int x = 400;
     Output : Yes

     Input : arr[] = {-10, 20, 9, 40};
     int x = -400;
     Output : Yes

     Input : arr[] = {0, 20, 9, 40};
     int x = 0;
     Output : Yes
     */
}

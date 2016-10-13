package google;

/**
 * Created by rg029761 on 10/1/16.
 */
public class FindIntegerInLargefile {

    /**
     * Given a file of 4 billion 32-bit integers, how to find one that appears at least twice?
     *
     * Solution1:
     * - 4billion * 4bytes = 16gb
     * - Assuming we have 16gb ram or memory available
     * - sort the array in o(n log n), array will be long long int for 2^32 numbers to hold
     * - another pass find duplicate by iterating array.
     *
     * Solution2:
     * In case you have multiple nodes available, a Distributed Hash Table
     * could be created and perform the same algorithm in a distributed manner with optimal time complexity.
     *
     */
}

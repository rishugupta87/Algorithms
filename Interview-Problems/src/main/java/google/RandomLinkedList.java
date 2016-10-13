package google;

/**
 * There is a linked list of numbers of length N. N is very large and you don’t know N.
 * You have to write a function that will return k random numbers from the list. Numbers should be completely random.

 Hint:

 1. Use random function rand() (returns a number between 0 and 1) and irand()
 (return either 0 or 1)
 2. It should be done in O(n).
 */
public class RandomLinkedList {

    /**
     * Obviously we can traverse the list once to find the length, generate m random numbers from 1 to length
     * of the list and traverse the list another time to pick up these items by selecting the node whose index is:
     * rand() % NumberOfNodes. A common question would be to prevent
     * you from going through the list more than once. Say the list is very long and cannot fit in memory.
     *
     * This is similar to reservoir sampling. Read later
     *
     *
     */
}

package geeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Design a data structure that supports insert, delete, search and getRandom in constant time
 *
Design a data structure that supports following operations in Θ(1) time.

 insert(x): Inserts an item x to the data structure if not already present.

 remove(x): Removes an item x from the data structure if present.

 search(x): Searches an item x in the data structure.

 getRandom(): Returns a random element from current set of elements
 */
public class MyMapImpl {

    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    List<Integer> indexList = new ArrayList<Integer>();

    //HashMap can support the first three operations.
    public void insert(int x) {
        if(!hashMap.containsKey(x)) {
            indexList.add(x);
            hashMap.put(x, indexList.size() - 1); //value keep track of index in array list where x is
        }
    }

    public int search(int x) {
        if(!hashMap.containsKey(x)) {
            return -1;
        }
        return hashMap.get(x);
    }

    public void remove(int x) {
        int indexInList = hashMap.get(x);

        //need to remove from map as well as from the array list
        hashMap.remove(x);

        // suppose list has [3,5,8,7, 2] and x = 8
        //how will you remove from list in constant time, note your hashmap has track of index of x, get that index and replace that entry in list with last element
        //then remove last element from list
        int lastElement = indexList.get(indexList.size() - 1);
        indexList.set(indexInList, lastElement); //set last element here
        indexList.remove(indexList.size() - 1);

        hashMap.put(lastElement, indexInList); //update maps index.
    }

    public int getRandom() {
        Random random = new Random();
        int randomIndex = random.nextInt(indexList.size());
        return indexList.get(randomIndex);
    }

    public static void main(String args[]) {
        MyMapImpl map= new MyMapImpl();
        map.insert(10);
        map.insert(11);
        map.insert(12);
        map.insert(13);
        map.remove(11);
        System.out.println(map.getRandom());
    }
}

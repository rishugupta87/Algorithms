import org.junit.Test;

/**
 * Created by rg029761 on 9/3/16.
 */
public class HashMapTest {

    @Test
    public void testPut() {
        Map map = new HashMap(200);
        map.put(1, "A");
       // map.put(2, "B");
        map.put(1, "C");
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(1));
        System.out.println(map.get(3));
    }
}

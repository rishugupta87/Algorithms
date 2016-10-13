import org.junit.Test;
import uber.UberMap;
import uber.UberMapInterface;

/**
 * Created by rg029761 on 9/5/16.
 */
public class UberMapTest {

    @Test
    public void testPut() {
        UberMapInterface<Integer, String> map = new UberMap<Integer, String>(200);
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        map.put(6, "F");
        map.put(7, "G");
        map.put(8, "H");
        System.out.println(map.getRandomKey());
        System.out.println(map.getRandomKey());
        System.out.println(map.getRandomKey());
        System.out.println(map.getRandomKey());
        System.out.println(map.getRandomKey());
        System.out.println(map.getRandomKey());
        System.out.println(map.getRandomKey());
        System.out.println(map.getRandomKey());
        System.out.println(map.getRandomKey());

        System.out.println("------------");
        System.out.println(map.getRandomValue());
        System.out.println(map.getRandomValue());
        System.out.println(map.getRandomValue());
        System.out.println(map.getRandomValue());
        System.out.println(map.getRandomValue());
        System.out.println(map.getRandomValue());
        System.out.println(map.getRandomValue());
        System.out.println(map.getRandomValue());
        System.out.println(map.getRandomValue());

        Object object = map.remove(1);
        System.out.println();
    }
}

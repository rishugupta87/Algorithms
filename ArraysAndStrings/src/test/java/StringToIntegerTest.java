import org.junit.Test;

/**
 * Created by rg029761 on 10/7/16.
 */
public class StringToIntegerTest {

    @Test
    public void test() {
        System.out.println(StringToInteger.convert("212"));
    }

    @Test
    public void test2() {
        System.out.println(StringToInteger.convert("-212"));
    }

    @Test
    public void test3() {
        System.out.println(StringToInteger.convert("212.21"));
    }

    @Test
    public void test4() {
        System.out.println(StringToInteger.convert("121mdd"));
    }
}

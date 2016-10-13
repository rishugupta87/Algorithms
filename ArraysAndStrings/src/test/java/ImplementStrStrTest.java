import org.junit.Test;

/**
 * Created by rg029761 on 10/8/16.
 */
public class ImplementStrStrTest {

    @Test
    public void test1() {
        String s = "Rishu is a a great visionary and enterpreneur";
        System.out.println(ImplementStrStr.strStr(s, "gre"));
    }

    @Test
    public void test2() {
        String s = "Rishu is a a great visionary and enterpreneur";
        System.out.println(ImplementStrStr.strStr(s, "great"));
    }

    @Test
    public void test3() {
        String s = "Rishu is a a great visionary and enterpreneur";
        System.out.println(ImplementStrStr.strStr(s, "pre"));
    }

    @Test
    public void test4() {
        String s = "Rishu is a a great visionary and enterpreneur";
        System.out.println(ImplementStrStr.strStr(s, "hu"));
    }

    @Test
    public void test5() {
        String s = "aaa";
        System.out.println(ImplementStrStr.strStr(s, "aa"));
    }

    @Test
    public void test6() {
        String s = "aaa";
        System.out.println(ImplementStrStr.strStr(s, "aaaa"));
    }

    @Test
    public void test7() {
        String s = "mississippi";
        System.out.println(ImplementStrStr.strStr(s, "issip"));
    }
}

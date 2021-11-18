import junit.framework.TestCase;

public class mainClassTest extends TestCase {

    public void test_int_sum() {
        mainClass s = new mainClass();
        assertEquals(5, s.int_sum(2, 3));
    }

    public void test_double_sum() {
        mainClass s = new mainClass();
        assertEquals(6.0, s.double_sum(2.0, 4.0));
    }

}

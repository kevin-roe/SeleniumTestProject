import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = { "custom" })
public class AccountTests {
    @Test(description = "This is a test", groups = { "one" })
    public void tc_account_01() {
        System.out.println("Test 1");
        int expected = 5;
        Assert.assertEquals(5, expected, "Some Assert");
    }

    @Test(description = "This is a another test", groups = { "two" })
    public void tc_account_02() {
        System.out.println("Test 2");
        int expected = 5;
        Assert.assertEquals(5, expected, "Some Assert");
    }

    @Test(description = "This is (yet) another test", groups = { "three" })
    public void tc_account_03() {
        System.out.println("Test 3");
        int expected = 5;
        Assert.assertEquals(5, expected, "Some Assert");
    }
}
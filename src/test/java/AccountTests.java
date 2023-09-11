import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTests {
    @Test(description = "This is a test", groups = { "one" })
    public void tc_account_01() {
        int expected = 5;
        Assert.assertEquals(5, expected, "Some Assert");
    }

    @Test(description = "This is a another test", groups = { "two" })
    public void tc_account_02() {
        int expected = 5;
        Assert.assertEquals(5, expected, "Some Assert");
    }
}

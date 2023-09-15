import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = { "custom", "account" })
public class AccountTests {
    @Test(description = "This is a test", groups = { "tc_account_01" })
    public void tc_account_01() {
        int expected = 5;
        Assert.assertEquals(5, expected, "Some Assert");
    }

    @Test(description = "This is a another test", groups = { "tc_account_02" })
    public void tc_account_02() {
        int expected = 5;
        Assert.assertEquals(5, expected, "Some Assert");
    }

    @Test(description = "This is (yet) another test", groups = { "tc_account_03" })
    public void tc_account_03() {
        int expected = 5;
        Assert.assertEquals(5, expected, "Some Assert");
    }
}
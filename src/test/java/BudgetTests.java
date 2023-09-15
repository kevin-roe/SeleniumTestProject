import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = { "custom", "budget" })
public class BudgetTests {
    @Test(description = "This is a test", groups = { "tc_budget_01" })
    public void tc_budget_01() {
        int expected = 5;
        Assert.assertEquals(5, expected, "Some Assert");
    }

    @Test(description = "This is a another test", groups = { "tc_budget_02" })
    public void tc_budget_02() {
        int expected = 5;
        Assert.assertEquals(5, expected, "Some Assert");
    }

    @Test(description = "This is (yet) another test", groups = { "tc_budget_03" })
    public void tc_budget_03() {
        int expected = 5;
        Assert.assertEquals(5, expected, "Some Assert");
    }
}
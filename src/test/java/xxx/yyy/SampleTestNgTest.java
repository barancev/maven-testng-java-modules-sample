package xxx.yyy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNgTest extends TestNgTestBase {

  @Test
  public void testHomePageHasAHeader() {
    driver.get(baseUrl);
  }
}

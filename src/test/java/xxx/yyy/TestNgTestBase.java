package xxx.yyy;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

/**
 * Base class for TestNG-based test classes
 */
public class TestNgTestBase {

  protected static String baseUrl;

  protected WebDriver driver;

  @BeforeMethod
  public void initWebDriver() {
    driver = new FirefoxDriver();
  }

  @AfterSuite(alwaysRun = true)
  public void tearDown() {
    driver.quit();
  }
}

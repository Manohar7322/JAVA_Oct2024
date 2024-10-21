// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Lab4Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void lab4() {
    driver.get("https://demo.opencart.com/");
    driver.manage().window().setSize(new Dimension(1280, 672));
    driver.findElement(By.linkText("Desktops")).click();
    driver.findElement(By.linkText("Mac (1)")).click();
    js.executeScript("window.scrollTo(0,130)");
    driver.findElement(By.id("input-sort")).click();
    {
      WebElement dropdown = driver.findElement(By.id("input-sort"));
      dropdown.findElement(By.xpath("//option[. = 'Name (A - Z)']")).click();
    }
    driver.findElement(By.cssSelector(".image .img-fluid")).click();
    driver.findElement(By.id("button-cart")).click();
    {
      WebElement element = driver.findElement(By.id("button-cart"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.name("search")).click();
    driver.findElement(By.name("search")).sendKeys("Mobile");
    driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("input-category")).click();
    driver.findElement(By.cssSelector(".row > .text-end")).click();
    driver.findElement(By.name("search")).click();
    driver.findElement(By.name("search")).sendKeys("Monitor");
    driver.findElement(By.cssSelector(".row-cols-1 > .col:nth-child(1)")).click();
    driver.findElement(By.id("input-description")).click();
    driver.findElement(By.id("button-search")).click();
  }
}
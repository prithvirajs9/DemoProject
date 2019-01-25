package mavenmercury.Mavenproject;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class MercuryMavenTest {
	public WebDriver driver;
  @Test(priority=1)
  public void maximize_browser() {
	  driver.manage().window().maximize();
  }
  @Test(priority=2)
  public void loginwithvaliddetails()
  {
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suvidyap1");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssword1");
	  driver.findElement(By.xpath("//input[@name='login']")).click();
  }
  @BeforeSuite
  public void open_browser() {
	  System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium1\\PRS\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
  }
  @BeforeTest
  public void enterApplicationURL()
  {
	  driver.get("http://newtours.demoaut.com/mercurywelcome.php");
  }

}

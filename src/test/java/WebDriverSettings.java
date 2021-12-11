

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverSettings {

   public ChromeDriver driver;
   public Actions action;
   public WebDriverWait wait;

   @Before
    public void setUp() throws Exception{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wildberries.ru/");
        driver.findElement(By.xpath("//button[@class='nav-element__burger j-menu-burger-btn']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='menu-burger__main-list-item j-menu-main-item menu-burger__main-list-item--subcategory']")));
        action = new Actions(driver);
        WebElement women = driver.findElement(By.xpath("//li[@class='menu-burger__main-list-item j-menu-main-item menu-burger__main-list-item--subcategory']"));
        action.moveToElement(women).perform();

   }
    @After
    public void close(){
       driver.quit();
    }
}

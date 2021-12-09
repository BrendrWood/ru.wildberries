import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class WomenClothes extends WebDriverSettings {

    @Test
    public void clothesTest () {
        driver.findElement(By.xpath(ArrayXpath.xpath[0])).click();


    }

}

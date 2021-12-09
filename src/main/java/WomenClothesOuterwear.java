import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class WomenClothesOuterwear extends WebDriverSettings {

    @Test
    public void womenClothesPants () {
        driver.findElement(By.xpath(ArrayXpath.xpath[4])).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@class='catalog-title']")));
        String title = driver.getTitle();
        Assert.assertTrue(title.equals(ArrayTitles.titles[4]));

    }
}

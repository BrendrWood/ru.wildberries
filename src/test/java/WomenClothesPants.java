import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class WomenClothesPants extends WebDriverSettings {

    @Test
    public void womenClothesPants () {
        driver.findElement(By.xpath(ArrayXpath.xpath[5])).click();  //Путь находится в файле ArrayXpath
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@class='catalog-title']")));
        String title = driver.getTitle();
        Assert.assertEquals(title, ArrayTitles.titles[5]);  //Title находится в файле ArrayTitles

    }
}

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class WomenClothesTurtlenecks extends WebDriverSettings {

    @Test
    public void womenClothesTurtlenecks () {
        driver.findElement(By.xpath(ArrayXpath.xpath[6])).click();  //Путь находится в файле ArrayXpath
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@class='catalog-title']")));
        String title = driver.getTitle();
        Assert.assertTrue(title.equals(ArrayTitles.titles[6])); //Title находится в файле ArrayTitles

    }
}

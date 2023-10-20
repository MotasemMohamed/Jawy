package Pages;

import base.PageBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PaymentBundlePage extends PageBase {


    public PaymentBundlePage(WebDriver driver) {
        super(driver);
    }

    public void BackToDashboard()
    {
        WebElement JawwyTvBtn = driver.findElement(By.id("jawwy-logo-web"));
        clickButton2(JawwyTvBtn);
    }

    public void Assert_For_Bundel_Currency(String Text1,String Text2,String Text3 )
    {
        Assert.assertEquals(driver.findElement(By.id("order-tier-price")).getText(),Text1);
        Assert.assertEquals(driver.findElement(By.id("order-total-price")).getText(),Text2);
       List<WebElement> divElements = driver.findElements(By.className("controller"));
       int count=divElements.size();
       for (int i= 0; i<count;i++)
       {
           Assert.assertEquals(driver.findElement(By.xpath("//label[@class='controller']//span[@class='price']")).getText(),Text3);
       }
    }

}

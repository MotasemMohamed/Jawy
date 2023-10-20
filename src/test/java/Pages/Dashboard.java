package Pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Dashboard extends PageBase {


    public Dashboard(WebDriver driver) {
        super(driver);
    }


    public void ChangeLanguage()
    {
        WebElement LanguageBtn = driver.findElement(By.id("translation-btn"));
        LanguageBtn.click();
    }
    public void ChangeCountry(String countrycode,String Currency)
    {
        WebElement country = driver.findElement(By.id("country-btn"));
        country.click();
        WebElement WantedCountry = driver.findElement(By.id(countrycode));
        WantedCountry.click();
        Assert.assertEquals(driver.findElement(By.cssSelector("div.trial-cost")).getText(),Currency);
    }
    public void Open_Classic_Bundle()
    {
        scrollDownPage2();
        WebElement ChooseBtnEssen = driver.findElement(By.cssSelector("a.button.trial-button"));
        ChooseBtnEssen.click();
    }
    public void Open_Light_Bundle()  {
        WebElement ChooseBtnLight = driver.findElement(By.xpath("(//a[@class='plan-link'])[1]"));
        scrollDownPage2();
        clickButton(ChooseBtnLight);
    }
    public void Open_Premium_Bundle()
    {
        WebElement ChooseBtnPremium = driver.findElement(By.xpath("(//a[@class='plan-link'])[3]"));
        scrollDownPage2();
        clickButton(ChooseBtnPremium);
    }


}

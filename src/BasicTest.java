import org.apache.commons.math3.optim.nonlinear.scalar.LineSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class BasicTest {

    WebDriver driver;
    @BeforeClass
    public void BrowTest()
    {
    System.out.println("TestStart");
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.seleniumeasy.com/test/");
    Assert.assertEquals(driver.getTitle(),"Selenium Easy - Best Demo website to practice Selenium Webdriver Online");
    }

    @Test
    public void Welcomepage()
    {
        List<WebElement>MenuList=driver.findElements(By.cssSelector(".data-original-title"));
        for(WebElement getwe:MenuList)
        {
            String getTitle=getwe.getCssValue("value");
            System.out.println(getTitle);
        }


    }

    @Test
    public void SecondTest()
    {
        System.out.printf("This a Second test");
    }

    @AfterClass
    public void TestEnd()
    {
        System.out.printf("TestEnd");
    }

}


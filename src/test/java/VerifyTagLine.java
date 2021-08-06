import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class VerifyTagLine {

    @Before
    public void setUp() {

        System.out.println("> SETTING UP THE DRIVER \n");

        Driver.getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        Driver.getDriver().manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        Driver.getDriver().manage().window().maximize();

    }

    @Test
    public void verifySlogan(){

        Driver.getDriver().findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Open Lending");

        WebElement searchBox = Driver.getDriver().findElement(By.className("gNO89b"));

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(searchBox));

        Driver.getDriver().findElement(By.className("gNO89b")).click();

        Driver.getDriver().findElement(By.xpath("//a[contains(@href,'linkedin.com/company/open-lending')]")).click();

        String expected = "Say YES to more automotive loans." ;

        String actual = Driver.getDriver().findElement(By.cssSelector("h4.top-card-layout__second-subline")).getText();

        Assert.assertTrue(expected.equalsIgnoreCase(actual));

    }

    @After
    public void tearDown() {

        Driver.closeDriver();

        System.out.println("> CLOSING THE SESSION \n\n ******************* ");


    }


}

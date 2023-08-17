package tests.US_01;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.utilities.ConfigReader;
import utilities.utilities.Driver;
import utilities.utilities.ReusableMethods;
import utilities.utilities.TestBaseRapor;

public class US_09 extends TestBaseRapor {

    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    Actions actions = new Actions(Driver.getDriver());
    ReusableMethods reusableMethods = new ReusableMethods();
    Faker faker = new Faker();

    @Test
    public void TC_001() throws InterruptedException {


        extentTest = extentReports.createTest("Weight ve diementions goruntuleme", "Weight ve diementions goruntulendi");
        extentTest.info("https://spendinggood.com/ adresine gidilir");

        Driver.getDriver().get(ConfigReader.getProperty("spgURL"));

        spendinGoodPage.yeniSingIn2.click();
        Thread.sleep(1000);

        spendinGoodPage.yeniSingIn2.click();
        Thread.sleep(1000);

        spendinGoodPage.yeniEmail.sendKeys(ConfigReader.getProperty("spgEmail"));
        Thread.sleep(1000);

        spendinGoodPage.yeniPassword.sendKeys(ConfigReader.getProperty("spgPassword"));
        Thread.sleep(1000);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        spendinGoodPage.yeniGiris.click();

        Thread.sleep(1000);

        spendinGoodPage.sgpProducts.click();
        Thread.sleep(1000);

        spendinGoodPage.sgpAddNew.click();
        Thread.sleep(1000);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);

        spendinGoodPage.shipping.click();
        Thread.sleep(1000);
        spendinGoodPage.weight.sendKeys("10");
        Thread.sleep(1500);
        spendinGoodPage.lenght.sendKeys("20");
        Thread.sleep(1500);
        spendinGoodPage.width.sendKeys("5");
        Thread.sleep(1500);
        spendinGoodPage.height.sendKeys("15");
        Thread.sleep(1500);
        spendinGoodPage.processingTime.sendKeys("1 business day");





    }


}

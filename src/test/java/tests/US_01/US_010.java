package tests.US_01;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.utilities.ConfigReader;
import utilities.utilities.Driver;
import utilities.utilities.ReusableMethods;
import utilities.utilities.TestBaseRapor;

public class US_010 extends TestBaseRapor {

    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    Actions actions = new Actions(Driver.getDriver());
    ReusableMethods reusableMethods = new ReusableMethods();
    Faker faker = new Faker();

    @Test
    public void TC_001() throws InterruptedException {


        extentTest = extentReports.createTest("Color ve size goruntuleme", "Color ve size goruntulendi");
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

        spendinGoodPage.attributes.click();
        Thread.sleep(1000);
        spendinGoodPage.color.click();
        Thread.sleep(1000);
        spendinGoodPage.colorSecenegi.click();
        Thread.sleep(1000);
        spendinGoodPage.yukariOk.click();


    }
    @Test
    public void TC_002() throws InterruptedException {


        extentTest = extentReports.createTest("Color ve size goruntuleme", "Color ve size goruntulendi");
        extentTest.info("https://spendinggood.com/ adresine gidilir");

        Thread.sleep(1000);
        spendinGoodPage.size.click();
        Thread.sleep(1000);
        spendinGoodPage.sizeBelirleme.click();
        Thread.sleep(1000);
        extentTest.info("Size secenegi; small, medium, large, extra large  oldugu dogrulandi");
        Assert.assertTrue(spendinGoodPage.sizeBelirleme.isDisplayed());










    }

}

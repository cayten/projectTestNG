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

public class US_06 extends TestBaseRapor {

    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    Actions actions = new Actions(Driver.getDriver());
    ReusableMethods reusableMethods = new ReusableMethods();
    Faker faker = new Faker();

    @Test
    public void TC_001() throws InterruptedException {


        extentTest = extentReports.createTest("Prudoct Title ve Price goruntuleme", "Prudoct Title ve Price goruntulendi");
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

    }
    @Test
    public void TC_002() throws InterruptedException {



        Assert.assertTrue(spendinGoodPage.catagoriesBasligi.isDisplayed());
        extentTest.info("Categories bolumunun gorunurlugu dogrulandi");

        Thread.sleep(1000);

        spendinGoodPage.accesories.click();
        Thread.sleep(1000);
        spendinGoodPage.bestSeller.click();
        /*Thread.sleep(1000);
        spendinGoodPage.books.click();
        Thread.sleep(1000);
        spendinGoodPage.computers.click();
        Thread.sleep(1000);
        spendinGoodPage.elektronics.click();
        Thread.sleep(1000);
        spendinGoodPage.food.click();
        Thread.sleep(1000);
        spendinGoodPage.giftIdeas.click();
        Thread.sleep(1000);
        spendinGoodPage.healthBeauty.click();
        Thread.sleep(1000);
        spendinGoodPage.homeGarden.click();*/



    }



}

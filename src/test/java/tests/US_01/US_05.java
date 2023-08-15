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

import java.io.IOException;

public class US_05 extends TestBaseRapor{


        SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods reusableMethods = new ReusableMethods();
        Faker faker = new Faker();


        @Test
        public void TC_001(){

            extentTest = extentReports.createTest("istenen sayfaya gidilmeli","istenen sayfa gidildi");
            extentTest.info("https://spendinggood.com/ adresine gidilir");

            Driver.getDriver().get(ConfigReader.getProperty("spgURL"));

             spendinGoodPage.yeniSingIn2.click();
             ReusableMethods.waitFor(2);

            spendinGoodPage.yeniSingIn2.click();
            ReusableMethods.waitFor(2);

           spendinGoodPage.yeniEmail.sendKeys(ConfigReader.getProperty("spgEmail"));
            ReusableMethods.waitFor(2);

           spendinGoodPage.yeniPassword.sendKeys(ConfigReader.getProperty("spgPassword"));
            ReusableMethods.waitFor(2);

            spendinGoodPage.yeniGiris.click();




           spendinGoodPage.sgpProducts.click();

            Assert.assertTrue(spendinGoodPage.status.isDisplayed());

        Assert.assertTrue(spendinGoodPage.stock.isDisplayed());

        Assert.assertTrue(spendinGoodPage.price.isDisplayed());

        Assert.assertTrue(spendinGoodPage.date.isDisplayed());

        extentTest.info("status,stock,price,date basliklsrin gorunurlugu dogrulandi");



        }

    @Test
    public void TC_002() throws IOException {

        extentTest = extentReports.createTest("Yeni urun ekle (Add new); urun icin virtual veya downloadable secenegi gorunmeli","Yeni urun ekle (Add new); urun icin virtual veya downloadable secenegi gorundu");
        extentTest.info("https://spendinggood.com/ adresine gidilir");


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        spendinGoodPage.sgpAddNew.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("addNew butonuna tiklandi");


        ReusableMethods.getScreenshot("virtual ve downloadable sekmeleri gorunur");





    }

}

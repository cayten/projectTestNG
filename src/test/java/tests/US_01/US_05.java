package tests.US_01;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
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
        public void TC_001() throws InterruptedException {

            extentTest = extentReports.createTest("istenen sayfaya gidilmeli","istenen sayfa gidildi");
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

            Assert.assertTrue(spendinGoodPage.status.isDisplayed());

        Assert.assertTrue(spendinGoodPage.stock.isDisplayed());

        Assert.assertTrue(spendinGoodPage.price.isDisplayed());

        Assert.assertTrue(spendinGoodPage.date.isDisplayed());

        extentTest.info("status,stock,price,date basliklsrin gorunurlugu dogrulandi");



        }

    @Test
    public void TC_002() throws IOException, InterruptedException {

        extentTest = extentReports.createTest("Yeni urun ekle (Add new); urun icin virtual veya downloadable secenegi gorunmeli","Yeni urun ekle (Add new); urun icin virtual veya downloadable secenegi gorundu");
        extentTest.info("https://spendinggood.com/ adresine gidilir");

        Thread.sleep(1000);


        //actions.sendKeys(Keys.PAGE_DOWN).perform();

        spendinGoodPage.sgpAddNew.click();

        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("addNew butonuna tiklandi");


        ReusableMethods.getScreenshot("virtual ve downloadable sekmeleri gorunur");





    }

    @Test
    public void TC_003() throws IOException, InterruptedException {

        extentTest = extentReports.createTest("Urun ismi ve fiyati eklenmeli","Urun ismi ve fiyati eklendi");
        extentTest.info("https://spendinggood.com/ adresine gidilir");

        Thread.sleep(1000);
        spendinGoodPage.virtual.click();
        spendinGoodPage.dowloadable.click();

       actions.sendKeys(Keys.PAGE_DOWN).perform();

       /* spendinGoodPage.productTitle.sendKeys("yeni urunler");
        Thread.sleep(1000);
        spendinGoodPage.sgpPrice.sendKeys(ConfigReader.getProperty("sgpPrice"));
        Thread.sleep(1000);
        spendinGoodPage.salePrice.sendKeys(ConfigReader.getProperty("sgpSalePrice"));*/



    }

    @Test
    public void TC_004() throws IOException, InterruptedException {

        extentTest = extentReports.createTest("Urun fotografi eklenmeli","Urun fotografi eklendi");
        extentTest.info("https://spendinggood.com/ adresine gidilir");
        Thread.sleep(1000);

       spendinGoodPage.spgFoto.click();
        Thread.sleep(1000);

        spendinGoodPage.mediaLibrary.click();
        Thread.sleep(1000);

        spendinGoodPage.selectFoto.click();
        Thread.sleep(1000);


        spendinGoodPage.selectFoto.sendKeys("\"C:/Users/CCS/telefon.jpg\"");
        Thread.sleep(1000);


        //actions.doubleClick(spendinGoodPage.sgpEklenenFoto).perform();


    }
    @Test
    public void TC_005() throws IOException, InterruptedException {

            spendinGoodPage.sgpSelect.click();

            spendinGoodPage.shortYazi.sendKeys();













    }

}

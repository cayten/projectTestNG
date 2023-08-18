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

public class US_012 extends TestBaseRapor {
    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    Actions actions = new Actions(Driver.getDriver());
    ReusableMethods reusableMethods = new ReusableMethods();
    Faker faker = new Faker();

    @Test
    public void TC_001() throws InterruptedException, IOException {


        extentTest = extentReports.createTest("Store manager olarak hesabıma gidince tum portal a access elde etme", "Store manager olarak hesabıma gidince tum portal a access elde edildi");
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
        spendinGoodPage.sgpMyAccount.click();
        Thread.sleep(1000);
        Assert.assertTrue(spendinGoodPage.sgpOrders.isDisplayed());
        Thread.sleep(1000);
        spendinGoodPage.sgpOrders.click();
        Thread.sleep(1000);
        ReusableMethods.getScreenshot("siparis edilen urun");



    }
    @Test
    public void TC_002() throws InterruptedException, IOException {


        extentTest = extentReports.createTest("Indirimli urun goruntuleme", "indirimli urun goruntulendi");
        extentTest.info("https://spendinggood.com/ adresine gidilir");

        spendinGoodPage.sgpView.click();
        Thread.sleep(1000);
        //actions.sendKeys(Keys.PAGE_DOWN).perform();



    }
    @Test
    public void TC_003() throws InterruptedException, IOException {


        extentTest = extentReports.createTest("Hesap detaylari; hesap bilgisi ve eposta adresi goruntulenmeli ve update edilebilir", "Hesap detaylari; hesap bilgisi ve eposta adresi goruntulenmeli ve update edilebildi");
        extentTest.info("https://spendinggood.com/ adresine gidilir");


        Thread.sleep(1000);
        Assert.assertTrue(spendinGoodPage.billingAdress.isDisplayed());
        Thread.sleep(1000);
        Assert.assertTrue(spendinGoodPage.shippingAdress.isDisplayed());


    }

    @Test
    public void TC_004() throws InterruptedException, IOException {


        extentTest = extentReports.createTest("Hesap detaylari; hesap bilgisi ve eposta adresi goruntulenmeli ve update edilebilir", "Hesap detaylari; hesap bilgisi ve eposta adresi goruntulenmeli ve update edilebildi");
        extentTest.info("https://spendinggood.com/ adresine gidilir");


        Thread.sleep(1000);
        spendinGoodPage.sgpAccountDetail.click();
        Thread.sleep(1000);

        extentTest.info("hesap bilgisi ve e posta adresi goruntulendi");
        spendinGoodPage.sgpFirstName.clear();
        Thread.sleep(1000);
        spendinGoodPage.sgpFirstName.sendKeys("ayten");
        Thread.sleep(1000);
        spendinGoodPage.sgpLastName.clear();
        Thread.sleep(1000);
        spendinGoodPage.sgpLastName.sendKeys("soylu");
        Thread.sleep(1000);
        spendinGoodPage.sgpDisplayName.clear();
        Thread.sleep(1000);
        spendinGoodPage.sgpDisplayName.sendKeys("cayten");
        Thread.sleep(1000);
        spendinGoodPage.sgpAccountEmail.clear();
        Thread.sleep(1000);
        spendinGoodPage.sgpAccountEmail.sendKeys("cano@gmail.com");
        Thread.sleep(1000);
        spendinGoodPage.sgpSaveChange.click();






    }

}

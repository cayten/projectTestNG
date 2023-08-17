package tests.US_01;


import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.utilities.ConfigReader;
import utilities.utilities.Driver;
import utilities.utilities.TestBaseRapor;


public class US_01 extends TestBaseRapor {

    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    Actions actions = new Actions(Driver.getDriver());
    @Test
    public void TC01() throws InterruptedException {
        extentTest = extentReports.createTest("istenen sayfaya gidilmeli","istenen sayfa gidildi");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("pMarketUrl"));

        Assert.assertTrue(spendinGoodPage.anaSayfa.isDisplayed());

        extentTest = extentReports.createTest("become vendor sekmesine tiklanmali","become vendor sekmesine tiklandi");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");

        spendinGoodPage.register.click();
        Thread.sleep(1000);

        spendinGoodPage.bocomeVedorButton.click();
        Thread.sleep(1000);
        Assert.assertTrue(spendinGoodPage.becomeVendor.isDisplayed());




    }
    @Test
    public void TC02() throws InterruptedException {

        extentTest = extentReports.createTest("Vendor Registration bolumu doldurulmali","Vendor Registration bolumu dolduruldu");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");

        spendinGoodPage.email.sendKeys(ConfigReader.getProperty("pmEmail"));
        Thread.sleep(1000);
        spendinGoodPage.password.sendKeys(ConfigReader.getProperty("pmPassword"));
        Thread.sleep(1000);
        spendinGoodPage.comfirmPassword.sendKeys(ConfigReader.getProperty("pmPassword"));
        Thread.sleep(1000);
        Assert.assertFalse(spendinGoodPage.gorunurMu.isDisplayed());







    }

}
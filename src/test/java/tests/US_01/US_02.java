package tests.US_01;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.utilities.ConfigReader;
import utilities.utilities.Driver;
import utilities.utilities.ReusableMethods;
import utilities.utilities.TestBaseRapor;

public class US_02 extends TestBaseRapor {

    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void TC_001(){

        extentTest = extentReports.createTest("istenen sayfaya gidilmeli","istenen sayfa gidildi");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("pMarketUrl"));

        spendinGoodPage.singnIn.click();

        extentTest = extentReports.createTest("kayitli email ve password girilmeli","kayitli email ve password girildi");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");

        spendinGoodPage.userName.sendKeys(ConfigReader.getProperty("pmEmail"));
        spendinGoodPage.password2.sendKeys(ConfigReader.getProperty("pmPassword"));
        spendinGoodPage.giris.click();
        spendinGoodPage.signOut.click();

        extentTest = extentReports.createTest("my account sayfas gorulmeli","my account sayfas goruldu");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");

        Assert.assertTrue(spendinGoodPage.myAccount.isDisplayed());

    }
    @Test
    public void TC_002(){

        extentTest = extentReports.createTest("my account basliklari gorunmeli","my account basliklari gorundu");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");

        Assert.assertTrue(spendinGoodPage.orders.isDisplayed());
        Assert.assertTrue(spendinGoodPage.downloads.isDisplayed());
        Assert.assertTrue(spendinGoodPage.addresses.isDisplayed());
        Assert.assertTrue(spendinGoodPage.accountDetails.isDisplayed());
        Assert.assertTrue(spendinGoodPage.wishlist.isDisplayed());
        Assert.assertTrue(spendinGoodPage.logout.isDisplayed());

        ReusableMethods.waitFor(1);




    }
    @Test
    public void TC_003() {

        extentTest = extentReports.createTest("dashboard altindaki basliklar gorunmeli", "dashboard altindaki basliklar gorundu");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");

        Assert.assertTrue(spendinGoodPage.orderss.isDisplayed());
        Assert.assertTrue(spendinGoodPage.Dashboard.isDisplayed());
        Assert.assertTrue(spendinGoodPage.Downloads.isDisplayed());
        Assert.assertTrue(spendinGoodPage.Addresses.isDisplayed());
        Assert.assertTrue(spendinGoodPage.chatBox.isDisplayed());
        Assert.assertTrue(spendinGoodPage.accountdetails.isDisplayed());
        Assert.assertTrue(spendinGoodPage.Wishlist.isDisplayed());

        ReusableMethods.waitFor(1);


    }

    @Test
    public void TC_004() {

        extentTest = extentReports.createTest("dashboard altindaki diger basliklar gorunmeli", "dashboard altindaki diger basliklar gorundu");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");

        Assert.assertTrue(spendinGoodPage.SupportTickets.isDisplayed());
        Assert.assertTrue(spendinGoodPage.Followings.isDisplayed());
        Assert.assertTrue(spendinGoodPage.Logout.isDisplayed());


    }





    }

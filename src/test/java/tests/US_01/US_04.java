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

public class US_04 extends TestBaseRapor {


    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    Actions actions = new Actions(Driver.getDriver());
    ReusableMethods reusableMethods = new ReusableMethods();
    Faker faker = new Faker();


    @Test
    public void TC_001() throws InterruptedException {

        extentTest = extentReports.createTest("Orders da Browse products a gidilmeli","Orders da Browse products a gidildi");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("pMarketUrl"));

        spendinGoodPage.singnIn.click();
        Thread.sleep(1000);
        spendinGoodPage.userName.sendKeys(ConfigReader.getProperty("pmEmail"));
        Thread.sleep(1000);
        spendinGoodPage.password2.sendKeys(ConfigReader.getProperty("pmPassword"));
        Thread.sleep(1000);
        spendinGoodPage.giris.click();
        Thread.sleep(1000);
        spendinGoodPage.signOut.click();
        Thread.sleep(1000);


        spendinGoodPage.searchBox.sendKeys(ConfigReader.getProperty("searchBox"), Keys.ENTER);
        Thread.sleep(1000);

        spendinGoodPage.urun.click();
        Thread.sleep(1000);

        spendinGoodPage.sepet.click();
        Thread.sleep(1000);

        spendinGoodPage.viewCard.click();
        Thread.sleep(1000);

        Assert.assertTrue(spendinGoodPage.miktar.isDisplayed());


    }

    @Test
    public void TC_002() throws InterruptedException {

        extentTest = extentReports.createTest("secilen urunlerin miktari ayarlanir", "secilen urunlerin miktari ayarlanir");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");
        spendinGoodPage.plus.click();
        Thread.sleep(1000);
        spendinGoodPage.minus.click();




    }

    @Test
    public void TC_003() throws IOException, InterruptedException {

        extentTest = extentReports.createTest("stok fazlasi urunun eklenmedigi gorunmeli", "stok fazlasi urunun eklenmedigi gorundu");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");

        spendinGoodPage.searchBox.sendKeys(ConfigReader.getProperty("searcBox2"),Keys.ENTER);
        Thread.sleep(1000);
        spendinGoodPage.stokFazlasiUrun.click();

        ReusableMethods.getScreenshot("stok fazlasi urun sepete eklenemiyor");
        Thread.sleep(1000);
        spendinGoodPage.sepet.click();
        Thread.sleep(1000);
        spendinGoodPage.viewCard.click();
        Thread.sleep(1000);
        spendinGoodPage.clearCard.click();
        Thread.sleep(1000);
        ReusableMethods.getScreenshot("clear card ile silinen urun ");




    }

    @Test
    public void TC_004_TC_005() throws InterruptedException {

        extentTest = extentReports.createTest("coupon secenegi gorunmeli", "coupon secenegi gorundu");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");

        spendinGoodPage.searchBox.sendKeys(ConfigReader.getProperty("searcBox2"),Keys.ENTER);
        Thread.sleep(1000);
        spendinGoodPage.samsung.click();
        Thread.sleep(1000);
        spendinGoodPage.addCard.click();
        Thread.sleep(1000);
        spendinGoodPage.sepet.click();
        Thread.sleep(1000);

        spendinGoodPage.viewCard.click();
        Thread.sleep(1000);



        Assert.assertTrue(spendinGoodPage.coupon.isDisplayed());

        //TC_006
        Assert.assertTrue(spendinGoodPage.shopping.isDisplayed());

        //TC_007
        Assert.assertTrue(spendinGoodPage.shoppingBilgileri.isDisplayed());

        spendinGoodPage.shoppingBilgileri.click();










    }
}

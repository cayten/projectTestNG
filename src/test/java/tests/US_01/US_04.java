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
    public void TC_001(){

        extentTest = extentReports.createTest("Orders da Browse products a gidilmeli","Orders da Browse products a gidildi");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("pMarketUrl"));

        spendinGoodPage.singnIn.click();
        spendinGoodPage.userName.sendKeys(ConfigReader.getProperty("pmEmail"));
        spendinGoodPage.password2.sendKeys(ConfigReader.getProperty("pmPassword"));
        spendinGoodPage.giris.click();
        spendinGoodPage.signOut.click();


        spendinGoodPage.searchBox.sendKeys(ConfigReader.getProperty("searchBox"), Keys.ENTER);
        ReusableMethods.waitFor(2);

        spendinGoodPage.urun.click();
        ReusableMethods.waitFor(2);

        spendinGoodPage.sepet.click();
        ReusableMethods.waitFor(2);

        spendinGoodPage.viewCard.click();
        ReusableMethods.waitFor(2);

        Assert.assertTrue(spendinGoodPage.miktar.isDisplayed());


    }

    @Test
    public void TC_002() {

        extentTest = extentReports.createTest("secilen urunlerin miktari ayarlanir", "secilen urunlerin miktari ayarlanir");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");
        spendinGoodPage.plus.click();
        ReusableMethods.waitFor(2);
        spendinGoodPage.minus.click();




    }

    @Test
    public void TC_003() throws IOException {

        extentTest = extentReports.createTest("stok fazlasi urunun eklenmedigi gorunmeli", "stok fazlasi urunun eklenmedigi gorundu");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");

        spendinGoodPage.searchBox.sendKeys(ConfigReader.getProperty("searcBox2"),Keys.ENTER);

        spendinGoodPage.stokFazlasiUrun.click();

        ReusableMethods.getScreenshot("stok fazlasi urun sepete eklenemiyor");

        spendinGoodPage.sepet.click();

        spendinGoodPage.viewCard.click();

        spendinGoodPage.clearCard.click();

        ReusableMethods.getScreenshot("clear card ile silinen urun ");




    }

    @Test
    public void TC_004_TC_005(){

        extentTest = extentReports.createTest("coupon secenegi gorunmeli", "coupon secenegi gorundu");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");

        spendinGoodPage.searchBox.sendKeys(ConfigReader.getProperty("searcBox2"),Keys.ENTER);
        spendinGoodPage.samsung.click();
        spendinGoodPage.addCard.click();
        spendinGoodPage.sepet.click();

        spendinGoodPage.viewCard.click();



        Assert.assertTrue(spendinGoodPage.coupon.isDisplayed());

        //TC_006
        Assert.assertTrue(spendinGoodPage.shopping.isDisplayed());

        //TC_007
        Assert.assertTrue(spendinGoodPage.shoppingBilgileri.isDisplayed());

        spendinGoodPage.shoppingBilgileri.click();

        //TC_008








    }
}

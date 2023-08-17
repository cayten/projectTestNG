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

public class US_03 extends TestBaseRapor {

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

        spendinGoodPage.orders.click();
        Thread.sleep(1000);

        //spendinGoodPage.browseProduct.click();



    }

    @Test
    public void TC_002() throws InterruptedException {

        extentTest = extentReports.createTest("sepete urun ekleme","sepete urun eklendi");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");

        spendinGoodPage.searchBox.sendKeys(ConfigReader.getProperty("searchBox"), Keys.ENTER);

        spendinGoodPage.urun.click();
        Thread.sleep(1000);

        spendinGoodPage.addCard.click();






    }

    @Test
    public void TC_003() throws InterruptedException {

        extentTest = extentReports.createTest("Sepete ve ordan checkout a gidilmeli","Sepete ve ordan checkout a gidildi");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");


        spendinGoodPage.sepet.click();
        Thread.sleep(1000);

        spendinGoodPage.checkOut.click();

    }

    @Test
    public void TC_004() throws InterruptedException {

        extentTest = extentReports.createTest("billing details girilmeli","billing details girildi");
        extentTest.info("https://pearlymarket.com/ adresine gidilir");

        spendinGoodPage.firstName.click();
        Thread.sleep(1000);

        actions.sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys("TechPro").
                sendKeys(Keys.TAB).sendKeys("Turkey", Keys.ENTER).sendKeys(Keys.TAB).
                sendKeys(faker.address().streetAddress()).sendKeys(Keys.TAB).
                sendKeys(faker.address().buildingNumber()).sendKeys(Keys.TAB).
                sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB).
                sendKeys("Merkez", Keys.ENTER).sendKeys(Keys.TAB).sendKeys("Erzurum", Keys.ENTER).perform();
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.TAB).sendKeys("05555555555").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys("ben ne cektim bu adanali dan ama yine de seviyorum").perform();
        Thread.sleep(1000);


       //spendinGoodPage.placeOrder.click();



    }
}

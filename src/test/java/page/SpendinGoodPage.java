package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.utilities.Driver;


import java.util.List;

public class SpendinGoodPage {

    public SpendinGoodPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

      // TC 01
    @FindBy(xpath = "//*[@data-id='5579962']")
    public WebElement anaSayfa;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//*[text()='Become a Vendor']")
    public WebElement bocomeVedorButton;

    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement becomeVendor;

    // TC 02

    @FindBy(xpath = "//*[@id='user_email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='passoword']")
    public WebElement password;

    @FindBy (xpath = "//*[@id='confirm_pwd']")
    public WebElement comfirmPassword;

    @FindBy(xpath = "//*[@class='wcfm-message email_verification_message wcfm-success']")
    public WebElement gorunurMu;






}

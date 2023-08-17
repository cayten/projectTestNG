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

      // US_01   TC 001
    @FindBy(xpath = "//*[@data-id='5579962']")
    public WebElement anaSayfa;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//*[text()='Become a Vendor']")
    public WebElement bocomeVedorButton;

    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement becomeVendor;

    // TC 002

    @FindBy(xpath = "//*[@id='user_email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='passoword']")
    public WebElement password;

    @FindBy (xpath = "//*[@id='confirm_pwd']")
    public WebElement comfirmPassword;

    @FindBy(xpath = "//*[@class='wcfm-message email_verification_message wcfm-success']")
    public WebElement gorunurMu;


    //US_02  TC_001

    @FindBy(xpath = "(//*[@class='w-icon-account'])[1]")
    public WebElement singnIn;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password2;

    @FindBy (xpath = "//*[@name='login']")
    public WebElement giris;

    @FindBy(xpath = "//*[text()='Sign Out']")
    public WebElement signOut;

    @FindBy(xpath = "(//*[text()='My Account'])[2]")
    public WebElement myAccount;

    //TC_002

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[1]")
    public WebElement orders;

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[2]")
    public WebElement downloads;

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[3]")
    public WebElement addresses;

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[4]")
    public WebElement accountDetails;

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[5]")
    public WebElement wishlist;

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[6]")
    public WebElement logout;

    //TC_003

    @FindBy(xpath = "//*[text()='Orders']")
    public WebElement orderss;

    @FindBy(xpath = "//*[text()='Dashboard']")
    public WebElement Dashboard;

    @FindBy(xpath = "//*[text()='Downloads']")
    public WebElement Downloads;

    @FindBy(xpath = "//*[text()='Addresses']")
    public WebElement Addresses;

    @FindBy(xpath = "//*[text()='Chat Box']")
    public WebElement chatBox;

    @FindBy(xpath = "//*[text()='Account details']")
    public WebElement accountdetails;

    @FindBy(xpath = "//*[text()='Wishlist']")
    public WebElement Wishlist;


    //TC_004

    @FindBy(xpath = "//*[text()='Support Tickets']")
    public WebElement SupportTickets;

    @FindBy(xpath = "//*[text()='Followings']")
    public WebElement Followings;

    @FindBy(xpath = "//*[text()='Log out']")
    public WebElement Logout;


    //US_03  TC_001

    @FindBy (xpath = "//*[text()='Browse products']")
    public WebElement browseProduct;

    //TC_002

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement searchBox;

    @FindBy (xpath = "(//*[@data-product_id='21383'])[1]")
    public WebElement urun;

    @FindBy(xpath = "//*[@class='single_add_to_cart_button button alt']")
    public WebElement addCard;







    //TC_003
    @FindBy(xpath = "(//*[@class=\"w-icon-cart\"])[1]")
    public WebElement sepet;

    @FindBy(xpath = "//*[@class='button checkout wc-forward']")
    public WebElement checkOut;

    //TC_004

    @FindBy(xpath = "//*[@id='billing_first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id='place_order']")
    public WebElement placeOrder;


    //US_04  TC_001
     @FindBy (xpath = "//*[@class=\"button wc-forward\"]")
     public WebElement viewCard;

     @FindBy(xpath = "//*[text()='Price']")
    public WebElement miktar;

     //TC_002

    @FindBy(xpath = "//*[@title='Plus']")
    public WebElement plus;

    @FindBy(xpath = "//*[@title='Minus']")
    public WebElement minus;

    //TC_003
     @FindBy(xpath = "//*[@src=\"https://pearlymarket.com/wp-content/uploads/2023/02/ss23-300x300.jpeg\"]")
    public WebElement stokFazlasiUrun;

     //TC_004

    @FindBy(xpath = "//*[text()='Clear cart']")
    public WebElement clearCard;

    //TC_004

    @FindBy(xpath = "//*[text()='Apply coupon']")
    public WebElement coupon;

    @FindBy(xpath = "(//*[@src=\"https://pearlymarket.com/wp-content/uploads/2023/02/indir-1.jpg\"])[2]")
    public WebElement samsung;

    //TC_005
    @FindBy(xpath = "//*[@class=\"btn btn-dark btn-rounded btn-icon-left continue-shopping mb-4 mr-auto\"]")
    public WebElement shopping;

    //TC_006

    @FindBy(xpath = "//*[@class=\"checkout-button button alt wc-forward\"]")
    public WebElement shoppingBilgileri;


    //US_05 TC_001

    @FindBy (xpath = "//*[text()='Sign In ']")
    public WebElement yeniSingIn2;

    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement yeniEmail;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement yeniPassword;

    @FindBy(xpath = "//*[@class=\"woocommerce-button button woocommerce-form-login__submit\"]")
    public WebElement yeniGiris;

    @FindBy(xpath = "(//*[text()='My Account'])[1]")
    public WebElement sgpMyAccount;

    @FindBy(xpath = "(//*[@class=\"text\"])[4]")
    public WebElement sgpProducts;

    @FindBy (xpath ="//*[text()='Status']")
    public WebElement status;

    @FindBy (xpath ="//*[text()='Stock']")
    public WebElement stock;

    @FindBy (xpath ="//*[text()='Price']")
    public WebElement price;

    @FindBy (xpath ="//*[text()='Date']")
    public WebElement date;

    //TC_002
    @FindBy(xpath = "//*[@id=\"add_new_product_dashboard\"]")
    public WebElement sgpAddNew;

    //TC_003

    @FindBy(xpath = "//*[@id='is_virtual']")
    public WebElement virtual;

    @FindBy(xpath = "//*[@id='is_downloadable']")
    public WebElement dowloadable;

    @FindBy(using = "//*[@id='pro_title']")
    public WebElement productTitle;

    @FindBy(xpath = "//*[@id='regular_price']")
    public WebElement sgpPrice;

    @FindBy(xpath = "//*[@id='sale_price']")
    public WebElement salePrice;

    //TC_004

    @FindBy(xpath = "//*[@id='featured_img_display']")
    public WebElement spgFoto;

    @FindBy(xpath = "//*[@id=\"__wp-uploader-id-1\"]")
    public WebElement selectFoto;

    //@FindBy(xpath = "C:\Users\CCS\telefon.jpg")
    //public WebElement sgpEklenenFoto;

    //TC_005
    @FindBy(xpath = "//*[@class='button media-button button-primary button-large media-button-select']")
    public WebElement sgpSelect;

    @FindBy(xpath = "//*[@id=\"menu-item-browse\"]")
    public WebElement mediaLibrary;

    @FindBy(xpath = "//*[@id=\"tinymce\"]")
    public WebElement shortYazi;


    //US_06  TC_001

    @FindBy(xpath = "(//*[text()='Categories'])[1]")
    public WebElement catagoriesBasligi;

    @FindBy(xpath = "(//*[@type=\"checkbox\"])[6]")
    public WebElement accesories;

    @FindBy(xpath = "(//*[@type=\"checkbox\"])[18]")
    public WebElement bestSeller;

    @FindBy(xpath = "")
    public WebElement books;

    @FindBy(xpath = "")
    public WebElement computers;

    @FindBy(xpath = "")
    public WebElement elektronics;

    @FindBy(xpath = "")
    public WebElement food;

    @FindBy(xpath = "")
    public WebElement giftIdeas;

    @FindBy(xpath = "")
    public WebElement healthBeauty;

    @FindBy(xpath = "")
    public WebElement homeGarden;

    //US_07  TC_001

    @FindBy(xpath = "//*[@id=\"sku\"]")
    public WebElement sku;

    @FindBy(xpath = "//*[@class=\"wcfm-checkbox wcfm_ele simple variable manage_stock_ele non-job_package non-resume_package non-auction non-redq_rental non-appointment non-accommodation-booking non-pw-gift-card\"]")
    public WebElement manageStock;



   //US_08 TC_001

    @FindBy(xpath = "(//*[@type=\"number\"])[3]")
    public WebElement stockQty;

    @FindBy(xpath = "//*[@id=\"backorders\"]")
    public WebElement allowBck;


    //US_09 TC_001
    @FindBy (xpath = "(//*[@class=\"page_collapsible_content_holder\"])[4]")
    public WebElement shipping;

    @FindBy(xpath = "//*[@id=\"weight\"]")
    public WebElement weight;

    @FindBy(xpath = "//*[@id=\"length\"]")
    public WebElement lenght;

    @FindBy(xpath = "//*[@id=\"width\"]")
    public WebElement width;

    @FindBy(xpath = "//*[@id=\"height\"]")
    public WebElement height;

    @FindBy(xpath = "//*[@id=\"_wcfmmp_processing_time\"]")
    public WebElement processingTime;

    //US_010 TC_001

    @FindBy(xpath = "(//*[@class=\"page_collapsible_content_holder\"])[5]")
    public WebElement attributes;

    @FindBy(xpath = "//*[@id=\"attributes_is_active_1\"]")
    public WebElement color;

    @FindBy(xpath = "//*[@class=\"button wcfm_add_attribute_term wcfm_select_all_attributes\"]")
    public WebElement colorSecenegi;

    @FindBy(xpath = "(//*[@title=\"Toggle Block\"])[2]")
    public WebElement yukariOk;

    //TC_002
    @FindBy(xpath = "//*[@id=\"attributes_is_active_2\"]")
    public WebElement size;

    @FindBy(xpath = "(//*[@class=\"select2-search__field\"])[3]")
    public WebElement sizeBelirleme;

    @FindBy(xpath = "//*[@title=\"Small\"]")
    public WebElement small;

    @FindBy(xpath = "//*[@title=\"Medium\"]")
    public WebElement medium;

    //US_011 TC_001

    @FindBy(xpath = "(//*[@class=\"page_collapsible_content_holder\"])[9]")
    public WebElement toptanUrunGosterme;

    @FindBy(xpath = "(//*[text()='Piece Type'])[1]")
    public WebElement urunCesidi;

    @FindBy(xpath = "(//*[text()='Units Per Piece'])[1]")
    public WebElement unitsPerPieces;

    @FindBy(xpath = "(//*[text()='Min Order Quantity?'])[1]")
    public WebElement minimumQlyt;

    @FindBy(xpath = "//*[@class=\"icon-box-icon icon-orders\"]")
    public WebElement sgpOrders;

    //TC_003

    @FindBy(xpath = "//*[@class=\"woocommerce-button btn btn-default btn-rounded btn-outline btn-sm btn-block view\"]")
    public WebElement sgpView;

    @FindBy(xpath = "(//*[@class=\"woocommerce-column__title\"])[1]")
    public WebElement billingAdress;

    @FindBy(xpath = "(//*[@class=\"woocommerce-column__title\"])[2]")
    public WebElement shippingAdress;

    //TC_004

    @FindBy(xpath = "(//*[@href=\"https://spendinggood.com/my-account-2/edit-account/\"])[4]")
    public WebElement sgpAccountDetail;



































}

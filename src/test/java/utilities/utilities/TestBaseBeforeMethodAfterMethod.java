package utilities.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public abstract class TestBaseBeforeMethodAfterMethod{
    protected String  tarih;
    protected WebDriver driver;
    // TestNG framework'unde @Before ve @After notasyonları yerine @BeforeMethod ve @AfterMethod kullanılır
    // Çalışma prensibi JUnit deki Before,After ile aynıdır
    @BeforeMethod
    public void srtUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter formater=DateTimeFormatter.ofPattern("YYYYMMDDHHmmss");
        tarih=date.format(formater);
    }
    @AfterMethod
    public void tearDown() {
        //driver.quit();
    }
}
import Amazon.GoToAmazonInPolandPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    public  WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void changeRegion(){
        GoToAmazonInPolandPage goToAmazonInPoland = new GoToAmazonInPolandPage(driver);
        goToAmazonInPoland.GoToAmazon();
        goToAmazonInPoland.deliveryRegionClickBtn().click();
        sleep(2);
        goToAmazonInPoland.goToСhoiceRegion().click();
        goToAmazonInPoland.selectRegionPoland().click();
        goToAmazonInPoland.selectRegionDone().click();
    }


//    @AfterMethod
//    public void clouseBrawser() {
//        driver.quit();
//    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
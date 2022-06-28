import Amazon.GoToAmazonInPolandPage;
import Amazon.SelectMonitorPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsAmazon extends TestInit{

    public void changeRegion(){
        GoToAmazonInPolandPage goToAmazonInPoland = new GoToAmazonInPolandPage(driver);
        goToAmazonInPoland.GoToAmazon();
        goToAmazonInPoland.deliveryRegionClickBtn().click();
        sleep(2);
        goToAmazonInPoland.goToСhoiceRegion().click();
        goToAmazonInPoland.selectRegionPoland().click();
        goToAmazonInPoland.selectRegionDone().click();
    }

    public void goToMonitor(){
        GoToAmazonInPolandPage goToAmazonInPoland = new GoToAmazonInPolandPage(driver);
        SelectMonitorPage selectMonitorPage = new SelectMonitorPage(driver);
        goToAmazonInPoland.GoToAmazon();
        changeRegion();
        sleep(2);
        selectMonitorPage.getAllMenu().click();
        sleep(2);
        selectMonitorPage.getComputerMenu().click();
        selectMonitorPage.getMonitorPage().click();


    }

    @Test
    public void checkChangeRegoin(){
        GoToAmazonInPolandPage goToAmazonInPoland = new GoToAmazonInPolandPage(driver);
        changeRegion();
        sleep(2);
        Assert.assertTrue(goToAmazonInPoland.visibilityPoland().isDisplayed());
    }

    @Test
    public void checkSelectMonitor(){
        SelectMonitorPage selectMonitorPage = new SelectMonitorPage(driver);
        goToMonitor();
        sleep(2);
        Assert.assertTrue(selectMonitorPage.nameInSearchField().isDisplayed());

    }
    @Test
    public void addToCartMonitor(){
        SelectMonitorPage selectMonitorPage = new SelectMonitorPage(driver);
        goToMonitor();
        sleep(2);
        selectMonitorPage.choiseMonitor().click();
        selectMonitorPage.addToCart().click();
        sleep(2);
        Assert.assertTrue(selectMonitorPage.produktAddedToCart().isDisplayed());
    }
    @Test
    public void buyNowWithoutSignIn(){
        SelectMonitorPage selectMonitorPage = new SelectMonitorPage(driver);
        goToMonitor();
        sleep(2);
        selectMonitorPage.choiseMonitor().click();
        selectMonitorPage.buyNowClickBtn().click();
        sleep(2);
        Assert.assertTrue(selectMonitorPage.fieldSighIn().isDisplayed());
    }
    @Test
    public void checkClearCart(){
        SelectMonitorPage selectMonitorPage = new SelectMonitorPage(driver);
        goToMonitor();
        sleep(3);
        selectMonitorPage.choiseMonitor().click();
        selectMonitorPage.addToCart().click();
        sleep(2);
        selectMonitorPage.closeModalWindow().click();
        selectMonitorPage.deleteProduktFromCart().click();
        Assert.assertTrue(selectMonitorPage.cartIsEmpty().isDisplayed());
    }
}

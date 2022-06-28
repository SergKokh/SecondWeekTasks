package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoToAmazonInPolandPage extends BasePage{

    public GoToAmazonInPolandPage(WebDriver driver){
        super(driver);
    }

    public void GoToAmazon(){
        driver.get("https://www.amazon.com/");
    }

    public WebElement deliveryRegionClickBtn() {
        return driver.findElement(By.xpath("//span[@id= \"glow-ingress-line1\"]"));
    }
    public WebElement goToСhoiceRegion() {
        return driver.findElement(By.xpath("//span[@data-action=  \"a-dropdown-button\"]"));
    }
    public WebElement selectRegionPoland() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Poland')]"));
    }
    public WebElement selectRegionDone() {
        return driver.findElement(By.xpath("//button[@class= \"a-button-text\"]"));
    }
    public WebElement visibilityPoland(){
        return driver.findElement(By.xpath("//span[normalize-space()='Poland']"));
    }



}

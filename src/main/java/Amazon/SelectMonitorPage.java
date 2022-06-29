package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectMonitorPage extends BasePage{
    public SelectMonitorPage(WebDriver driver){
        super(driver);
    }
    public WebElement getAllMenu() {
        return driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']//span"));
    }
    public WebElement getComputerMenu(){
        return driver.findElement(By.xpath("//div[normalize-space()='Computers']"));
    }

    public WebElement getMonitorPage(){
        return driver.findElement(By.xpath("//a[normalize-space()='Monitors']"));
    }
    public WebElement nameInSearchField(){
        return driver.findElement(By.xpath("//ul[@aria-labelledby='n-title']//li//span//span[contains(text(),'Monitors')]"));
    }
    public WebElement choiseMonitor(){
        return driver.findElement(By.xpath("//body//div[@id='a-page']//div[@id='search']//div//div//div//div//div//div[3]//div[1]//h2[1]//a[1]//span[1]"));
    }
    public WebElement addToCart(){
        return driver.findElement(By.xpath("//input[@value= \"Add to Cart\"]"));
    }
    public WebElement produktAddedToCart(){
        return driver.findElement(By.xpath("//div[@id='attachDisplayAddBaseAlert']//span"));
    }
    public WebElement buyNowClickBtn(){
        return driver.findElement(By.xpath("//input[@id= \"buy-now-button\"]"));
    }
    public WebElement fieldSighIn(){
        return driver.findElement(By.xpath("//h1[@class='a-spacing-small']"));
    }
    public WebElement deleteProduktFromCart(){
        return driver.findElement(By.xpath("//input[@value= \"Delete\"]"));
    }
    public WebElement cartIsEmpty(){
        return driver.findElement(By.xpath("//h1[@class='a-spacing-mini a-spacing-top-base']"));
    }
    public WebElement closeModalWindow() {
        return driver.findElement(By.xpath("//a[@id= \"attach-close_sideSheet-link\"]"));
    }
    public WebElement getToCart(){
        return driver.findElement(By.xpath("//span[normalize-space()='Cart']"));
    }

}

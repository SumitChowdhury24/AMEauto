package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class goldCardDescPage {
    WebDriver driver;

    //Locators
    By link_demandCartes = By.xpath("(//a[text()='Demandez votre Carte']//ancestor::span[1])[2]");

    //Constructor
    public goldCardDescPage(WebDriver driver) {
        this.driver = driver;
    }

    //BrowserActions
    public WebElement getDemandCartesLink() {
        return driver.findElement(link_demandCartes);
    }

    //Business Logic
    public void clickOnDemandCartesLink() {
        getDemandCartesLink().click();
    }



}

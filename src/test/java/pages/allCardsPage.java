package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class allCardsPage {
    WebDriver driver;

    //Locators
    By link_goldCartes = By.xpath("//span[text()='Carte Gold American Express']");

    //Constructor
    public allCardsPage(WebDriver driver) {
        this.driver = driver;
    }

    //BrowserActions
    public WebElement getGoldCartesLink() {
        return driver.findElement(link_goldCartes);
    }

    //Business Logic
    public void clickOnGoldCartesLink(){
        getGoldCartesLink().click();
    }


}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class allCardsPage {
    WebDriver driver;

    //Locators
    By goldCartesLink = By.xpath("//span[text()='Carte Gold American Express']");

    //Constructor
    public allCardsPage(WebDriver driver) {
        this.driver = driver;
    }

    //BrowserActions
    public WebElement getgoldCartesLink() {
        return driver.findElement(goldCartesLink);
    }

    //Business Logic
    public void clickOnGoldCartesLink(){
        getgoldCartesLink().click();
    }


}

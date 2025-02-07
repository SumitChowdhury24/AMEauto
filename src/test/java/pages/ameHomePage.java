package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ameHomePage {
    WebDriver driver;

    //Locators
    By cartesAmericanExp = By.xpath("//*[text()='Cartes American Express®']");
    By cartesAfKlmAmex = By.xpath("//*[text()='Cartes AF KLM-AMEX']");
    By cartesPremium = By.xpath("//*[text()='Cartes Premium']");

    //Constructor
    public ameHomePage(WebDriver driver) {
        this.driver = driver;
    }

    //BrowserActions
    public WebElement getcartesAmericanExp() {
        return driver.findElement(cartesAmericanExp);
    }

    public WebElement getcartesAfKlmAmex() {
        return driver.findElement(cartesAfKlmAmex);
    }

    public WebElement cartesPremium() {
        return driver.findElement(cartesPremium);
    }

    //BusinessFlows
    public void clickOnAmrExpCartes(){
        getcartesAmericanExp().click();
    }

}

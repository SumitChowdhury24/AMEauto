package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ameHomePage {
    WebDriver driver;

    //Locators
    By cartesAmericanExp = By.xpath("//*[text()='Cartes American Express®']");
    By acceptCookiesButton = By.xpath("//button[text()='Tout Accepter']");
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

    public WebElement getAcceptCookiesButton() {
        return driver.findElement(acceptCookiesButton);
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

    public void clickAcceptCookiesIfPresent(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(acceptCookiesButton));

            acceptButton.click();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Accept Cookies button not found: " + e.getMessage());
        }
    }

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ameHomePage {
    WebDriver driver;

    //Locators
    By link_cartesAmericanExp = By.xpath("//*[text()='Cartes American Express®']");
    By btn_acceptCookies = By.xpath("//button[text()='Tout Accepter']");
    By link_cartesAfKlmAmex = By.xpath("//*[text()='Cartes AF KLM-AMEX']");
    By link_cartesPremium = By.xpath("//*[text()='Cartes Premium']");

    //Constructor
    public ameHomePage(WebDriver driver) {
        this.driver = driver;
    }

    //BrowserActions
    public WebElement getCartesAmericanExp_link() {
        return driver.findElement(link_cartesAmericanExp);
    }

    public WebElement getAcceptCookies_Button() {
        return driver.findElement(btn_acceptCookies);
    }
    public WebElement getCartesAfKlmAmex_link() {
        return driver.findElement(link_cartesAfKlmAmex);
    }

    public WebElement getCartesPremium_link() {
        return driver.findElement(link_cartesPremium);
    }

    //BusinessFlows
    public void clickOnAmrExpCartes(){
        getCartesAmericanExp_link().click();
    }

    public void clickAcceptCookiesIfPresent(){
        int waitCounter=0;
        while (waitCounter < 5) {
            try {
                Thread.sleep(1000);
                getAcceptCookies_Button().click();
                break;
            } catch (Exception e) {
                waitCounter++;
            }
        }
    }

}

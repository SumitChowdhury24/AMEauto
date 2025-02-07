package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class userDetailsPage {
    WebDriver driver;

    //Locators
    By civiliteMrRadio = By.xpath("//input[@type='radio' and @value='MR']//following-sibling::label[1]");
    By civiliteMSRadio = By.xpath("//input[@type='radio' and @value='MS']//following-sibling::label[1]");
    By firstNameInput = By.xpath("//input[@id='fieldControl-input-firstName']");
    By lastNameInput = By.xpath("//input[@id='fieldControl-input-lastName']");
    By dobInput = By.xpath("//input[@id='fieldControl-input-dateOfBirth']");
    By emailInput = By.xpath("//input[@id='fieldControl-input-email']");
    By mobileNumberInput = By.xpath("//input[@id='fieldControl-input-mobilePhoneNumber']");
    By saveButton =By.xpath("//button[text()='Sauvegarder et Continuer']");

    //BrowserActions
    public WebElement getciviliteMrRadio() {
        return driver.findElement(civiliteMrRadio);
    }

    public WebElement getciviliteMSRadio() {
        return driver.findElement(civiliteMSRadio);
    }

    public WebElement getfirstNameInput() {
        return driver.findElement(firstNameInput);
    }

    public WebElement getlastNameInput() {
        return driver.findElement(lastNameInput);
    }

    public WebElement getdobInput() {
        return driver.findElement(dobInput);
    }

    public WebElement getemailInput() {
        return driver.findElement(emailInput);
    }

    public WebElement getmobileNumberInput() {
        return driver.findElement(mobileNumberInput);
    }

    public WebElement getsaveButton() {
        return driver.findElement(saveButton);
    }

//BusinessLogic
    //public void fillUserDetails()



}

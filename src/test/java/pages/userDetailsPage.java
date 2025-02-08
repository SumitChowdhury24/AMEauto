package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
    By birthPlaceCheckbox = By.xpath("//input[@type='checkbox' and @name='birthNameCheck']//following-sibling::label[1]");
    By placeOfBirthInput = By.xpath("//input[@id='fieldControl-input-placeOfBirth']");
    By depOfBirthSelect = By.xpath("//select[@id='fieldControl-input-departmentOfBirth']");
    By addrsLine1Input = By.xpath("//input[@id='fieldControl-input-residentialAddressLine2']");
    By postcodeInput = By.xpath("//input[@id='fieldControl-input-postcode']");
    By villageInput = By.xpath("//input[@id='fieldControl-input-cityTown']");
    By residentialStatusSelect = By.xpath("//select[@id='fieldControl-input-personalResidentialStatus']");
    By saveContinueButton = By.xpath("//button[text()='Sauvegarder et Continuer']");
    By IbanInput = By.xpath("//input[@id='fieldControl-input-bankAccountNumber']");
    By swiftcodeInput = By.xpath("//input[@id='fieldControl-input-bankIdentifierCode']");
    By tenureOfAcctSelect = By.xpath("//select[@id='fieldControl-input-tenureOfAccount']");
    By annualIncomeInput = By.xpath("//input[@id='fieldControl-input-annualPersonalIncome']");
    By hasAdditionalIncomreRadio = By.xpath("//input[@type='radio' and @id='hasAdditionalIncome1-NO']//following-sibling::label[1]");
    By totalAssetSelect = By.xpath("//select[@id='fieldControl-input-totalAssets']");
    By occupationSelect = By.xpath("//select[@id='fieldControl-input-occupation']");
    By occupationDescSelect = By.xpath("//select[@id='fieldControl-input-occupationDescription']");
    //SandC
    By motherMaidenNameInput = By.xpath("//input[@id='fieldControl-input-mothersMaidenName']");
    //By birthPlaceCheckbox = By.xpath("//input[@type='checkbox' and @name='birthNameCheck']//following-sibling::label[1]");
    By firstPinInput = By.xpath("//input[@id='fieldControl-input-pin']");
    By secondPinInput = By.xpath("//input[@id='fieldControl-input-confirmPin']");
    By receiveMarketEmailRadio = By.xpath("//input[@type='radio' and @id='marketingEmailPreferences-true']//following-sibling::label[1]");
    By receiveMarketSmsRadio = By.xpath("//input[@type='radio' and @id='marketingSMSPhonePostalPreferences-OPT_OUT']//following-sibling::label[1]");
    By submitButton = By.xpath("//button[text()='Soumettre']");
    By continueButton = By.xpath("//button[text()='Continuer']");
    By acceptCookiesButton = By.xpath("//button[text()='Tout Accepter']");
    By acceptPrivacy = By.xpath("//input[@type='checkbox' and @name='checkbox-1']//following-sibling::label[1]");
    By passwordInp = By.xpath("//input[@id='cuf']");

    By finalSubmit = By.xpath("//button[@id='submitBtn']");



    //
    public userDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

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

    public WebElement getdepOfBirthSelect() {
        return driver.findElement(depOfBirthSelect);
    }

    //BusinessLogic
    public void clickOnCiviliteMr(){
    getciviliteMrRadio().click();
}
    public void clickOnCiviliteMS(){
        getciviliteMSRadio().click();
    }

    public void enterFirstName(String fName){
        getfirstNameInput().sendKeys(fName);
    }

    public void enterLastName(String lName){
        getlastNameInput().sendKeys(lName);
    }

    public void enterDOB(String DOB){
        getdobInput().sendKeys(DOB);
    }

    public void enterEmail(String Email){
        getemailInput().sendKeys(Email);
    }

    public void enterMobileNum(String mNum){
        getmobileNumberInput().sendKeys(mNum);
    }

    public void clickSaveButton(){
        getsaveButton().click();
    }

    public void selectDepOfBirth(){
        Select dropdown = new Select(getdepOfBirthSelect());
        dropdown.selectByIndex(2);
    }

}

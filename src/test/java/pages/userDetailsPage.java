package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    By saveButton = By.xpath("//button[text()='Sauvegarder et Continuer']");
    //By saveButton = By.xpath("//div[@class='row pad-0 text-align-center-sm-down margin-4-tb']");
    By birthNameCheckbox = By.xpath("//input[@type='checkbox' and @name='birthNameCheck']//following-sibling::label[1]");
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
    By receiveMarketEmailNoRadio = By.xpath("//input[@type='radio' and @id='marketingEmailPreferences-false']//following-sibling::label[1]");
    By receiveMarketEmailYesRadio = By.xpath("//input[@type='radio' and @id='marketingEmailPreferences-false']//following-sibling::label[1]");
    By receiveMarketSmsRadio = By.xpath("//input[@type='radio' and @id='marketingSMSPhonePostalPreferences-OPT_OUT']//following-sibling::label[1]");
    By submitButton = By.xpath("//button[text()='Soumettre']");
    By continueButton = By.xpath("//button[text()='Continuer']");
    By acceptCookiesButton = By.xpath("//button[text()='Tout Accepter']");
    By acceptPrivacy = By.xpath("//input[@type='checkbox' and @name='checkbox-1']//following-sibling::label[1]");
    By passwordInp = By.xpath("//input[@id='cuf']");
    By finalSubmit = By.xpath("//button[@id='submitBtn']");
    By finalPageSubmit = By.xpath("//button[text()='Fermez la Page']");


    //Constructor
    public userDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    //BrowserActions
    public WebElement getciviliteMrRadio() { return driver.findElement(civiliteMrRadio);}
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
    public WebElement getsaveButton() {return driver.findElement(saveButton);}
    public WebElement getBirthNameCheckbox() {return driver.findElement(birthNameCheckbox);}
    public WebElement getdepOfBirthSelect() {
        return driver.findElement(depOfBirthSelect);
    }

    public WebElement getplaceOfBirthInput() {
        return driver.findElement(placeOfBirthInput);
    }
    public WebElement getaddrsLine1Input() {
        return driver.findElement(addrsLine1Input);
    }
    public WebElement getpostcodeInput() {
        return driver.findElement(postcodeInput);
    }
    public WebElement getvillageInput() {
        return driver.findElement(villageInput);
    }
    public WebElement getresidentialStatusSelect() {
        return driver.findElement(residentialStatusSelect);
    }
    public WebElement getsaveContinueButton() {
        return driver.findElement(saveContinueButton);
    }
    public WebElement getIbanInput() {
        return driver.findElement(IbanInput);
    }
    public WebElement getswiftcodeInput() {
        return driver.findElement(swiftcodeInput);
    }
    public WebElement gettenureOfAcctSelect() {
        return driver.findElement(tenureOfAcctSelect);
    }
    public WebElement getannualIncomeInput() {
        return driver.findElement(annualIncomeInput);
    }
    public WebElement gethasAdditionalIncomreRadio() {
        return driver.findElement(hasAdditionalIncomreRadio);
    }
    public WebElement gettotalAssetSelect() {
        return driver.findElement(totalAssetSelect);
    }
    public WebElement getoccupationSelect() {
        return driver.findElement(occupationSelect);
    }
    public WebElement getoccupationDescSelect() {
        return driver.findElement(occupationDescSelect);
    }
    public WebElement getmotherMaidenNameInput() {
        return driver.findElement(motherMaidenNameInput);
    }
    public WebElement getfirstPinInput() {
        return driver.findElement(firstPinInput);
    }
    public WebElement getsecondPinInput() {
        return driver.findElement(secondPinInput);
    }
    public WebElement getreceiveMarketEmailNoRadio() {
        return driver.findElement(receiveMarketEmailNoRadio);
    }

    public WebElement getreceiveMarketEmailYesRadio() {
        return driver.findElement(receiveMarketEmailYesRadio);
    }
    public WebElement getreceiveMarketSmsRadio() {
        return driver.findElement(receiveMarketSmsRadio);
    }
    public WebElement getsubmitBtn() {return driver.findElement(submitButton);}
    public WebElement getcontinueButton() {
        return driver.findElement(continueButton);
    }
    public WebElement getacceptCookiesButton() {
        return driver.findElement(acceptCookiesButton);
    }
    public WebElement getacceptPrivacy() {
        return driver.findElement(acceptPrivacy);
    }
    public WebElement getpasswordInp() {
        return driver.findElement(passwordInp);
    }
    public WebElement getfinalSubmit() {
        return driver.findElement(finalSubmit);
    }
    public WebElement getfinalPage() {
        return driver.findElement(finalPageSubmit);
    }

    //BusinessLogic
    public void clickOnCiviliteMr() {getciviliteMrRadio().click();}
    public void clickOnCiviliteMS() {getciviliteMSRadio().click();}
    public void enterFirstName(String fName) {getfirstNameInput().sendKeys(fName);}
    public void enterLastName(String lName) {getlastNameInput().sendKeys(lName);}
    public void enterDOB(String DOB) {getdobInput().sendKeys(DOB);}
    public void enterEmail(String Email) {getemailInput().sendKeys(Email);}
    public void enterMobileNum(String mNum) {getmobileNumberInput().sendKeys(mNum);}
    public void clickSaveButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(getsaveButton());
        actions.perform();
        getsaveButton().click();
    }
    public void clickBirthNameCheckbox() {getBirthNameCheckbox().click();}
    public void enterPOB(String POB) {getplaceOfBirthInput().sendKeys(POB);}
    public void enterAddrsLine1Input(String value) {getaddrsLine1Input().sendKeys(value);}
    public void enterPostcode(String value) {getpostcodeInput().sendKeys(value);}
    public void enterVillage(String value) {getvillageInput().sendKeys(value);}

    public void selectDepOfBirth() {
        Select dropdown = new Select(getdepOfBirthSelect());
        dropdown.selectByIndex(2);
    }

    public void selectResidentialStatus() {
        Select dropdown = new Select(getresidentialStatusSelect());
        dropdown.selectByIndex(2);
    }

    public void clickSaveContinueButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(getsaveContinueButton());
        actions.perform();
        getsaveContinueButton().click();
    }
    public void enterIban(String value) {getIbanInput().sendKeys(value);}
    public void enterSwiftCode(String value) {getswiftcodeInput().sendKeys(value);}

    public void selectTenureOfAcct() {
        Select dropdown = new Select(gettenureOfAcctSelect());
        dropdown.selectByIndex(2);
    }

    public void enterAnnualIncome(String value) {getannualIncomeInput().sendKeys(value);}
    public void clickHasNoAdditionalIncome() {gethasAdditionalIncomreRadio().click();}

    public void selectTotalAsset() {
        Select dropdown = new Select(gettotalAssetSelect());
        dropdown.selectByIndex(2);
    }
    public void selectOccupation() {
        Select dropdown = new Select(getoccupationSelect());
        dropdown.selectByIndex(7);
    }
    public void selectOccupationDesc() {
        Select dropdown = new Select(getoccupationDescSelect());
        dropdown.selectByIndex(1);
    }

    public void enterMotherMaidenName(String value) {getmotherMaidenNameInput().sendKeys(value);}
    public void enterFirstPin(String value) {getfirstPinInput().sendKeys(value);}
    public void enterSecondPin(String value) {getsecondPinInput().sendKeys(value);}
    public void clickNoEmailRadio() {getreceiveMarketEmailNoRadio().click();}
    public void clickYesEmailRadio() {getreceiveMarketEmailYesRadio().click();}
    public void clickSmsYesRadio() {getreceiveMarketSmsRadio().click();}
    public void clickSbmtBtn() {
        Actions actions = new Actions(driver);
        actions.moveToElement(getsubmitBtn());
        actions.perform();
        getsubmitBtn().click();
    }
    public void clickFinalPageSubmit() {
        getfinalPage().click();
    }
    public void clickContinue() {getcontinueButton().click();}
    public void clickCookies() {getacceptCookiesButton().click();}
    public void clickAcceptPrivacy() {getacceptPrivacy().click();}
    public void enterPassword(String value) {getpasswordInp().sendKeys(value);}
    public void clickFinal() {getfinalSubmit().click();}


}

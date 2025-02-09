package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class userDetailsPage {
    WebDriver driver;

    //Locators
    By rad_civiliteMR = By.xpath("//input[@type='radio' and @value='MR']//following-sibling::label[1]");
    By rad_civiliteMS = By.xpath("//input[@type='radio' and @value='MS']//following-sibling::label[1]");
    By inp_firstName = By.xpath("//input[@id='fieldControl-input-firstName']");
    By inp_lastName = By.xpath("//input[@id='fieldControl-input-lastName']");
    By inp_Dob = By.xpath("//input[@id='fieldControl-input-dateOfBirth']");
    By inp_Email = By.xpath("//input[@id='fieldControl-input-email']");
    By inp_mobileNumber = By.xpath("//input[@id='fieldControl-input-mobilePhoneNumber']");
    By btn_Save = By.xpath("//button[text()='Sauvegarder et Continuer']");
    //By saveButton = By.xpath("//div[@class='row pad-0 text-align-center-sm-down margin-4-tb']");
    By chkbox_birthName = By.xpath("//input[@type='checkbox' and @name='birthNameCheck']//following-sibling::label[1]");
    By inp_placeOfBirth = By.xpath("//input[@id='fieldControl-input-placeOfBirth']");
    By slct_depOfBirth = By.xpath("//select[@id='fieldControl-input-departmentOfBirth']");
    By inp_addrsLine1 = By.xpath("//input[@id='fieldControl-input-residentialAddressLine2']");
    By inp_Postcode = By.xpath("//input[@id='fieldControl-input-postcode']");
    By inp_Village = By.xpath("//input[@id='fieldControl-input-cityTown']");
    By slct_residentialStatus = By.xpath("//select[@id='fieldControl-input-personalResidentialStatus']");
    By btn_saveContinue = By.xpath("//button[text()='Sauvegarder et Continuer']");
    By inp_Iban = By.xpath("//input[@id='fieldControl-input-bankAccountNumber']");
    By inp_Swiftcode = By.xpath("//input[@id='fieldControl-input-bankIdentifierCode']");
    By slct_tenureOfAcct = By.xpath("//select[@id='fieldControl-input-tenureOfAccount']");
    By inp_annualIncome = By.xpath("//input[@id='fieldControl-input-annualPersonalIncome']");
    By rad_hasAdditionalIncome = By.xpath("//input[@type='radio' and @id='hasAdditionalIncome1-NO']//following-sibling::label[1]");
    By slct_totalAsset = By.xpath("//select[@id='fieldControl-input-totalAssets']");
    By slct_Occupation = By.xpath("//select[@id='fieldControl-input-occupation']");
    By slct_OccupationDesc = By.xpath("//select[@id='fieldControl-input-occupationDescription']");
    By inp_motherMaidenName = By.xpath("//input[@id='fieldControl-input-mothersMaidenName']");
    By inp_firstPin = By.xpath("//input[@id='fieldControl-input-pin']");
    By inp_secondPin = By.xpath("//input[@id='fieldControl-input-confirmPin']");
    By rad_ReceiveMarketEmailNo = By.xpath("//input[@type='radio' and @id='marketingEmailPreferences-false']//following-sibling::label[1]");
    By rad_ReceiveMarketEmailYes = By.xpath("//input[@type='radio' and @id='marketingEmailPreferences-false']//following-sibling::label[1]");
    By rad_ReceiveMarketSms = By.xpath("//input[@type='radio' and @id='marketingSMSPhonePostalPreferences-OPT_OUT']//following-sibling::label[1]");
    By btn_Submit = By.xpath("//button[text()='Soumettre']");
    By btn_Continue = By.xpath("//button[text()='Continuer']");
    By btn_AcceptCookies = By.xpath("//button[text()='Tout Accepter']");
    By chckbox_acceptPrivacy = By.xpath("//input[@type='checkbox' and @name='checkbox-1']//following-sibling::label[1]");
    By inp_smsPassword = By.xpath("//input[@id='cuf']");
    By btn_finalSubmit = By.xpath("//button[@id='submitBtn']");
    By btn_finalPageSubmit = By.xpath("//button[text()='Fermez la Page']");


    //Constructor
    public userDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    //BrowserActions
    public WebElement getciviliteMrRadio() { return driver.findElement(rad_civiliteMR);}
    public WebElement getciviliteMSRadio() {
        return driver.findElement(rad_civiliteMS);
    }
    public WebElement getfirstNameInput() {
        return driver.findElement(inp_firstName);
    }
    public WebElement getlastNameInput() {
        return driver.findElement(inp_lastName);
    }
    public WebElement getdobInput() {
        return driver.findElement(inp_Dob);
    }
    public WebElement getemailInput() {
        return driver.findElement(inp_Email);
    }
    public WebElement getmobileNumberInput() {
        return driver.findElement(inp_mobileNumber);
    }
    public WebElement getsaveButton() {return driver.findElement(btn_Save);}
    public WebElement getBirthNameCheckbox() {return driver.findElement(chkbox_birthName);}
    public WebElement getdepOfBirthSelect() {
        return driver.findElement(slct_depOfBirth);
    }

    public WebElement getplaceOfBirthInput() {
        return driver.findElement(inp_placeOfBirth);
    }
    public WebElement getaddrsLine1Input() {
        return driver.findElement(inp_addrsLine1);
    }
    public WebElement getpostcodeInput() {
        return driver.findElement(inp_Postcode);
    }
    public WebElement getvillageInput() {
        return driver.findElement(inp_Village);
    }
    public WebElement getresidentialStatusSelect() {
        return driver.findElement(slct_residentialStatus);
    }
    public WebElement getsaveContinueButton() {
        return driver.findElement(btn_saveContinue);
    }
    public WebElement getIbanInput() {
        return driver.findElement(inp_Iban);
    }
    public WebElement getswiftcodeInput() {
        return driver.findElement(inp_Swiftcode);
    }
    public WebElement gettenureOfAcctSelect() {
        return driver.findElement(slct_tenureOfAcct);
    }
    public WebElement getannualIncomeInput() {
        return driver.findElement(inp_annualIncome);
    }
    public WebElement gethasAdditionalIncomreRadio() {
        return driver.findElement(rad_hasAdditionalIncome);
    }
    public WebElement gettotalAssetSelect() {
        return driver.findElement(slct_totalAsset);
    }
    public WebElement getoccupationSelect() {
        return driver.findElement(slct_Occupation);
    }
    public WebElement getoccupationDescSelect() {
        return driver.findElement(slct_OccupationDesc);
    }
    public WebElement getmotherMaidenNameInput() {
        return driver.findElement(inp_motherMaidenName);
    }
    public WebElement getfirstPinInput() {
        return driver.findElement(inp_firstPin);
    }
    public WebElement getsecondPinInput() {
        return driver.findElement(inp_secondPin);
    }
    public WebElement getreceiveMarketEmailNoRadio() {return driver.findElement(rad_ReceiveMarketEmailNo);}
    public WebElement getreceiveMarketEmailYesRadio() {return driver.findElement(rad_ReceiveMarketEmailYes);}
    public WebElement getreceiveMarketSmsRadio() {
        return driver.findElement(rad_ReceiveMarketSms);
    }
    public WebElement getsubmitBtn() {return driver.findElement(btn_Submit);}
    public WebElement getcontinueButton() {
        return driver.findElement(btn_Continue);
    }
    public WebElement getacceptCookiesButton() {
        return driver.findElement(btn_AcceptCookies);
    }
    public WebElement getacceptPrivacy() {
        return driver.findElement(chckbox_acceptPrivacy);
    }
    public WebElement getpasswordInp() {
        return driver.findElement(inp_smsPassword);
    }
    public WebElement getfinalSubmit() {
        return driver.findElement(btn_finalSubmit);
    }
    public WebElement getfinalPage() {
        return driver.findElement(btn_finalPageSubmit);
    }

    //BusinessLogic
    public void clickOnCiviliteMr() {getciviliteMrRadio().click();}
    public void clickOnCiviliteMS() {getciviliteMSRadio().click();}
    public void enterFirstName(String fName) {getfirstNameInput().sendKeys(fName);}
    public void enterLastName(String lName) {getlastNameInput().sendKeys(lName);}
    public void enterDOB(String DOB) {getdobInput().sendKeys(DOB);}
    public void enterEmail(String Email) {getemailInput().sendKeys(Email);}
    public void enterMobileNum(String mNum) {getmobileNumberInput().sendKeys(mNum);}
    public void clickBirthNameCheckbox() {getBirthNameCheckbox().click();}
    public void enterPOB(String POB) {getplaceOfBirthInput().sendKeys(POB);}
    public void enterAddrsLine1Input(String value) {getaddrsLine1Input().sendKeys(value);}
    public void enterPostcode(String value) {getpostcodeInput().sendKeys(value);}
    public void enterVillage(String value) {getvillageInput().sendKeys(value);}
    public void enterIban(String value) {getIbanInput().sendKeys(value);}
    public void enterSwiftCode(String value) {getswiftcodeInput().sendKeys(value);}
    public void enterAnnualIncome(String value) {getannualIncomeInput().sendKeys(value);}
    public void clickHasNoAdditionalIncome() {gethasAdditionalIncomreRadio().click();}
    public void enterMotherMaidenName(String value) {getmotherMaidenNameInput().sendKeys(value);}
    public void enterFirstPin(String value) {getfirstPinInput().sendKeys(value);}
    public void enterSecondPin(String value) {getsecondPinInput().sendKeys(value);}
    public void clickNoEmailRadio() {getreceiveMarketEmailNoRadio().click();}
    public void clickYesEmailRadio() {getreceiveMarketEmailYesRadio().click();}
    public void clickSmsYesRadio() {getreceiveMarketSmsRadio().click();}
    public void clickFinalPageSubmit() {
        getfinalPage().click();
    }
    public void clickContinue() {getcontinueButton().click();}
    public void clickCookies() {getacceptCookiesButton().click();}
    public void clickAcceptPrivacy() {getacceptPrivacy().click();}
    public void enterPassword(String value) {getpasswordInp().sendKeys(value);}
    public void clickFinal() {getfinalSubmit().click();}


    public void clickSaveButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(getsaveButton());
        actions.perform();
        getsaveButton().click();
    }

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

    public void selectTenureOfAcct() {
        Select dropdown = new Select(gettenureOfAcctSelect());
        dropdown.selectByIndex(2);
    }

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

    public void clickSbmtBtn() {
        Actions actions = new Actions(driver);
        actions.moveToElement(getsubmitBtn());
        actions.perform();
        getsubmitBtn().click();
    }
}

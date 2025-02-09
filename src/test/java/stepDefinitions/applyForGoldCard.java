package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.allCardsPage;
import pages.ameHomePage;
import pages.goldCardDescPage;
import pages.userDetailsPage;
import utilities.webDriverSetup;
import utilities.extentReporter;

import java.time.Duration;

public class applyForGoldCard {

    WebDriver driver;
    ameHomePage homePage;
    allCardsPage CardsPage;
    goldCardDescPage CardDescPage;
    userDetailsPage userDetailPage;

    @Given("User opens Browser and navigates to Aex Url")
    public void setUp() {
        try{
            driver = webDriverSetup.getDriver();
            driver.manage().window().maximize();
            driver.get("https://www.americanexpress.com/fr-fr/?inav=NavLogo");
            homePage = new ameHomePage(driver);
            extentReporter.logPass("User navigated to Amx url");
        }catch (Exception e){
            extentReporter.logFailure(e.getMessage());
        }

    }

    @When("User clicks on apply American Express Cart")
    public void userClicksOnApplyCards() {
        try{
            homePage.clickAcceptCookiesIfPresent();
            homePage.clickOnAmrExpCartes();
            extentReporter.logPass("User clicked on AmExp cart link");
        }catch (Exception e){
            extentReporter.logFailure(e.getMessage());
        }
    }

    @And("User clicks on Gold Cart")
    public void userClicksOnGoldCart() {
        try{
            homePage.clickAcceptCookiesIfPresent();
            CardsPage = new allCardsPage(driver);
            CardsPage.clickOnGoldCartesLink();
            extentReporter.logPass("User clicked on apply gold card link");
        }catch (Exception e){
            extentReporter.logFailure(e.getMessage());
        }
    }

    @And("User clicks on Demand Cart")
    public void userClicksOnDemandCart() {
        try{
            homePage.clickAcceptCookiesIfPresent();
            CardDescPage = new goldCardDescPage(driver);
            CardDescPage.clickOnDemandCartesLink();
            extentReporter.logPass("User clicks on demand card");
        }catch (Exception e){
            extentReporter.logFailure(e.getMessage());
        }
    }

    @Then("User enters its details as {string} {string} {string} {string} {string} {string}")
    public void userEntersItsDetailsAs(String Salutation, String fName, String lName, String Dob, String Email, String mobNum) {
        userDetailPage = new userDetailsPage(driver);
        int waitCounter = 0;

        //Waiting for Userdetails page to load
        while (waitCounter < 10) {
            try {
                Thread.sleep(1000);
                userDetailPage.getciviliteMrRadio().isDisplayed();
                break;
            } catch (Exception e) {
                waitCounter++;
            }
        }
        if (Salutation.equalsIgnoreCase("MR")) {
            //userDetailPage.getciviliteMrRadio().click();
            userDetailPage.clickOnCiviliteMr();
            extentReporter.logPass("User clicked on Civilite Mr link");
        } else {
            //userDetailPage.getciviliteMSRadio().click();
            userDetailPage.clickOnCiviliteMS();
            extentReporter.logPass("User clicked on Civilite MS link");
        }

        try{
            userDetailPage.enterFirstName(fName);
            userDetailPage.enterLastName(lName);
            userDetailPage.enterDOB(Dob);
            userDetailPage.enterEmail(Email);
            userDetailPage.enterMobileNum(mobNum);
            extentReporter.logPass("User enters it's name. dob, mobile num and email");

            userDetailPage.clickSaveButton();
            extentReporter.logPass("User clicks on save button");
        }catch (Exception e){
            extentReporter.logFailure(e.getMessage());
        }
    }

    @And("Adress details as {string} {string} {string} {string}")
    public void adressDetailsAs(String Pob, String Addrs, String PostCode, String Village) {
        try{
            userDetailPage.clickBirthNameCheckbox();
            userDetailPage.enterPOB(Pob);
            userDetailPage.selectDepOfBirth();
            userDetailPage.enterAddrsLine1Input(Addrs);
            userDetailPage.enterPostcode(PostCode);
            userDetailPage.enterVillage(Village);
            userDetailPage.selectResidentialStatus();
            extentReporter.logPass("User enters it's Place of Birth, Address, Postcode, village and Residential status");

            userDetailPage.clickSaveContinueButton();
            extentReporter.logPass("User clicks on save and continue");
        }catch (Exception e){
            extentReporter.logFailure(e.getMessage());
        }

    }

    @And("User enters bank details as {string} {string} {string}")
    public void userEntersBankDetailsAs(String Iban, String swiftCode, String AnnualIncome) {
        try{
            userDetailPage.enterIban(Iban);
            userDetailPage.enterSwiftCode(swiftCode);
            userDetailPage.selectTenureOfAcct();
            userDetailPage.enterAnnualIncome(AnnualIncome);
            userDetailPage.clickHasNoAdditionalIncome();
            userDetailPage.selectTotalAsset();
            userDetailPage.selectOccupation();
            userDetailPage.selectOccupationDesc();
            extentReporter.logPass("User enters Iban, swiftcode, account tenure, Annual income, Total asset, Occupation");

            userDetailPage.clickSaveContinueButton();
            extentReporter.logPass("User clicks on save and continue");
        }catch (Exception e){
            extentReporter.logFailure(e.getMessage());
        }
    }

    @Then("user enters details in final page {string}")
    public void userEntersDetailsInFinalPage(String motherName) {
        try{
            userDetailPage.enterMotherMaidenName(motherName);
            userDetailPage.enterFirstPin("1234");
            userDetailPage.enterSecondPin("1234");
            Thread.sleep(1000);
            userDetailPage.clickNoEmailRadio();
            userDetailPage.clickYesEmailRadio();
            userDetailPage.clickSmsYesRadio();
            extentReporter.logPass("User enters Mother's maiden name, pin details and marketting consents");

            userDetailPage.clickSbmtBtn();
            extentReporter.logPass("User clicks on submit button");
        }catch (Exception e){
            extentReporter.logFailure(e.getMessage());
        }
    }

    @And("User clicks on Final Submission and validates if user is created")
    public void userClicksOnFinalSubmissionAndValidatesIfUserIsCreated() {
        int waitCounter = 0;
        while (waitCounter < 30) {
            try {
                Thread.sleep(2000);
                userDetailPage.clickFinalPageSubmit();
                break;
            } catch (Exception e) {
                waitCounter++;
            }
        }

        if(waitCounter<30){
            extentReporter.logFailure("Final submission link has not appeared, form could not be completed");
        }else{
            extentReporter.logPass("Form completed");
        }

        Assert.assertTrue(waitCounter<30);
    }

    @And("User closes the browser")
    public void userClosesTheBrowser() {
        driver.quit();
        extentReporter.logStep("Browser closed");
    }
}

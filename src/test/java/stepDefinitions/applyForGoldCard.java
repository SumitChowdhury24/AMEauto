package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.allCardsPage;
import pages.ameHomePage;
import pages.goldCardDescPage;
import pages.userDetailsPage;
import utilities.webDriverSetup;

import java.time.Duration;

public class applyForGoldCard {

    WebDriver driver;
    ameHomePage homePage;
    allCardsPage CardsPage;
    goldCardDescPage CardDescPage;
    userDetailsPage userDetailPage;

    @Given("User opens Browser and navigates to Aex Url")
    public void setUp() {
        driver = webDriverSetup.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.americanexpress.com/fr-fr/?inav=NavLogo");
        homePage = new ameHomePage(driver);
    }

    @When("User clicks on apply American Express Cart")
    public void userClicksOnApplyCards() {
        homePage.clickAcceptCookiesIfPresent();
        homePage.clickOnAmrExpCartes();
    }

    @And("User clicks on Gold Cart")
    public void userClicksOnGoldCart() {
        homePage.clickAcceptCookiesIfPresent();
        CardsPage = new allCardsPage(driver);
        CardsPage.clickOnGoldCartesLink();
    }

    @And("User clicks on Demand Cart")
    public void userClicksOnDemandCart() {
        homePage.clickAcceptCookiesIfPresent();
        CardDescPage = new goldCardDescPage(driver);
        CardDescPage.clickOnDemandCartesLink();
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
        } else {
            //userDetailPage.getciviliteMSRadio().click();
            userDetailPage.clickOnCiviliteMS();
        }

        userDetailPage.enterFirstName(fName);
        userDetailPage.enterLastName(lName);
        userDetailPage.enterDOB(Dob);
        userDetailPage.enterEmail(Email);
        userDetailPage.enterMobileNum(mobNum);
        userDetailPage.clickSaveButton();
    }

    @And("Adress details as {string} {string} {string} {string}")
    public void adressDetailsAs(String Pob, String Addrs, String PostCode, String Village) {
        userDetailPage.clickBirthNameCheckbox();
        userDetailPage.enterPOB(Pob);
        userDetailPage.selectDepOfBirth();
        userDetailPage.enterAddrsLine1Input(Addrs);
        userDetailPage.enterPostcode(PostCode);
        userDetailPage.enterVillage(Village);
        userDetailPage.selectResidentialStatus();
        userDetailPage.clickSaveContinueButton();
    }

    @And("User enters bank details as {string} {string} {string}")
    public void userEntersBankDetailsAs(String Iban, String swiftCode, String AnnualIncome) {
        userDetailPage.enterIban(Iban);
        userDetailPage.enterSwiftCode(swiftCode);
        userDetailPage.selectTenureOfAcct();
        userDetailPage.enterAnnualIncome(AnnualIncome);
        userDetailPage.clickHasNoAdditionalIncome();
        userDetailPage.selectTotalAsset();
        userDetailPage.selectOccupation();
        userDetailPage.selectOccupationDesc();
        userDetailPage.clickSaveContinueButton();
    }

    @Then("user enters details in final page {string}")
    public void userEntersDetailsInFinalPage(String motherName){
        userDetailPage.enterMotherMaidenName(motherName);
        userDetailPage.enterFirstPin("1234");
        userDetailPage.enterSecondPin("1234");
        userDetailPage.clickNoEmailRadio();
        userDetailPage.clickYesEmailRadio();
        userDetailPage.clickSmsYesRadio();
        userDetailPage.clickSbmtBtn();
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
        Assert.assertTrue(waitCounter<30);
    }

    @And("User closes the browser")
    public void userClosesTheBrowser() {
        driver.quit();
    }
}

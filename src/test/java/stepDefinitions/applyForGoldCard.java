package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.allCardsPage;
import pages.ameHomePage;
import pages.goldCardDescPage;
import pages.userDetailsPage;
import utilities.webDriverSetup;

public class applyForGoldCard {

    WebDriver driver;
    ameHomePage homePage;
    allCardsPage CardsPage;
    goldCardDescPage CardDescPage;
    userDetailsPage userDetailPage;

    @Given("User opens Browser and navigates to Aex Url")
    public void setUp() {
        driver = webDriverSetup.getDriver();
        driver.get("https://www.americanexpress.com/fr-fr/?inav=NavLogo");
        homePage = new ameHomePage(driver);
    }

    @When("User clicks on apply American Express Cart")
    public void userClicksOnApplyCards(){
        homePage.clickAcceptCookiesIfPresent();
        homePage.clickOnAmrExpCartes();
    }

    @And("User clicks on Gold Cart")
    public void userClicksOnGoldCart() {
        CardsPage=new allCardsPage(driver);
        CardsPage.clickOnGoldCartesLink();
    }

    @And("User clicks on Demand Cart")
    public void userClicksOnDemandCart() {
        CardDescPage = new goldCardDescPage(driver);
        CardDescPage.clickOnDemandCartesLink();
    }

    @Then("User enters its details as {string} {string} {string} {string} {string} {string}")
    public void userEntersItsDetailsAs(String Salutation, String fName, String lName, String Dob, String Email, String mobNum) {
        userDetailPage = new userDetailsPage(driver);
        if(Salutation.equalsIgnoreCase("MR")){
            userDetailPage.getciviliteMrRadio().click();
        }else{
            userDetailPage.getciviliteMSRadio().click();
        }

        userDetailPage.enterFirstName(fName);
        userDetailPage.enterLastName(lName);
        userDetailPage.enterDOB(Dob);
        userDetailPage.enterEmail(Email);
        userDetailPage.enterMobileNum(mobNum);
        userDetailPage.clickSaveButton();
    }
}

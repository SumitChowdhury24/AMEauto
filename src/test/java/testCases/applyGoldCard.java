package testCases;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import utilities.webDriverSetup;

public class applyGoldCard {

    WebDriver driver;
    ameHomePage homePage;
    allCardsPage CardsPage;
    goldCardDescPage CardDescPage;
    userDetailsPage userDetailPage;

    @BeforeClass
    public void setUp() {
        driver = webDriverSetup.getDriver();
        driver.get("https://www.americanexpress.com/fr-fr/?inav=NavLogo");
        homePage = new ameHomePage(driver);
    }

    @Test
    public void applyForGoldCard() {
        homePage.clickOnAmrExpCartes();
        //Assert.assertTrue(driver.getTitle().contains("Dashboard"));

        CardsPage.clickOnGoldCartesLink();
        //Assertions

        CardDescPage.clickOnDemandCartesLink();
        //Assertions

        userDetailPage.getciviliteMrRadio().click();
    }

}

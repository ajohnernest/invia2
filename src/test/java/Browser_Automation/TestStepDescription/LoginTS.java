package Browser_Automation.TestStepDescription;




import Browser_Automation.TestPageClasses.HomePage;
import Browser_Automation.TestPageClasses.HotelPage;
import Browser_Automation.TestPageClasses.HotelSearchResultsPage;
import Browser_Automation.TestPageClasses.TestBase;
import org.jbehave.core.annotations.*;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class LoginTS extends TestBase {



    @BeforeStories
    public void browsersetup() throws Exception
    {
        System.out.println("browser is ready");

    }

    @Given("I wanted to book a trip")
    public void bookticket() throws Exception
    {

        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.openpageurl();
        homepage.clickHotelButton();
    }

    @When("I do a search with valid details")
    public void navigatetoHotelpage() throws Exception
    {
        Thread.sleep(4000);
        HotelPage Hotelpage = PageFactory.initElements(driver,HotelPage.class);
        Hotelpage.ClickDestination();
        Hotelpage.ClickStartDate();
        Hotelpage.ClickEndDate();
        Hotelpage.clickSearchOffers();


    }


    @Then("the portal should show the results")
    public void NavigateToSearchResults() throws Exception
    {
        Thread.sleep(4000);
        HotelSearchResultsPage HotelResults = PageFactory.initElements(driver,HotelSearchResultsPage.class);
        HotelResults.scrollandclick();
        //HotelResults.clickFiveRating();
        //HotelResults.clickFiveStar();

    }
}

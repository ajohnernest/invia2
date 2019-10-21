package Browser_Automation.TestPageClasses;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class HotelSearchResultsPage {


    WebDriver driver;

    public HotelSearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }


    //Page element locators and Id's

    @FindBy(how=How.XPATH,using="//*[@id=\"pageWrapper\"]/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div/div[5]/label")
    private WebElement FiveStar;

    @FindBy(how=How.XPATH,using="//*[@id=\"pageWrapper\"]/div[1]/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/label[5]/span")
    private WebElement FiveRating;


    public void scrollandclick() throws Exception {


        System.out.println("executed this section of code");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        FiveRating.click();
        FiveStar.click();
        //Actions actions = new Actions(driver);
        //actions.moveToElement(FiveRating).click().perform();

        //actions.moveToElement(FiveStar);
        //actions.perform();
    }


   /* public void clickFiveStar() throws Exception {
        FiveStar.click();
    }


    public void clickFiveRating() throws Exception {
        FiveRating.click();
    }
*/
}

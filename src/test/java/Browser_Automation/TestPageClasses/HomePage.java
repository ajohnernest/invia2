package Browser_Automation.TestPageClasses;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends TestBase {


    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private static String homepageURL = "https://www.ab-in-den-urlaub.de/";

    //Page element locators and Id's

    @FindBy(how = How.CLASS_NAME, using = "item-hotel")
    private WebElement Hotelbutton;

    public void openpageurl() throws Exception {

        driver.get(homepageURL);
    }

    public void clickHotelButton() throws Exception {
        Thread.sleep(2000);
        Hotelbutton.click();
        System.out.println("Hotel button clicked");

    }


}



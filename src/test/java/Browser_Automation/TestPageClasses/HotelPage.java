package Browser_Automation.TestPageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ENTER;
import org.openqa.selenium.support.PageFactory;

import java.util.List;




public class HotelPage extends TestBase{

    WebDriver driver;

    public HotelPage(WebDriver driver) {
        this.driver = driver;
    }
    String destination="Madrid";


    //Page element locators and Id's

    @FindBy(how = How.ID, using = "base[searchTerm]")
    private WebElement DestinationTextField;

    @FindBy(how=How.XPATH, using ="//*[@id=\"hotel\"]/div[2]/div/div/div[3]/div[2]/div/div/div[2]/table/tbody/tr[6]/td[1]")
    private WebElement StartDate;

    @FindBy(how=How.XPATH, using="//*[@id=\"hotel\"]/div[2]/div/div/div[3]/div[2]/div/div/div[2]/table/tbody/tr[6]/td[5]")
    private WebElement EndDate;

    @FindBy(how=How.ID,using="submit")
    private WebElement SearchOffersButton;

    @FindBy(how=How.CLASS_NAME,using="datepicker-input-wrapper-start")
    private WebElement StartDatefield;

    @FindBy(how=How.CSS,using=".datepicker-input.datepicker-input-end")
    private WebElement EndDatefield;

    @FindBy(how=How.XPATH,using="//*[@id=\"hotel\"]/div[2]/div/div/div[3]/div[1]/span[2]")
    private WebElement NextMonth;



    public void ClickDestination() throws Exception {
        Thread.sleep(2000);
        DestinationTextField.click();
        DestinationTextField.sendKeys(destination);
        Thread.sleep(2000);
        DestinationTextField.sendKeys(ARROW_DOWN);
        DestinationTextField.sendKeys(ENTER);
    }


    public void ClickStartDate() throws Exception {
        StartDatefield.click();
        NextMonth.click();
        StartDate.click();
    }

    public void ClickEndDate() throws Exception {
        EndDate.click();
    }

    public void clickSearchOffers() throws Exception {
        SearchOffersButton.click();
    }


}

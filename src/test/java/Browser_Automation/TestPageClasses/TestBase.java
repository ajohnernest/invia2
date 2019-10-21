package Browser_Automation.TestPageClasses;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {

    public static WebDriver driver = null;

    @BeforeStories
    public void initialize() throws IOException{

        System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver.exe");
        driver = new ChromeDriver();
        //To maximize browser
        driver.manage().window().maximize();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterStories
    //Test cleanup
    public void TeardownTest()

    {
        //  TestBase.driver.quit();
    }

}
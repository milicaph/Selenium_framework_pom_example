package test.java;

import global.ObjectRepo;
import io.testproject.sdk.drivers.web.ChromeDriver;
import io.testproject.sdk.internal.exceptions.AgentConnectException;
import io.testproject.sdk.internal.exceptions.InvalidTokenException;
import io.testproject.sdk.internal.exceptions.ObsoleteVersionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.SeleniumUtilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public ChromeDriver driver;
    public WebDriverWait wait;
    @BeforeSuite
    public void beforeSuite() throws InvalidTokenException, AgentConnectException, ObsoleteVersionException, IOException {
        String baseDIRPath = System.getProperty("user.dir");
        String chromeDriverPath = baseDIRPath + "\\lib\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        //options.addArguments("--headless"); // headless mode
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model

        driver = new ChromeDriver(ObjectRepo.devToken, options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30);

    }

    @BeforeClass
    public void beforeCLass(){
        driver.get("https://staging.kollekt.dk/#/login/");
        System.out.println(driver.getCurrentUrl());
        driver.getTitle();

        //Sign In page validation
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, ObjectRepo.stagingLoginURL, "This is login page!" );
    }

    @AfterMethod
    public void afterTest(){
        System.out.println("Method is passing");
    }

    @AfterClass
    public void afterClass(){ driver.quit(); }

    public static void sleepTest(long sleeptime){
        try{Thread.sleep(sleeptime); } catch (Exception ignored){}
    }
}

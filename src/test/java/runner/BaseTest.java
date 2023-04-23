package runner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

//abstract class - can have abstract and non-abstract methods(with the body),it needs to be extended and its methods implemented.It cannot be called(instantiated).
//protected method - accessible within the same package, and be accessible outside the package through inheritance

public abstract class BaseTest {

    private WebDriver driver;

    @BeforeMethod
    protected void beforeMethod(){
         driver = new ChromeDriver();//basic chrome init
        driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    protected void afterMethod(){
        driver.quit();
    }
    protected WebDriver getDriver(){
        return driver;
    }
}

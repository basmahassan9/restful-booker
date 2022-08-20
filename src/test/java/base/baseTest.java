package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.homePage;

public class baseTest {
    public WebDriver driver;
    public homePage homePage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
        driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://automationintesting.online/");
        homePage = new homePage(driver);

    }
@Test
public void testBook(){
    homePage.clickBookingBTn();
    homePage.addFirstName("basma");
    homePage.addLastName("hassan");
    homePage.addemail("exampl@gmail.com");
    homePage.addPhone("012456555555578");
    homePage.chooseDate("27");
    homePage.clickBook();

}
    @AfterClass
    public void closeDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}

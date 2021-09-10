import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class MyhomeLogin {
    public static void main(String[] args) throws InterruptedException {

        // Locators
        By cookiePopUpLocator =  By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
        By logInDropDown = By.xpath("/html/body/app-root/div/header/app-header-container/app-desktop-header/div/nav/div[2]/div[1]");
        By loginLinkLocator = By.xpath("//*[@id=\"sel_sign_in_nav_link\"]/span");
        By loginUserNameInputLocator = By.xpath("//input[@type='email']");
        By loginPasswordInputLocator = By.xpath("//*[@id=\"sel_sign_in_password\"]");
        By loginButtonLocator = By.xpath("//*[@id=\"sel_sign_in_button\"]/span");

        // creating driver object
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);
        System.setProperty("webdriver.chrome.driver", currentDir + "\\src\\main\\resources\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //setting up url
        String baseUrl = "https://www.myhome.ie/";
        // launch chrome and execute the test steps
        driver.get(baseUrl);
        driver.findElement(cookiePopUpLocator).click();
        driver.findElement(logInDropDown).click();
        driver.findElement(loginLinkLocator).click();
       // driver.switchTo().frame("optanon-category-C0004");
        Thread.sleep(4000);
        driver.findElement(loginUserNameInputLocator).sendKeys("tipugo@yahoo.com");
        driver.findElement(loginPasswordInputLocator).sendKeys("Dublin6054#");
        driver.findElement(loginButtonLocator).click();
        //driver.switchTo().defaultContent();

        // get the actual value of the title
        String actualTitle = driver.getTitle();
        System.out.println("actual title is: " + actualTitle);
        String expectedTitle = "Account Login - MyHome.ie";
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        // sleeping the execution for 4000 milly sec
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //close chrome
       // driver.close();
    }
}

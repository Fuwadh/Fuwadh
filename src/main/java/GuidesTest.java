import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class GuidesTest {
    public static void main(String[] args) throws InterruptedException {

        // Locators
        By cookiePopUpLocator =  By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
        By guides = By.xpath("//*[@id=\"sel_tab_guides\"]");
        By countyRegion = By.xpath("//*[@id=\"sel_region_dropdown\"]");
        By searchRegion = By.xpath("//*[@id=\"sel_region_dropdown\"]/div/div/div[1]/input");
        By dublinWest = By.xpath("//*[@id=\"sel_region_dropdown\"]/div/div/div[2]/div");
        By areasDropDown = By.xpath("//*[@id=\"sel_locality_dropdown\"]");
        By searchAreas = By.xpath("//*[@id=\"sel_locality_dropdown\"]/div/div/div[1]/input");
        By blanchardstown = By.xpath("//*[@id=\"sel_locality_dropdown\"]/div/div/div[2]/div");
        By search = By.xpath("//*[@id=\"sel_search_button\"]/span");




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
        driver.findElement(guides).click();
        Thread.sleep(2000);
        driver.findElement(countyRegion).click();
        driver.findElement(searchRegion).sendKeys("Dublin west");
        driver.findElement(dublinWest).click();
        Thread.sleep(2000);
        driver.findElement(areasDropDown).click();
        driver.findElement(searchAreas).sendKeys("Blanchardstown");
        driver.findElement(blanchardstown).click();
        driver.findElement(search).click();






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




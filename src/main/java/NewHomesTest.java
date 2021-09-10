import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class NewHomesTest {
    public static void main(String[] args) throws InterruptedException {

        // Locators
        By cookiePopUpLocator =  By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
        By newHomes = By.xpath("//*[@id=\"sel_tab_new_homes\"]");
        By countyRegion = By.xpath("//*[@id=\"sel_region_dropdown\"]/span[1]");
        By searchArea = By.xpath("//*[@id=\"sel_region_dropdown\"]/div/div/div[1]/input");
        By cork  = By.xpath("//*[@id=\"sel_region_dropdown\"]/div/div/div[2]/div[1]");
        By areas = By.xpath("//*[@id=\"sel_locality_dropdown\"]");
        By searchAreas = By.xpath("//*[@id=\"searchInput\"]");
        By corkCity = By.xpath("//*[@id=\"sel_locality_dropdown\"]/div[1]/div/div[2]/div[1]/div[2]/div/app-mh-check-box/div/div[2]");
        By done = By.xpath("//*[@id=\"sel_locality_dropdown\"]/div[1]/div/div[1]/app-mh-button[2]/button/span");
        By maxPrice = By.xpath("//*[@id=\"sel_max_price_dropdown\"]");
        By maxPrice500000 = By.xpath("//*[@id=\"sel_max_price_dropdown\"]/div/div/div/div[21]");
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
        driver.findElement(newHomes).click();
        Thread.sleep(2000);
        driver.findElement(countyRegion).click();
        driver.findElement(searchArea).sendKeys("Cork");
        driver.findElement(cork).click();
        Thread.sleep(2000);
        driver.findElement(areas).click();
        driver.findElement(searchAreas).sendKeys("Cork city");
        driver.findElement(corkCity).click();
        driver.findElement(done).click();
        driver.findElement(maxPrice).click();
        driver.findElement(maxPrice500000).click();
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



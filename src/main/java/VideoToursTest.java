import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

    public class VideoToursTest {
    public static void main(String[] args) {
        // creating driver object
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);
        System.setProperty("webdriver.chrome.driver", currentDir + "\\src\\main\\resources\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // don't touch the code above this line.

        // Locators
        By acceptAll =  By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
        By videoTourTest = By.xpath("//*[@id=\"sel_tab_video_tours\"]");
        By countyRegion = By.xpath("//*[@id=\"sel_region_dropdown\"]");
        By searchCounty = By.xpath("//*[@id=\"sel_region_dropdown\"]/div/div/div[1]/input");
        By cavan = By.xpath("//*[@id=\"sel_region_dropdown\"]/div/div/div[2]/div");
        By areas = By.xpath("//*[@id=\"sel_locality_dropdown\"]");
        By searchAreas = By.xpath("//*[@id=\"searchInput\"]");
        By bailie = By.xpath("//*[@id=\"sel_locality_dropdown\"]/div[1]/div/div[2]/div/div[2]/div/app-mh-check-box/div/div[2]");
        By Done = By.xpath("//*[@id=\"sel_locality_dropdown\"]/div[1]/div/div[1]/app-mh-button[2]/button/span");
        By maxPrice = By.xpath("//*[@id=\"sel_max_price_dropdown\"]");
        By price = By.xpath("//*[@id=\"sel_max_price_dropdown\"]/div/div/div/div[21]");
        By type = By.xpath("//*[@id=\"sel_property_type_dropdown\"]");
        By propertyType = By.xpath("//*[@id=\"sel_property_type_dropdown\"]/div/div/div[2]/div[3]/app-mh-check-box/div/div[2]");
        By done = By.xpath("//*[@id=\"sel_property_type_dropdown\"]/div/div/div[1]/div[1]/app-mh-button[2]/button/span");
        By search = By.xpath("//*[@id=\"sel_search_button\"]/span");


        try {
            // launch chrome and go to url
            driver.get("https://myhome.ie");
            driver.findElement(acceptAll).click();
            driver.findElement(videoTourTest).click();
            Thread.sleep(2000);
            driver.findElement(countyRegion).click();
           driver.findElement(searchCounty).sendKeys("Cavan");
           driver.findElement(cavan).click();
           Thread.sleep(2000);
           driver.findElement(areas).click();
           driver.findElement(searchAreas).sendKeys("Bailie");
           driver.findElement(bailie).click();
           driver.findElement(Done).click();
           Thread.sleep(2000);
           driver.findElement(maxPrice).click();
           driver.findElement(price).click();
           driver.findElement(type).click();
           driver.findElement(propertyType).click();
           driver.findElement(done).click();
           driver.findElement(search).click();




            // Don't touch the code below this line
            System.out.println("Your Test Passed");
            // sleeping the execution for 4000 milly sec

        }
        catch (Exception e) {
            System.out.println("Your Test Failed");
        }
        //close chrome
        //driver.close();
    }
}



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

    public class BuyPropertyTest {
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
            //By buy = By.xpath("//*[@id=\"sel_tab_residential\"]");
            By countyRegionDropDown = By.xpath("//*[@id=\"sel_region_dropdown\"]");
            By Search = By.xpath("//*[@id=\"sel_region_dropdown\"]/div/div/div[1]/input");
            By Carlow = By.xpath("//*[@id=\"sel_region_dropdown\"]/div/div/div[2]/div");
            By AreasDropdown = By.xpath("//*[@id=\"sel_locality_dropdown\"]");
            By SearchAreas = By.xpath("//*[@id=\"searchInput\"]");
            By searchLocalities = By.xpath("//*[@id=\"sel_locality_dropdown\"]/div[1]/div/div[2]/div/div[2]/div/app-mh-check-box/div/div[2]");
            By Done = By.xpath("//*[@id=\"sel_locality_dropdown\"]/div[1]/div/div[1]/app-mh-button[2]/button/span");
            By PriceDropdown = By.xpath("//*[@id=\"sel_max_price_dropdown\"]");
            By Price = By.xpath("//*[@id=\"sel_max_price_dropdown\"]/div/div/div/div[22]");
            By Type = By.xpath("//*[@id=\"sel_property_type_dropdown\"]");
            By Houses = By.xpath("//*[@id=\"sel_property_type_dropdown\"]/div/div/div[2]/div[3]/app-mh-check-box/div/div[2]");
            By Done2 = By.xpath("//*[@id=\"sel_property_type_dropdown\"]/div/div/div[1]/div[1]/app-mh-button[2]/button/span");
            By SearchProperty = By.xpath("//*[@id=\"sel_search_button\"]/span");


            try {
                // launch chrome and go to url
                driver.get("https://myhome.ie");
                driver.findElement(acceptAll).click();
                //driver.findElement(buy).click();
                driver.findElement(countyRegionDropDown).click();
                driver.findElement(Search).sendKeys("Carlow");
                driver.findElement(Carlow).click();
                Thread.sleep(4000);
                driver.findElement(AreasDropdown).click();
                driver.findElement(SearchAreas).sendKeys("Carl");
                driver.findElement(searchLocalities).click();
                driver.findElement(Done).click();
                Thread.sleep(4000);
                driver.findElement(PriceDropdown).click();
                driver.findElement(Price).click();
                Thread.sleep(3000);
                driver.findElement(Type).click();
                driver.findElement(Houses).click();
                driver.findElement(Done2).click();
                Thread.sleep(2000);
                driver.findElement(SearchProperty).click();

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


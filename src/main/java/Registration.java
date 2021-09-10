    import org.openqa.selenium.By;
    import org.openqa.selenium.chrome.ChromeDriver;
    import java.util.concurrent.TimeUnit;
    public class Registration {
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
        By loginDropdown = By.xpath("/html/body/app-root/div/header/app-header-container/app-desktop-header/div/nav/div[2]/div[1]");
        By signUp = By.xpath("//*[@id=\"sel_sign_up_nav_link\"]/span");
        By firstName = By.xpath("//*[@id=\"sel_sign_up_firstName\"]");
        By lastName = By.xpath("//*[@id=\"sel_sign_up_lastName\"]");
        By emailAddress = By.xpath("//*[@id=\"sel_sign_up_email\"]");
        By password = By.xpath("//*[@id=\"sel_sign_up_password\"]");
        By confirmPassword = By.xpath("//*[@id=\"sel_sign_up_confirm_password\"]");
        By termsAndCondition =By.xpath("/html/body/app-root/div/app-mh-sign-up/div/div/form/app-mh-check-box[2]/div/div[2]");
        By register = By.xpath("//*[@id=\"sel_sign_up_button\"]");

        try {
            // launch chrome and go to url
            driver.get("https://myhome.ie");
            driver.findElement(acceptAll).click();
            driver.findElement(loginDropdown).click();
            driver.findElement(signUp).click();
            driver.findElement(firstName).sendKeys("Fuwad");
            driver.findElement(lastName).sendKeys("Hasan");
            driver.findElement(emailAddress).sendKeys("fuwad28@yahoo.com");
            driver.findElement(password).sendKeys("Dublin6054#");
            driver.findElement(confirmPassword).sendKeys("Dublin6054#");
            driver.findElement(termsAndCondition).click();
            driver.findElement(register).click();


            // Don't touch the code below this line

            System.out.println("Your Test Passed");
            // sleeping the execution for 4000 milly sec
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        catch (Exception e) {
            System.out.println("Your Test Failed");
        }
        //close chrome
        //driver.close();
    }
}

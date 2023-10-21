import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Basic {
    public static String chromedriver = "webdriver.chrome.driver";
    public static String driverPath = "src/driver/chromedriver.exe";

    public static String passStatus = "Test Passed";
    public static String failStatus = "Test Failed";
    public static WebDriver driver;


    public static void waitforTime(int sec) throws InterruptedException {
        TimeUnit.SECONDS.sleep(sec);

    }

    public static void initializeWindow() {
        try {

            System.setProperty(chromedriver, driverPath);
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void launchURL(String webURL) {
        try {
            driver.get(webURL);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void assertTitle(String expectedMainTitle) {
        try {
            String actualTitle = Basic.driver.getTitle();

            if (actualTitle.equals(expectedMainTitle)) {
                System.out.println(passStatus + ":\t" +
                        expectedMainTitle);
            } else {
                System.out.println(failStatus + ":\t" +
                        expectedMainTitle);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void SendData(String xpath, String data) {
        try {

            WebElement usernameField = driver.findElement(By.xpath(xpath));
            usernameField.sendKeys(data);
            waitforTime(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void clickOnElement(String xpath){
        try {

            WebElement element = driver.findElement(By.xpath(xpath));
            element.click();
            waitforTime(2);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void getElementText(String textXpath){
        try {

            WebElement element = driver.findElement(By.xpath(textXpath));
            element.getText();
            System.out.println(element.getText());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void assertionOfText(String textXpath, String expectedData) {
        try {
            WebElement pageTitle = driver.findElement(By.xpath(textXpath));
            String actualPgTitle = pageTitle.getText();

            if (actualPgTitle.equals(expectedData)) {
                System.out.println(passStatus + ":\t" +
                        actualPgTitle);
            } else {
                System.out.println(failStatus + ":\t" +
                        actualPgTitle);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }




}

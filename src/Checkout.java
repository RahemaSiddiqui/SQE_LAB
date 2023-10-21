import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkout {

    public static String CartPageTitle= "//div[@id='header_container']/div[2]/span";
    public static String expectedCartPage = "Your Cart";

    public static String expectedPage = "Checkout: Overview";
    public static String expectedPagexpath = "//div[@id='header_container']/div[2]/span";
    public static String checkoutBtn = "//button[@id='checkout']";


    public static String expectedCheckoutInfo = "Checkout: Your Information";
    public static String expectedCheckoutInfoXpath = "//div[@id='header_container']/div[2]/span";

    public static String fnameXpath =  "//input[@id='first-name']";
    public static String fnameData =  "Rahema";

    public static String lastnameXpath = "//input[@id='last-name']";
    public static String lastnameData = "Siddiqui";

    public static String zipcodeXpath = "//input[@id='postal-code']";
    public static String zipcodeData = "3509";
    public static String continueBtn = "//input[@id='continue']";
    public static String finishBtn = "//button[@id='finish']";
    public static String msgXpath = "//div[@id='checkout_complete_container']/h2";
    public static String expectedMsg = "Thank you for your order!";
    public static String totalPrice = "//div[@id='checkout_summary_container']/div/div[2]/div[6]";


    Checkout(){
        Basic.assertionOfText(CartPageTitle, expectedCartPage);
        Basic.clickOnElement(checkoutBtn);

        Basic.assertionOfText(expectedCheckoutInfoXpath, expectedCheckoutInfo);
        Basic.SendData(fnameXpath, fnameData);
        Basic.SendData(lastnameXpath, lastnameData);
        Basic.SendData(zipcodeXpath, zipcodeData);
        Basic.clickOnElement(continueBtn);

        assertTotal(totalPrice, AddToCart.getSum());

        Basic.assertionOfText(expectedPagexpath, expectedPage);
//        Basic.getElementText(totalPrice);
        Basic.clickOnElement(finishBtn);

        Basic.assertionOfText(msgXpath, expectedMsg);


    }

    public static void assertTotal(String textXpath, double expectedData) {
        try {
            WebElement TotalPrice = Basic.driver.findElement(By.xpath(textXpath));
            String actualPrice = TotalPrice.getText().substring(13);
            double actualPriceValue = Double.parseDouble(actualPrice);

            if (actualPriceValue == expectedData) {
                System.out.println(Basic.passStatus + ":\t" +"Total Price: $"+
                        expectedData);
            } else {
                System.out.println(Basic.failStatus + ":\t" +"Total Price: $"+
                        expectedData);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

public class DriverFunction {
    public static String webURL = "https://www.saucedemo.com";

    public static void LaunchDriver(){

        try {
            Basic.initializeWindow();
            Basic.launchURL(webURL);
            System.out.println("\nDriver Launched Successfully...\n");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void CloseDriver(){
        try {
            Basic.driver.quit();
            System.out.println("\nDriver Closed Successfully\n");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

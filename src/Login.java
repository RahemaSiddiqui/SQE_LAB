public class Login {
    public static String userxpath = "//*[@id='user-name']";
    public static String passwordxpath = "//*[@id='password']";
    public static String userData = "standard_user";
    public static String passwordData = "secret_sauce";
    public static String loginxpath = "//*[@id='login-button']";
    public static String Pagetitle = "Swag Labs";


    Login(){
        Basic.SendData(userxpath, userData);
        Basic.SendData(passwordxpath, passwordData);
        Basic.clickOnElement(loginxpath);
        Basic.assertTitle(Pagetitle);

    }
}

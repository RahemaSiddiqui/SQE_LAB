public class Main {
    public static void main(String[] args) {
        try {

            DriverFunction.LaunchDriver();

            new Login();

            new Dashboard();

            new AddToCart();

            new Checkout();

            DriverFunction.CloseDriver();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
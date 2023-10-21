public class Dashboard {
    public static String ProductTitlexpath = "//span[@class='title']";
    public static String expectedProductTitle = "Products";

    Dashboard(){

        Basic.assertionOfText(ProductTitlexpath, expectedProductTitle);

    }

}

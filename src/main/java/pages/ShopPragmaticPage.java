package pages;

public class ShopPragmaticPage extends BasePage{
    private static final String SHOP_PRAGMATIC_PAGE_URL = "https://shop.pragmatic.bg/";

    public static void goToShopPragmaticPage() {
        driver.get(SHOP_PRAGMATIC_PAGE_URL);
    }
}
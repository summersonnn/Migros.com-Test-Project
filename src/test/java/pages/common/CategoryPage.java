package pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.Browser;

public class CategoryPage extends AbstractPage
{
    public CategoryPage(Browser browser)
    {
        super(browser);
    }

    @FindBy(className = "cookie-popup-dismiss")
    public WebElement cookieDismissButton;

    @FindBy(xpath = "//*[@id=\"page-area\"]/div/div/div[1]/div[1]/div/div[3]/ul/li/ul/li[1]/a/div/span[1]")
    public WebElement filterBrand;
    
    @FindBy(xpath = "//*[@id=\"page-area\"]/div/div/div[1]/div[1]/div/div[4]/ul/li/ul/li[6]/a/div/span[1]")
    public WebElement filterSize;
    
    @FindBy(linkText = "Önce En Yüksek Fiyat")
    public WebElement biggerFirst;
    
    @FindBy(className = "sort-label--others")
    public WebElement order;
    
    @FindBy(css = ".sub-category-product-list .list:nth-of-type(1) .product-card-button")
    public WebElement addBasket;
}



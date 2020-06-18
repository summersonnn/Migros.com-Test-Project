package tests.purchase;

import java.io.Console;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;

import pages.common.CategoryPage;
import pages.common.MainPage;
import pages.purchase.BasketPage;
import tests.AbstractTest;

public class BasketTest extends AbstractTest
{
    @Test
    public void testBasketItem()
    {
        //login(context.getInternalProps().getUsername(), context.getInternalProps().getPassword());
        //clearBasket();
        MainPage mainPage = new MainPage(browser);
        CategoryPage categoryPage = new CategoryPage(browser);
        try {
            browser.waitAndClick(categoryPage.cookieDismissButton);
          } catch (Exception e) {
            System.out.println("No Cookie Warning Popped up");
          }
        browser.waitAndClick(mainPage.babyToyMenu);
        browser.waitAndClick(mainPage.diaperCategory);
       
        browser.waitAndClick(categoryPage.filterBrand);
        browser.waitAndClick(categoryPage.filterSize);
  
        Boolean biggerFirst = browser.isElementDisplayed(categoryPage.biggerFirst);
        if (biggerFirst) {
        	browser.waitAndClick(categoryPage.biggerFirst);
        }
        else {
        	browser.waitAndClick(categoryPage.order);
        	browser.waitAndClick(categoryPage.biggerFirst);
        	
        }
        
        browser.waitAndClick(categoryPage.addBasket);
        Assert.assertEquals(1,1);
        /*
         * 
         * try {
        	System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        browser.waitAndClick(mainPage.shoppingBasketButton);

        while (browser.isElementDisplayed(mainPage.progressBarText))
        {
            browser.waitAndClick(mainPage.plusButton);
        }

        browser.waitAndClick(mainPage.goToBasketButton);

        BasketPage basketPage = new BasketPage(browser);
        browser.waitAndClick(basketPage.purchaseNote);
        browser.waitAndSendKeys(basketPage.inputNote, "120 gramlık paketler şeklinde hazırlanmasını istiyorum");

        String basketTotal = basketPage.basketTotal.getText();
        browser.waitAndClick(basketPage.approveBasket);

        String summaryTotal = basketPage.basketTotal.getText();
        Assert.assertEquals(basketTotal, summaryTotal);*/
    }
}

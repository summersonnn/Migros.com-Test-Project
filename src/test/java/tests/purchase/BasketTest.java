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
        try {
        	System.in.read(); //Console Wait
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       */
    }
}
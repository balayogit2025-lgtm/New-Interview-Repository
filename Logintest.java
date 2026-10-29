package Testcases;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.Loginpageobjects;

public class Logintest {

    WebDriver driver;

    @BeforeTest
    public void setup() {

        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();

        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");

        PageFactory.initElements(driver, Loginpageobjects.class);

        Loginpageobjects.username.sendKeys("standard_user");
        Loginpageobjects.password.sendKeys("secret_sauce");
        Loginpageobjects.loginbutton.click();

    }

    @Test(
        priority = 1,
        description = "Sort products by name from Z to A"
    )
    public void Testcase1() {

        Loginpageobjects.filterbutton.click();
        Loginpageobjects.filteroptiontwo.click();

        
    }

    @Test(
        priority = 2,
        description = "Sort products by price from high to low"
    )
    public void Testcase2() {

        Loginpageobjects.filterbutton.click();
        Loginpageobjects.filteroptionfour.click();

       
    }

    @Test(
        priority = 3,
        description = "Sort products by price from low to high"
    )
    public void Testcase3() {

        Loginpageobjects.filterbutton.click();
        Loginpageobjects.filteroptionthree.click();

        
    }

    @Test(
        priority = 4,
        description = "Add two products to the cart"
    )
    public void Testcase4() {

        Loginpageobjects.productone.click();
        Loginpageobjects.Producttwo.click();

      
    }

    @Test(
        priority = 5,
        description = "Remove a product from the cart"
    )
    public void Testcase5() {

        Loginpageobjects.productone.click();
        Loginpageobjects.removebutton.click();

        
    }

    @Test(
        priority = 6,
        description = "Open the shopping cart"
    )
    public void Testcase6() {

        Loginpageobjects.productone.click();
        Loginpageobjects.cartbutton.click();

        Assert.assertTrue(
            driver.getCurrentUrl().contains("cart.html"),
            "Shopping cart page did not open"
        );
    }

    @Test(
        priority = 7,
        description = "Open checkout information page"
    )
    public void Testcase7() {

        Loginpageobjects.productone.click();
        Loginpageobjects.cartbutton.click();
        Loginpageobjects.checkoutbutton.click();

        Assert.assertTrue(
            driver.getCurrentUrl().contains("checkout-step-one.html"),
            "Checkout information page did not open"
        );
    }

    @Test(priority = 8,description = "Enter checkout information and continue" )
    public void Testcase8() {

        Loginpageobjects.productone.click();
        Loginpageobjects.cartbutton.click();
        Loginpageobjects.checkoutbutton.click();
        Loginpageobjects.continuebutton.click();

    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}



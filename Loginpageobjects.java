package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpageobjects {

@FindBy (xpath ="//*[@id=\"user-name\"]")
public static WebElement username;

@FindBy (xpath = "//*[@id=\"password\"]")
public static WebElement password;

@FindBy (xpath = "//*[@id=\"login-button\"]")
public static WebElement loginbutton;

@FindBy (xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select")
public static WebElement filterbutton;

@FindBy (xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")
public static WebElement filteroptiontwo;

@FindBy (xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")
public static WebElement filteroptionthree;

@FindBy (xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")
public static WebElement filteroptionfour;

@FindBy (xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
public static WebElement productone;


@FindBy (xpath = "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
public static WebElement Producttwo;

@FindBy (xpath = "//*[@id=\"remove-sauce-labs-backpack\"]")
public static WebElement removebutton;


@FindBy (xpath = "//*[@id=\"shopping_cart_container\"]/a")
public static WebElement cartbutton;


@FindBy (xpath = "//*[@id=\"checkout\"]")
public static WebElement checkoutbutton;

@FindBy (xpath = "//*[@id=\"continue\"]")
public static WebElement continuebutton;



}

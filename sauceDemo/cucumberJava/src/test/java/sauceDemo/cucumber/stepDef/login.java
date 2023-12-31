package sauceDemo.cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

public class login {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";

    @Given("Halaman login saucedemo")
    public void halamanLoginSaucedemo() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @When("Input username")
    public void inputUsername() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
    }

    @And("Input password")
    public void inputPassword() throws InterruptedException {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
    }

    @And("click login button")
    public void clickLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(1000);
    }

    @And("User click add to cart")
    public void userClickAddToCart() throws InterruptedException {
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        Thread.sleep(1000);
    }

    @And("User view card page")
    public void userViewCardPage() throws InterruptedException  {
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
        Thread.sleep(1000);
    }

    @And("User checkout")
    public void userCheckout() throws InterruptedException {
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        //quit
        driver.close();
    }

//    @Then("user in dashboard page")
//    public void userInDashboardPage() {
//    }

//    @And("Input Invalid password")
//    public void inputInvalidPassword() {
//        driver.findElement(By.id("password")).sendKeys("secret_sauceee");
//    }

//    @Then("User get error message")
//    public void userGetErrorMessage() {
//        String errorLogin = driver.findElement(By.xpath("//div[@role='img']")).getText();
//        Assert.assertEquals(errorLogin, "Epic sadface: Username and password do not match any user in this service");
//    }


}

package sauceDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    @Test
    public void success_login(){
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        //membuka halaman login
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        //input email
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //input password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click login
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        //quit
        driver.close();

    }
}

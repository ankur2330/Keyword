package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionKeywords {

    public static WebDriver driver = null;

    public static void openBrowser(){
            driver = new FirefoxDriver();

    }

    public static void navigate(){
        driver.get("http://www.store.demoqa.com");
    }


    public static void click_Myaccount(){
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();

    }

    public static void input_Username(){
        driver.findElement(By.id("log")).sendKeys("Testuser");

    }

    public static void input_Password(){
        driver.findElement(By.id("pwd")).sendKeys("Test@123");

    }

    public static void clik_Login(){
        driver.findElement(By.id("login")).click();
    }

    public static void closeBrowser(){
        driver.quit();
    }


}

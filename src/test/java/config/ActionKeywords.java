package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionKeywords {

    public static WebDriver driver;

    public static void openBrowser(String object){
            driver = new FirefoxDriver();
    }
    public static void navigate(String Object){
      driver.get(Constants.URL);
   }
    public static void click(String object){
        driver.findElement(OR.getProperty(object)).click();
    }
    public static void input_Username(String Object){
        driver.findElement(By.id("log")).sendKeys(Constants.UserName);
    }
    public static void input_Password(String Object){
        driver.findElement(By.id("pwd")).sendKeys(Constants.Password);
    }
    public static void click_Login(String Object){

        driver.findElement(By.id("login")).click();
    }
    public static void closeBrowser(String Object){
        driver.quit();
    }


}

package executionEngine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript {

    public static WebDriver driver = null;

    public static void main(String args[]){
        System.setProperty("webdriver.gecko.driver","/home/ankur/Downloads/idea-IC-181.4203.550/geckodriver");

        driver = new FirefoxDriver();
        driver.get("http://www.store.demoqa.com");

        driver.findElement(By.xpath("/html/body/div[2]/div/div/header/div[2]/a")).click();

        driver.findElement(By.id("log")).sendKeys("Testuser123");

        driver.findElement(By.id("pwd")).sendKeys("Test@123");

        driver.findElement(By.id("login")).click();

        driver.quit();



    }
}

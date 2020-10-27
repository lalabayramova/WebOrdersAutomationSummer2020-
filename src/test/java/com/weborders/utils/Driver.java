package com.weborders.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.layout.BackgroundRepeat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver;
    private Driver(){}

   public static WebDriver getDriver() {
       if (driver == null) {
           String browser = "chrome";
           switch (browser) {
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver = new ChromeDriver();
                   break;
               case "firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driver = new FirefoxDriver();
                   break;
               default:
                   throw new RuntimeException("Browser is not implemented yet: " + browser);
           }
       }
       return  driver;
   }

}

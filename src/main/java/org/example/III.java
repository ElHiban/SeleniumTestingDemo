package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class III {
    static WebDriver driver = new FirefoxDriver();
    static String baseUrl = "https://the-internet.herokuapp.com/";
    public static void main(String[] args) {
        //Open url
        driver.get(baseUrl);
        //Change selected option
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("ivan");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.className("radius")).click();
        //close Fire fox
        //driver.close();
    }
}

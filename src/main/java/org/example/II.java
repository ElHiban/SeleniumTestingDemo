package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class II {

    static WebDriver driver = new FirefoxDriver();
    static String baseUrl = "https://the-internet.herokuapp.com/";
    static String dropdownValue = "1";
    public static void main(String[] args) {
        //Open url
        driver.get(baseUrl);
        //Change selected option
        driver.findElement(By.linkText("Dropdown")).click();
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        dropdown.selectByValue(dropdownValue);
        //Get the selected option
        dropdown = new Select(driver.findElement(By.id("dropdown")));
        WebElement option = dropdown.getFirstSelectedOption();
        System.out.println(option.getText());
        //close Fire fox
        //driver.close();
    }
}

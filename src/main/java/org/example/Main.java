package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static WebDriver driver = new ChromeDriver();
    static String searchText = "youtube";
    static String searchLink = "https://www.youtube.com/?hl=ES";

    public static void main(String[] args) {

        searchOnGoogle(searchText);
        if(googleSearchSelectListOption(searchLink)){
            youtubeCookies();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"search\"]")).isEnabled());
        driver.findElement(By.id("search")).clear();
        driver.findElement(By.id("search")).sendKeys("ayuda");
        //driver.findElement(By.id("search")).submit();

        //System.out.println(element.getAttribute("href"));
        // get the actual value of the title
        //actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        */
        //close Fire fox
        //driver.close();
    }

    private static void searchOnGoogle(String textToSearch){
        //Url to open
        String baseUrl = "https://www.google.com";
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        //Cookies action
        driver.findElement(By.id("W0wltc")).click();//Reject
        //driver.findElement(By.id("L2AGLb")).click();//Accept
        //Search on Google search bar
        driver.findElement(By.id("APjFqb")).sendKeys(textToSearch);
        driver.findElement(By.id("APjFqb")).submit();
    }

    private static boolean googleSearchSelectListOption(String linkToSearch){

        //Needs to sleep or it does not get any class ¿?
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        List<WebElement> resultLinks = new ArrayList<WebElement>();
        List<WebElement> resultEntries = driver.findElements(By.className("yuRUbf"));

        for (WebElement element: resultEntries) {
            // get first a tag of the div
            resultLinks.add(element.findElement(By.tagName("a")));
        }

        for (WebElement element: resultLinks){
            if(element.getAttribute("href").equals(linkToSearch)){
                element.click();
                return true;
            }
        }
        return false;
    }

    private static void youtubeCookies(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[1]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")).click();

    }
}
package CSS_XPATH;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FlorVII {
    static WebDriver driver = new ChromeDriver();
    static String baseUrl = "https://the-internet.herokuapp.com/";

    //Click js alert
    // -> click js alert btn, click ok, get txt rslt
    // -> click js conf, click cancel, get txt rslt
    // -> click js prompt, click and input txt, click ok, get txt rslt
    // -> verify all txt rslt

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        //Open url
        driver.manage().window().maximize();
        driver.get(baseUrl);
        //Change selected option
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[29]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        String text = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
        System.out.println(text);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
        alert.dismiss();
        text = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
        System.out.println(text);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
        alert.sendKeys("hola");
        alert.accept();
        text = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
        System.out.println(text);
    }
    /*

     */
}

package CSS_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlorVI {
    //Dynamic Loading -> Example 2 and right click -> open in new tab -> go to it
    // -> verify there is the Start button
    static WebDriver driver = new ChromeDriver();
    static String baseUrl = "https://the-internet.herokuapp.com/";

    public static void main(String[] args) {
        //Open url
        driver.get(baseUrl);
        //Change selected option
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[14]/a")).click();
        String parentWindow = driver.getWindowHandle();
        WebElement link = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[2]"));
        new Actions(driver).keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
        for(String window:driver.getWindowHandles()) {
            if(!parentWindow.equalsIgnoreCase(window)) {
                driver.switchTo().window(window);
                //driver.get("http://demo.automationtesting.in/Alerts.html");
            }
        }
        System.out.println(driver.findElement(By.xpath("//*[@id=\"start\"]/button")).isDisplayed());
        //driver.findElement(By.cssSelector(".context-menu-icon-copy"));
        //driver.close();
    }
}

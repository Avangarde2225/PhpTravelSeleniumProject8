import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartII {
//    Navigate to https://www.phptravels.net/en
//    Click on any featured tours
//    Change the booking options
//    Click on the book now button
//    sum the (subtotal + tax + deposit)
public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\suler\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.expedia.com/");
    driver.manage().window().maximize();

   WebElement h3 = driver.findElement(By.xpath("//h3[text()='Europe']"));
   ((JavascriptExecutor) driver).executeScript( "arguments[0].scrollIntoView(true);", h3 );



    }

}

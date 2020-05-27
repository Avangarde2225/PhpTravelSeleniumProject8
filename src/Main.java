import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    /*
    Navigate to https://www.phptravels.net/en	phpTraverlers home page should be displayed
Click on language dropdown 	Dropdown should be expand and different language options should be displayed
Click on each language and verify language is changed in the website 	Language of the website should be changed

     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suler\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.phptravels.net/en");

        driver.manage().window().maximize();


    }
}

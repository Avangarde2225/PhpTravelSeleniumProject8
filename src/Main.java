import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {

    /*
    Navigate to https://www.phptravels.net/en
    phpTraverlers home page should be displayed
    Click on language dropdown
    Dropdown should be expand and different language options should be displayed
    Click on each language and verify language is changed in the website
    Language of the website should be changed

     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suler\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.phptravels.net/en");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@id='dropdownLangauge']")).click();

        int size = driver.findElements(By.xpath("//a[@class='dropdown-item']")).size();
        //System.out.println("There are " + size + " languages");


        for (int i = 0; i <size ; i++) {

            List<WebElement> languages = driver.findElements(By.xpath("//a[@class='dropdown-item']"));

            //String myLanguage = languages.get( i ).getText();

            languages.get(i).click();

//            if(languages.get(i).getText().equalsIgnoreCase("English")) {
//                System.out.println(languages.get(i).getText());
//            }
            String langUrl = driver.getCurrentUrl();

            System.out.println(langUrl);

            driver.findElement(By.xpath("//a[@id='dropdownLangauge']")).click();

        }


    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

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

            String myLanguage = languages.get( i ).getText();

            languages.get(i).click();

//            if(languages.get(i).getText().equalsIgnoreCase("English")) {
//                System.out.println(languages.get(i).getText());
//            }
            String langUrl = driver.getCurrentUrl();

            System.out.println(langUrl);

            driver.findElement(By.xpath("//a[@id='dropdownLangauge']")).click();

            Main newMain = new Main();
            newMain.checkUrl(langUrl, myLanguage);
        }



    }
    public void checkUrl(String url, String language){
        if(language.equalsIgnoreCase("Russian")){
            Assert.assertTrue(url.contains("/ru"));
        } else if(language.equalsIgnoreCase("Farsi")){
            Assert.assertTrue( url.contains( "/fa" ) );
        }
        else if(language.equalsIgnoreCase("Vietnamese")){
            Assert.assertTrue(url.contains("vi"));
        }
        else if(language.equalsIgnoreCase("French")){
            Assert.assertTrue(url.contains("fr"));
        }
        else if(language.equalsIgnoreCase("Turkish")){
            Assert.assertTrue(url.contains("tr"));
        }
        else if(language.equalsIgnoreCase("Arabic")){
            Assert.assertTrue(url.contains("ar"));
        }
        else if(language.equalsIgnoreCase("Spanish")){
            Assert.assertTrue(url.contains("es"));
        }
        else if(language.equalsIgnoreCase("English")){
            Assert.assertTrue(url.contains("en"));

        }
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class July23_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\canga\\Documents\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.applitools.com/");

        driver.manage().window().maximize();

        WebElement usernameBox = driver.findElement(By.cssSelector("input[id^='user']"));
        usernameBox.sendKeys("ttechno@gmail.com");

        /*WebElement passBox = driver.findElement(By.id("password"));
        passBox.sendKeys("techno123.");

        WebElement signInBox = driver.findElement(By.id("log-in"));
        signInBox.click();

        WebElement redText = driver.findElement(By.id("time"));
        String redTextRead = redText.getText();
        System.out.println(redTextRead);
        String currentURL = driver.getCurrentUrl();
        System.out.println("URL:"+currentURL);*/
        //driver.quit();

    }
}

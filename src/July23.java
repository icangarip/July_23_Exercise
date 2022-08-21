import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class July23 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Can\\Documents\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("Automation");

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("Testing@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Testing Current Address");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Testing Permanent Address");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        WebElement printName = driver.findElement(By.id("name"));
        String printString = printName.getText();

        System.out.println(printString.substring(5));

        WebElement printEmail = driver.findElement(By.id("email"));
        String email = printEmail.getText();

        System.out.println(email.substring(6));

        WebElement printCurrent = driver.findElement(By.cssSelector("#currentAddress.mb-1"));
        String current = printCurrent.getText();

        System.out.println(current);


        WebElement printPerm = driver.findElement(By.cssSelector("#permanentAddress.mb-1:"));
        String perm = printPerm.getText();

        System.out.println();

    }
}

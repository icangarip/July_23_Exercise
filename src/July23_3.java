import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class July23_3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\canga\\Documents\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.snapdeal.com/");
        Thread.sleep(5000);

        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement searchBox = driver.findElement(By.id("inputValEnter"));
        searchBox.sendKeys("teddy bear");

        //searchTextSpan

        WebElement searchClickBox = driver.findElement(By.className("searchTextSpan"));
        searchClickBox.click();
        Thread.sleep(5000);

        WebElement searchCountLocator = driver.findElement(By.cssSelector("#searchMessageContainer>div>span"));
        String searchCountText =  searchCountLocator.getText();
        System.out.println("searchCountText = " + searchCountText);
        Thread.sleep(5000);

        String currentURL = driver.getCurrentUrl();
        System.out.println("URL:"+currentURL);
        Thread.sleep(5000);

        WebElement logo = driver.findElement(By.cssSelector(".notIeLogoHeader.aspectRatioEqual.sdLogo.cur-pointer"));
        logo.click();
        Thread.sleep(5000);


        String currentURL2 = driver.getCurrentUrl();
        System.out.println("URL:"+currentURL2);

        driver.navigate().back();
        Thread.sleep(5000);


        WebElement searchBoxSecond = driver.findElement(By.id("inputValEnter"));
        String actualResult = searchBoxSecond.getAttribute("value");
        Thread.sleep(5000);


        System.out.println("Search box: "+actualResult);

    }
}

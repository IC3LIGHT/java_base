import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_test {

    @Test
    public void TestSearch() {
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.google.com/?hl=RU");
        WebElement search = browser.findElement(By.name("q"));
        search.sendKeys("ChromeDriver");
        search.submit();


    }




}

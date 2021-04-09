import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AppRater {
    public static void main(String[] args){
        System.setProperty("webdriver.edge.driver","msedgedriver.exe//");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize(); driver.get("https://apprater.net/add/");
        WebElement YourName =  driver.findElement(new By.ByName("user-submitted-name"));YourName.sendKeys("Lucas Ocampo");
        WebElement EmailAddress = driver.findElement(new By.ByName("user-submitted-email"));EmailAddress.sendKeys("lucasocampo@gmail.com");
        WebElement ProductTitle = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/article/div/div/form/fieldset[1]/input"));ProductTitle.sendKeys("SrChallenge");
        WebElement ProductUrl = driver.findElement(new By.ByName("user-submitted-url[]"));ProductUrl.sendKeys("www.srchallenge.com");
        WebElement ProductDescription = driver.findElement(new By.ByCssSelector("textarea.usp-textarea"));ProductDescription.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque magna erat, imperdiet sit amet consequat nec");
        //driver.close();
    }
}

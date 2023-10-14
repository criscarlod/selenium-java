import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstScript {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));


        WebElement makeAppointmentButton = driver.findElement(By.cssSelector("#btn-make-appointment"));
        makeAppointmentButton.click();
        // Login Page
        WebElement userNameInputField = driver.findElement(By.cssSelector("#txt-username"));
        userNameInputField.sendKeys("John Doe");
        WebElement passwordInputField = driver.findElement(By.cssSelector("#txt-password"));
        passwordInputField.sendKeys("ThisIsNotAPassword");
        WebElement logInButton = driver.findElement(By.cssSelector("#btn-login"));
        logInButton.click();

        //WebElement message = driver.findElement(By.id("message"));
        //message.getText();

        //driver.quit();
    }
}

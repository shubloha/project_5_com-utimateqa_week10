/**
 * Project-5 - ProjectName : com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */
package browsingtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open the URL into Browser
        driver.get(baseUrl);

        //Maximise the Browser window
        driver.manage().window().maximize();


        //We give Implicit Wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the title of the page.
        String title = driver.getTitle();
        //Print the current url.
        String currentUrl =driver.getCurrentUrl();
        System.out.println(currentUrl);
        //Print the page source
        System.out.println("The source code are : "+ driver.getPageSource());
        //Click on ‘Sign In’ link
        driver.findElement(By.linkText("Sign In")).click();
        //Print the current url
        System.out.println("The current Url is : "+driver.getCurrentUrl());
        //Enter the email to email field.
        driver.findElement(By.name("user[email]")).sendKeys("123abc@gmail.com");
        // Enter the password to password field.
        driver.findElement(By.id("user[password]")).sendKeys("123Shree");
        //Click on Login Button
        driver.findElement(By.className("g-recaptcha")).click();

//        //Navigate to baseUrl.
//        driver.get(baseUrl);
//        //Navigate forward to Homepage.
//        driver.navigate().forward();
//       // Navigate back to baseUrl
//        driver.navigate().back();
//        //Refresh the page.
//        driver.navigate().refresh();
//        //Close the browser
//        driver.close();

    }
}

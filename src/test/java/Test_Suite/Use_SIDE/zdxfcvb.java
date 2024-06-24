package Test_Suite.Use_SIDE;

import Setup_The_Browsers.Setupbrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import static Setup_The_Browsers.Setupbrowser.driver;

public class zdxfcvb {
    @Test ( priority = 1 )
    void SetupBrowserTest() throws IOException, InterruptedException {
        Setupbrowser loginTest = new Setupbrowser();
        loginTest.Setup_browser();
        loginTest.Setupbrowse();
    }

    @Test ( priority = 2 )
    void Shift() throws InterruptedException, IOException {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/a[2]")).click();
    }

    @Test ( priority = 3 )
    void loging() throws InterruptedException, IOException {
        org.yaml.snakeyaml.Yaml yaml = new org.yaml.snakeyaml.Yaml();  // Fully qualified name
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("userData.yaml");
        if (inputStream == null) {
            throw new IOException("src/test/resources/userData.yaml");
        }
        Map<String, List<Map<String, String>>> data = yaml.load(inputStream);

        // Assuming you want to use the first user from the YAML file
        Map<String, String> userData = data.get("log").get(0);

        // Email
        driver.findElement(By.id("email")).sendKeys(userData.get("email"));

        // Password
        driver.findElement(By.id("password")).sendKeys(userData.get("password"));
    }

    @Test ( priority = 4 )
    void Loging() throws InterruptedException, IOException {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/button")).click();
    }

    @Test ( priority = 5 )
    void Event() throws InterruptedException, IOException {
        driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]")).click();

        driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/ul/li[1]/a")).click();

    }

    @Test ( priority = 6 )
    void Explore_Folder() throws InterruptedException, IOException {
        Thread.sleep(10000);
        WebElement imageElement = driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div/div/div[2]/a"));
        // Create Actions instance
        Actions actions = new Actions(driver);
        // Double click on the image element
        actions.doubleClick(imageElement).perform();


    }

    @Test ( priority = 7 )
    void Explore_image_Printed_only() throws InterruptedException, IOException {
        Thread.sleep(10000);
        driver.findElement(By.id("cartBtn")).click();
        //Add to cart
        //preference:
        Thread.sleep(10000);
        driver.findElement(By.id("options")).click();
        Thread.sleep(10000);
        //Choose a size:
        driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/div[1]/div[2]/select/option[2]")).click();
        Thread.sleep(10000);
        //Choose a size:
        driver.findElement(By.xpath("/html/body/div[5]/div/div[6]/button[3]")).click();
    }
}
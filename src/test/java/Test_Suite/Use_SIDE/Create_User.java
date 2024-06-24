package Test_Suite.Use_SIDE;

import org.yaml.snakeyaml.Yaml;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import Setup_The_Browsers.Setupbrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import static Setup_The_Browsers.Setupbrowser.driver;

public class Create_User {

    @Test (priority = 1)
    void SetupBrowserTest() throws IOException, InterruptedException {
        Setupbrowser loginTest = new Setupbrowser();
        loginTest.Setup_browser();
        loginTest.Setupbrowse();
    }

    @Test(priority = 2)
    void Logingdata() throws IOException, InterruptedException {
        driver.findElement(By.xpath("/html/body/header/div/a[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/button[1]")).click();
    }

    @Test(priority = 3)
    void createUser() throws IOException, InterruptedException {
        // Load YAML file
        org.yaml.snakeyaml.Yaml yaml = new org.yaml.snakeyaml.Yaml();  // Fully qualified name
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("userData.yaml");
        if (inputStream == null) {
            throw new IOException("src/test/resources/userData.yaml");
        }
        Map<String, List<Map<String, String>>> data = yaml.load(inputStream);

        // Assuming you want to use the first user from the YAML file
        Map<String, String> userData = data.get("users").get(0);

        // Name
        driver.findElement(By.id("name")).sendKeys(userData.get("name"));
        // Email
        driver.findElement(By.id("email")).sendKeys(userData.get("email"));
        // Mobile
        driver.findElement(By.id("mobile")).sendKeys(userData.get("mobile"));
        // NIC
        driver.findElement(By.id("nic")).sendKeys(userData.get("nic"));
        // Password
        driver.findElement(By.id("password")).sendKeys(userData.get("password"));
        // Confirm Password
        driver.findElement(By.id("password_confirmation")).sendKeys(userData.get("password"));
        // Admission No
        driver.findElement(By.id("admission_no")).sendKeys(userData.get("admission_no"));
    }
    @Test(priority = 4)
    void Last_steps() throws IOException, InterruptedException {
        driver.findElement(By.id("school")).click();


        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[8]/select/option[2]")).click();


        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[10]/button")).click();



    }
}

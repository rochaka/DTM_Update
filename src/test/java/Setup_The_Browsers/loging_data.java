package Setup_The_Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static Setup_The_Browsers.Setupbrowser.driver;

public class loging_data {
    @Test
    public void loging() throws InterruptedException, IOException {
        org.yaml.snakeyaml.Yaml yaml = new org.yaml.snakeyaml.Yaml();  // Fully qualified name
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("userData.yaml");
        if (inputStream == null) {
            throw new IOException("userData.yaml");
        }
        Map<String, List<Map<String, String>>> data = yaml.load(inputStream);

        // Assuming you want to use the first user from the YAML file
        Map<String, String> userData = data.get("ADMIN").get(0);

        driver.findElement(By.xpath("//*[@id=\"header\"]/div/a[2]")).click();


        driver.findElement(By.id("email")).sendKeys(userData.get("email"));
        driver.findElement(By.id("password")).sendKeys(userData.get("password"));
        Thread.sleep(1000);


        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/button")).click();
    }

    public void loging_data() {
    }
}

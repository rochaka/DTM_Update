package ALL;

import Setup_The_Browsers.Setupbrowser;
import Setup_The_Browsers.loging_data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Setup_The_Browsers.Setupbrowser.driver;

public class Create_folder {



    @Test ( priority = 1 )
    void SetupBrowserTest() throws IOException, InterruptedException {
        Setupbrowser loginTest = new Setupbrowser();
        loginTest.Setup_browser();
        loginTest.Setupbrowse();
    }
    @Test ( priority = 2 )
    void Logingdata() throws IOException, InterruptedException {
        loging_data loginTest = new loging_data();
        loginTest.loging_data();
        loginTest.loging();
    }
    @Test ( priority = 3 )
    void Create() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/nav[1]/a[5]")).click();
    }

    @Test ( priority =4 )
    void right() throws IOException, InterruptedException {
        WebElement element = driver.findElement(By.id("workspace"));

        // Create an instance of Actions class
        Actions action = new Actions(driver);
        Thread.sleep(2000);

        // Perform context click (right-click) on the element
        action.contextClick(element).perform();
        Thread.sleep(2000);
    }


    @Test ( priority = 5 )
    void folder() throws IOException, InterruptedException {
        String filePath = "Data_file"; // Replace with the path to your userdata.txt file

        // Read data from the file and store it in a list

        // Read data from the file and store it in a list
        List<String> userData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while (( line = reader.readLine() ) != null) {
            userData.add(line);
        }
        reader.close();
        driver.findElement(By.id("menu-item-0")).click();
        driver.findElement(By.id("folder_name")).sendKeys(userData.get(1));
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div[2]/div[2]/button[1]")).click();


    }



}

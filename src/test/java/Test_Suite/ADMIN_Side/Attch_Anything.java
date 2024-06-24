package Test_Suite.ADMIN_Side;

import Setup_The_Browsers.Setupbrowser;
import Setup_The_Browsers.loging_data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Setup_The_Browsers.Setupbrowser.driver;

public class Attch_Anything {
    @Test (priority = 1)
    void SetupBrowserTest() throws IOException, InterruptedException {
        Setupbrowser loginTest = new Setupbrowser();
        loginTest.Setup_browser();
        loginTest.Setupbrowse();
    }

    @Test(priority = 2)
    void Logingdata() throws IOException, InterruptedException {
        loging_data loginTest = new loging_data();
        loginTest.loging_data();
        loginTest.loging();
    }

    @Test(priority = 3)
    void Create() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/nav[1]/a[5]")).click();
    }

    @Test(priority = 4)
    void right() throws IOException, InterruptedException {
        WebElement element = driver.findElement(By.id("workspace"));

        // Create an instance of Actions class
        Actions action = new Actions(driver);
        Thread.sleep(2000);

        // Perform context click (right-click) on the element
        action.contextClick(element).perform();
        Thread.sleep(2000);
    }

    //@Test(priority = 5)
    //void folder() throws IOException, InterruptedException {
        //String filePath = "Data_file"; // Replace with the path to your userdata.txt file

        // Read data from the file and store it in a list
        //List<String> userData = new ArrayList<>();
        //BufferedReader reader = new BufferedReader(new FileReader(filePath));
       // String line;
        //while (( line = reader.readLine() ) != null) {
            //userData.add(line);
        //}
        //reader.close();
        //driver.findElement(By.id("menu-item-0")).click();
        //driver.findElement(By.id("folder_name")).sendKeys(userData.get(1));
        //Thread.sleep(2000);

        //driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div[2]/div[2]/button[1]")).click();
        //Thread.sleep(5000);

        //WebElement workspaceElement = driver.findElement(By.id("workspace"));
    //}

    @Test(priority = 6)
    void Settings() throws IOException, InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"workspace\"]/li[1]/div[1]/span[1]")).click();
    }

    @Test(priority = 7)
    void Cover_Image() throws IOException, InterruptedException {


        Thread.sleep(2000);
        WebElement fileInputButton = driver.findElement(By.id("cover-upload"));
        fileInputButton.click();


        // Wait for the file chooser dialog to open
        try {
            Thread.sleep(2000); // Wait for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Specify the file path
        String filePath = "C:\\Users\\Staff\\Desktop\\DreamTeam_AUTOMATION\\SAMPLE\\1.jpg";

        // Use the Robot class to handle the file upload dialog
        try {
            Robot robot = new Robot();
            // Copy the file path to the clipboard
            StringSelection stringSelection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

            // Press Ctrl+V to paste the file path
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // Press Enter to close the file chooser dialog
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        Thread.sleep(10000);
    }
        @Test(priority = 8)
        void Thumbnail_Image() throws IOException, InterruptedException {


            Thread.sleep(2000);
            WebElement fileInputButton = driver.findElement(By.id("thumbnail-upload"));
            fileInputButton.click();


            // Wait for the file chooser dialog to open
            try {
                Thread.sleep(2000); // Wait for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Specify the file path
            String filePath = "C:\\Users\\Staff\\Desktop\\DreamTeam_AUTOMATION\\SAMPLE\\1.jpg";

            // Use the Robot class to handle the file upload dialog
            try {
                Robot robot = new Robot();
                // Copy the file path to the clipboard
                StringSelection stringSelection = new StringSelection(filePath);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

                // Press Ctrl+V to paste the file path
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);

                // Press Enter to close the file chooser dialog
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
            } catch (AWTException e) {
                e.printStackTrace();
            }
            Thread.sleep(10000);
    }



}

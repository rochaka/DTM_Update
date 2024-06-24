package Test_Suite.Use_SIDE;

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

public class User_appow {
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
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/nav[1]/a[3]")).click();
    }

    @Test(priority = 4)
    void click() throws IOException, InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/main/div[1]/div[2]/div/div/div/table/tbody/tr[1]/td[10]/span")).click();


    }







}

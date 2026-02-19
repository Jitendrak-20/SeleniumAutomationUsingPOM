package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.crm.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public TestBase() {
        try {
            prop = new Properties();

            FileInputStream ip = new FileInputStream(
                System.getProperty("user.dir")
                + "/src/main/java/com/crm/qa/config/config.properties"
            );

            prop.load(ip);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() {
        String browserName = prop.getProperty("browser").toLowerCase();

        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (browserName.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

        } else {
            throw new RuntimeException("Unsupported browser: " + browserName);
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(
            Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT)
        );
        driver.manage().timeouts().implicitlyWait(
            Duration.ofSeconds(TestUtil.IMPLICITLY_WAIT)
            );

        driver.get(prop.getProperty("url"));
    }
}


package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class baseTest {
        public static WebDriver driver;
        public static Properties prop = new Properties();

            public static FileReader fr;


    @BeforeTest
    public void setup() throws IOException {
        if (driver == null) {
            System.out.println("The path is " + System.getProperty("user.dir"));
                    fr = new FileReader("src/test/resources/configFiles/config.properties");

                prop.load(fr);

        }
        if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            driver.get(prop.getProperty("url"));
        } else if ((prop.getProperty("browser").equalsIgnoreCase("Firefox"))) {
            driver = new FirefoxDriver();
            driver.get(prop.getProperty("url"));
        }
    }

    @AfterTest
    public void teardown() {
        driver.close();
        System.out.println("Teardown successful");
    }
}

package testCases;

import Base.baseTest;
import Pages.HomePage;
import org.testng.annotations.Test;

            public class HomePageTest extends baseTest {
    @Test
    public static void login() throws InterruptedException {

        HomePage hp = new HomePage(driver);
        hp.enterUsername(prop.getProperty("username"));
        hp.enterPassword(prop.getProperty("password"));
        hp.clickLoginButton();
        Thread.sleep(2000);
        if (hp.isSideMenuButtonEnabled()) {
            hp.clickSideMenuButton();
        } else {
                System.out.println("button is not clickable");
        }
        Thread.sleep(2000);
    }
                                    }
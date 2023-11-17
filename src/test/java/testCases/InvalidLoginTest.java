package testCases;

import Base.baseTest;
import Pages.HomePage;
import org.testng.annotations.Test;

public class InvalidLoginTest extends baseTest {
                @Test
            public void invalidLogin() throws InterruptedException {
                HomePage hp = new HomePage(driver);
                            hp.enterUsername(prop.getProperty("invalidUsername"));
                            hp.enterPassword(prop.getProperty("invalidPassword"));
                                                hp.clickLoginButton();
                                               hp.getLoginButtonContText();
                                            Thread.sleep(3000);
                                                            prop.getProperty("invalidText");
                            }

}

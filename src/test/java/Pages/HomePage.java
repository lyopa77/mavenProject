        package Pages;

        import Base.baseTest;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;

            public class HomePage extends baseTest {


                    private final WebDriver driver;

                        // Locators
                        private final By usernameField = By.id("user-name");
                    private final By passwordField = By.id("password");
                            private final By loginButton = By.name("login-button");
                            private final By sideMenuButton = By.id("react-burger-menu-btn");
                                private final By loginButtonContainer = By.id("login_button_container");

                        public HomePage(WebDriver driver) {
                        this.driver = driver;
                        }

                    public void enterUsername(String username) {
                            driver.findElement(usernameField).sendKeys(username);
                            }

                            public void getLoginButtonContText() {
                                    String actText = driver.findElement(loginButtonContainer).getText();
                                            String expText = prop.getProperty("invalidText");
                                                if (actText.contains(expText)){
                                                                System.out.println("Correct text "+actText + " "+expText);}else {
                                                System.out.println("Incorrect text");
                                        }}


                    public void enterPassword(String password) {
                        driver.findElement(passwordField).sendKeys(password);
                        }

                        public void clickLoginButton() {
                        driver.findElement(loginButton).click();
                    }

                    public boolean isSideMenuButtonEnabled() {
                        return driver.findElement(sideMenuButton).isEnabled();
                    }

                    public void clickSideMenuButton() {
                        driver.findElement(sideMenuButton).click();
                            }


                    }





package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {

    private By emailField = By.cssSelector("[type= 'email']");
    private By passwordField = By.cssSelector("[type= 'password']");

    private By SubmitButtonLocator = By.cssSelector("[type= 'submit']");

    public LoginPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    public void provideEmail(String email) {
        findElementUsingByLocator(emailField).sendKeys(email);


    }

    public void providePassword(String password) {
        findElementUsingByLocator(passwordField).sendKeys(password);


}
    public void clickSubmit() {
        findElementUsingByLocator(submitBtn).click();

    }
    public void loginValidEmailPassword() {
            provideEmail("dmitry.lobachev@testpro.io");
            providePassword("Chebyreki5!");
            clickSubmit();
        }
    }



package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
protected WebDriver driver;
    protected   WebDriverWait wait;
    protected   Actions actions;
    public BasePage ( WebDriver givenDriver){
        driver =givenDriver;
        wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
    }
public WebElement findElementUsingByLocator(By locator){
    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

}
public void  click (By locator){
    findElementUsingByLocator(locator).click();
}
    public void doubleClick(By locator){
    actions.doubleClick(findElementUsingByLocator(locator)).perform();
    }
}
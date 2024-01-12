package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage{
    public Login(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@name='username']")
    WebElement username;
    @FindBy(xpath = "//input[@type='password']")
    WebElement password;
    @FindBy(xpath = "//button[contains(@type,'submit')]")
    WebElement loginBTN;
    public void enterUserName(String usernameValue){
        username.clear();
        username.sendKeys(usernameValue);
    }
    public void enterUserPassword(String passwordValue){
        password.clear();
        password.sendKeys(passwordValue);
    }
    public void clickOnLoginButton(){
        loginBTN.click();
    }
}

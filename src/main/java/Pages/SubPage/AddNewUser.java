package Pages.SubPage;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AddNewUser extends BasePage {
    public AddNewUser(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "(//div[contains(@class,'oxd-select-text-input')])[1]")
    WebElement role;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;
    @FindBy(xpath = "(//div[contains(@class,'oxd-select-text-input')])[2]")
    WebElement status;
    @FindBy(xpath = "(//input[@autocomplete='off'])[1]")
    WebElement usernameField;
    @FindBy(xpath = "(//input[contains(@type,'password')])[1]")
    WebElement passwordField;
    @FindBy(xpath = "(//input[contains(@type,'password')])[2]")
    WebElement confirmPassword;
    @FindBy(xpath = "//button[@type='submit'][contains(.,'Save')]")
    WebElement saveBTN;
    @FindBy(xpath = "//span[contains(.,'ESS')]")
    WebElement Ess;
    @FindBy(xpath = "//span[contains(.,'Odis  Adalwin')]")
    WebElement Odis;
    @FindBy(xpath = "//span[contains(.,'Disabled')]")
    WebElement disabled;
    public void selectRole(){
        role.click();
        Ess.click();
    }
    public void enterEmployeeName(){
        employeeName.clear();
        employeeName.sendKeys("Odis  Adalwin");
        Odis.click();

    }
    public void selectStatus(){
        status.sendKeys("Disabled");
        disabled.click();
    }
    public void enterUserNamerValue(String value){
        usernameField.sendKeys(value);
    }
    public void enteruserPasswordValue(){
        passwordField.sendKeys("admin123");
    }
    public void enteruserConfirmPasswordValue(){
        confirmPassword.sendKeys("admin123");
    }
    public void clickOnSaveButton() throws InterruptedException {
        saveBTN.click();
        Thread.sleep(3000);
    }
}

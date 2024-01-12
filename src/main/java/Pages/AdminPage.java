package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdminPage extends BasePage{
    public AdminPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//button[@type='button'][contains(.,'Add')]")
    WebElement AddBtn;
    @FindBy(xpath = "//span[contains(.,'Records Found')]")
    WebElement numRecords;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement searchBox;
    @FindBy(xpath = "//button[@type='submit'][contains(.,'Search')]")
    WebElement searchBtn;
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement deleteBtn;
    @FindBy(xpath = "//button[@type='button'][contains(.,'Yes, Delete')]")
    WebElement confirmBtn;
    @FindBy(xpath = "//button[@type='button'][contains(.,'Reset')]")
    WebElement resetBtn;

    public void clickOnAddButton(){
        AddBtn.click();
    }
    public int getCount() {
        String txt = numRecords.getText();
        String numberPattern = "\\d+"; // Regular expression pattern for extracting numbers
        Pattern pattern = Pattern.compile(numberPattern);
        Matcher matcher = pattern.matcher(txt);

        String number = null;
        if (matcher.find()) {
            number = matcher.group();
        }

        return Integer.parseInt(number);
    }
    public void enterSearchValue(String value){
        searchBox.clear();
        searchBox.sendKeys(value);
    }
    public void clickOnSearchButton(){
        searchBtn.click();
    }
    public void clickOnDeleteButton(){
        deleteBtn.click();
    }
    public void confirmDeleting(){
        confirmBtn.click();
    }
    public void clickOnResetButton(){
        resetBtn.click();
    }

}

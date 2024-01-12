package BDDTests;

import Configuration.loaddataproperties;
import Pages.AdminPage;
import Pages.HomePage;
import Pages.Login;
import Pages.SubPage.AddNewUser;
import TestsConfigurations.TestBase;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Stepsdef{
    Login obj;
    HomePage homePage;
    AdminPage adminPage;
    AddNewUser addNewUser;
    public static WebDriver driver;
    int value1;
    int value2;
    int value3;
    String value = loaddataproperties.UserData.getProperty("usernamevalue");

    @And("The user enter the username {string}")
    public void the_user_enter_the_username(String string) throws  Throwable{
        obj = new Login(driver);
        obj.enterUserName("Admin");

    }
    @Given("The user enter the password {string}")
    public void the_user_enter_the_password_password(String string) throws Throwable{
        obj = new Login(driver);
        obj.enterUserPassword("admin123");
    }
    @And("The user clicks on login button to enter the home page")
    public void the_user_clicks_on_login_button_to_enter_the_home_page() {
        obj = new Login(driver);
        obj.clickOnLoginButton();
    }


    @Given("The user open the browser")
    public void theUserOpenTheBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @And("The user clicks on admin button")
    public void theUserClicksOnAdminButton() {
        homePage = new HomePage(driver);
        homePage.clickOnAdminButton();
        adminPage = new AdminPage(driver);
        value1 = adminPage.getCount();
    }

    @And("The user clicks on Add button")
    public void theUserClicksOnAddButton() {
        adminPage = new AdminPage(driver);
        adminPage.clickOnAddButton();
    }

    @And("The user select employee role")
    public void theUserSelectEmployeeRole() {
        addNewUser  = new AddNewUser(driver);
        addNewUser.selectRole();
    }

    @And("The user select status")
    public void theUserSelectStatus() {
        addNewUser  = new AddNewUser(driver);
        addNewUser.selectStatus();
    }

    @And("The user enter employee name")
    public void theUserEnterEmployeeName() {
        addNewUser  = new AddNewUser(driver);
        addNewUser.enterEmployeeName();
    }

    @And("The user enter username value")
    public void theUserEnterUsernameValue() {
        addNewUser  = new AddNewUser(driver);
        addNewUser.enterUserNamerValue(value);
    }

    @And("The user enter the password value")
    public void theUserEnterThePasswordValue() {
        addNewUser  = new AddNewUser(driver);
        addNewUser.enteruserPasswordValue();
    }

    @And("The user renter the password")
    public void theUserRenterThePassword() {
        addNewUser  = new AddNewUser(driver);
        addNewUser.enteruserConfirmPasswordValue();
    }

    @And("The user clicks on save  button")
    public void theUserClicksOnSaveButton() throws InterruptedException {
        addNewUser  = new AddNewUser(driver);
        adminPage = new AdminPage(driver);
        addNewUser.clickOnSaveButton();
        value2 = adminPage.getCount();
    }

    @Then("The user closes the browser")
    public void theUserClosesTheBrowser() {
        driver.close();
    }

    @And("The system prints increased successfully after the new add")
    public void theSystemPrintsIncreasedSuccessfullyAfterTheNewAdd() {
        if(value2>value1){
            System.out.println("Records Increased Successfully");
        }
    }

    @Given("The user search by username")
    public void theUserSearchByUsername() {
        adminPage = new AdminPage(driver);
        value2 = adminPage.getCount();
        adminPage.enterSearchValue(value);
        adminPage.clickOnSearchButton();
    }

    @And("The user clicks on delete button")
    public void theUserClicksOnDeleteButton() {
        adminPage = new AdminPage(driver);
        adminPage.clickOnDeleteButton();
    }

    @And("The user confirm the delete action")
    public void theUserConfirmTheDeleteAction() throws InterruptedException {
        adminPage = new AdminPage(driver);
        adminPage.confirmDeleting();
        adminPage.clickOnResetButton();
    }

    @And("The system should display decreased successfully")
    public void theSystemShouldDisplayDecreasedSuccessfully() {
        adminPage = new AdminPage(driver);
        value3 = adminPage.getCount();
        if (value3<value2){
            System.out.println("Records Decreased Successfully");
        }
    }
}

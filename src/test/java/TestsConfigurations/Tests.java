package TestsConfigurations;

import Configuration.loaddataproperties;
import Pages.AdminPage;
import Pages.HomePage;
import Pages.Login;
import Pages.SubPage.AddNewUser;
import TestsConfigurations.TestBase;
import org.apache.hc.core5.util.Asserts;
import org.testng.annotations.Test;

public class Tests extends TestBase {
    Login obj;
    HomePage c;
    AdminPage f;
    AddNewUser j;
    String value = loaddataproperties.UserData.getProperty("usernamevalue");
    @Test
    public void runner() throws InterruptedException {
        obj = new Login(driver);
        c=new HomePage(driver);
        f=new AdminPage(driver);
        j=new AddNewUser(driver);

        obj.enterUserName("Admin");
        obj.enterUserPassword("admin123");
        obj.clickOnLoginButton();
        c.clickOnAdminButton();
        int value1= f.getCount();
        f.clickOnAddButton();
        j.selectRole();
        j.enterEmployeeName();

        j.selectStatus();
        j.enterUserNamerValue(value);
        j.enteruserPasswordValue();
        j.enteruserConfirmPasswordValue();
        j.clickOnSaveButton();

        c.clickOnAdminButton();
        int value2= f.getCount();
        if (value2  > value1){
            System.out.println("Increased Successfully");
        }

    }
}

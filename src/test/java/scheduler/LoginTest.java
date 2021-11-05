package scheduler;

import configuration.ConfigScheduler;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginScreen;
import pages.SplashScreen;

public class LoginTest extends ConfigScheduler {

    @Test
    public void loginTest(){

        boolean isFabPresent = new SplashScreen(driver)
                .checkVersion("0.0.3")
                .fillEmail("john001@gmail.com")
                .fillPassword("Jj123456$")
                .clickLoginButton()
                .skipWizard()
                .isFabAddButtonPresent();

        Assert.assertTrue(isFabPresent);
    }

    @Test
    public void loginTest2(){

        boolean isFabPresent = new LoginScreen(driver)
                .fillEmail("john111@gmail.com")
                .fillPassword("Jj123456$")
                .clickLoginButton()
                .skipWizard()
                .isFabAddButtonPresent();

        Assert.assertTrue(isFabPresent);
    }
}

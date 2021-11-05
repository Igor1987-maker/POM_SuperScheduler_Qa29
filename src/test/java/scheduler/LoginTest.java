package scheduler;

import configuration.ConfigScheduler;
import org.testng.annotations.Test;
import pages.SplashScreen;

public class LoginTest extends ConfigScheduler {

    @Test
    public void loginTest(){

        new SplashScreen(driver)
                .checkVersion("0.0.3")
                .fillEmail("john111@gmail.com")
                .fillPassword("Jj123456$")
                .clickLoginButton();
    }
}

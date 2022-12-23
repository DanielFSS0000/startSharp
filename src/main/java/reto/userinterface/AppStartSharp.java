package reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class AppStartSharp extends PageObject {

    public static final Target USER_NAME = Target.the("Input to username")
            .located(By.xpath("//*[@id=\"LoginPanel0_Username\"]"));

    public static final Target PASSWORD = Target.the("Input to add password")
            .located(By.xpath("//*[@id=\"LoginPanel0_Password\"]"));

    public static final Target AUTH_BTN = Target.the("Button authentication user")
            .located(By.xpath("//*[@id=\"LoginPanel0_LoginButton\"]"));

}

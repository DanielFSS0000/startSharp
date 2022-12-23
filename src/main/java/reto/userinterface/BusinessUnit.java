package reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class BusinessUnit extends PageObject {


    public static final Target BARS_BUTTOM = Target.the("This is the home buttom")
            .located(By.className("s-sidebar-toggler"));
    public static final Target HOME_BUTTOM = Target.the("This is the home buttom")
            .located(By.className("s-sidebar-band-link"));
    public static final Target ORGANIZATION = Target.the("Menu for view and adm Organization")
            .located(By.xpath("//span[@class=\"s-sidebar-link-text\"][contains(text(), \"Organization\")]"));

    public static final Target BUSINESS_UNIT = Target.the("Here assign a new name to business unit")
            .located(By.xpath("//span[@class=\"s-sidebar-link-text\"][contains(text(), \"Business Units\")]"));

    public static final Target NEW_BUSINESS = Target.the("new window to assign new name and parent unit")
            .located(By.xpath("//span[@class=\"button-inner\"]/i[@class=\"fa fa-plus-circle text-green\"]"));

    public static final Target INPUT_NAME_BUSINESS = Target.the("Add new name to organization")
            .located(By.xpath("//input[@class=\"editor s-Serenity-StringEditor s-StringEditor required\"]"));

    public static final Target PARENT_UNIT = Target.the("Select to parent unit in the new business unit")
            .located(By.xpath("//span[@class=\"select2-chosen\"]"));

    public static final Target INPUT_PARENT_UNIT = Target.the("Search parent unit to new business unit")
            .located(By.xpath("//*[@id=\"s2id_autogen1_search\"]"));

    public static final Target CONFIRM_NEW_BUSINESS_UNIT = Target.the("Button to confirm new Businees unit")
            .located(By.xpath("//span[@class=\"button-inner\"]/i [@class=\"fa fa-clipboard-check text-purple\"]"));

    public static final Target SAVE_APPROVED = Target.the("Save success")
            .located(By.xpath("//*[text()='Save success']"));


}

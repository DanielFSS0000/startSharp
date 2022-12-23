package reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Meeting extends PageObject {

    public static final Target BARS_BUTTOM = Target.the("This is the home buttom")
            .located(By.className("s-sidebar-toggler"));
    public static final Target HOME_BUTTOM = Target.the("This is the home buttom")
            .located(By.className("s-sidebar-band-link"));
    public static final Target MENU_MEETING = Target.the("Menu for view Meeting")
            .located(By.xpath("//*[text()='Meeting']"));
    public static final Target FIRST_OPTION_MEETINGS = Target.the("Options to view All meeting create")
            .located(By.xpath("//*[text()='Meetings' and contains(@class, 's-sidebar-link-text')]"));
    public static final Target BTN_NEW_MEETING = Target.the("Create new Meet")
            .located(By.xpath("//span[@class=\"button-inner\"]/i[@class=\"fa fa-plus-circle text-green\"]"));
    public static final Target MEETING_NAME = Target.the("Add new Name to new meeting")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingName\"]"));
    public static final Target SELECT_MEETING_TYPE = Target.the("Select Meeting Type")
            .located(By.xpath("//span[@id=\"select2-chosen-6\"]"));

    public static final Target MEETING_TYPE_INPUT = Target.the("This is the meeting type input")
            .located(By.xpath("//*[@id='select2-drop']/div//input"));
    public static final Target MEETING_NUMBER = Target.the("Input to add meeting number")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber\"]"));

    public static final Target START_DATE = Target.the("Input Date Meet")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_StartDate\"]"));

    public static final Target START_HOUR = Target.the("This is the start hour")
            .located(By.xpath("//div[@class='field StartDate col-sm-6']//select"));

    public static final Target END_DATE = Target.the("Select end time")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_EndDate\"]"));

    public static final Target END_HOUR = Target.the("This is the end hour")
            .located(By.xpath("//div[@class='field EndDate col-sm-6']//select"));

    public static final Target SELECT_LOCATION = Target.the("Select location")
            .located(By.xpath("//div[@class=\"select2-container editor s-Serenity-LookupEditor s-LookupEditor has-inplace-button\"]"));

    public static final Target INPUT_LOCATION = Target.the("Option location")
            .located(By.xpath("//*[@id=\"s2id_autogen7_search\"]"));

    public static final Target SELECT_UNIT = Target.the("Select to unit")
            .located(By.xpath("//span[@id=\"select2-chosen-8\"]"));

    public static final Target INPUT_UNIT = Target.the("Option to unit")
            .located(By.xpath("//*[@id=\"s2id_autogen8_search\"]"));

    public static final Target SELECT_ORGANIZED = Target.the("Select to Organized")
            .located(By.id("select2-chosen-9"));
    

    public static final Target INPUT_ORGANIZED = Target.the("Option to Organized")
            .located(By.xpath("//*[@id=\"s2id_autogen9_search\"]"));

    public static final Target SELECT_REPORTER = Target.the("Select to Reporter")
            .located(By.xpath("//span[@id=\"select2-chosen-10\"]"));

    public static final Target INPUT_REPORTER = Target.the("Option to reporter")
            .located(By.xpath("//*[@id=\"s2id_autogen10_search\"]"));

    public static final Target BTN_CHECK_MEET = Target.the("Buttom to confirm new meeting")
            .located(By.xpath("//span[@class=\"button-inner\"]/i [@class=\"fa fa-clipboard-check text-purple\"]"));

    public static final Target SAVE_APPROVED = Target.the("Save success")
            .located(By.xpath("//*[text()='Save success']"));


}
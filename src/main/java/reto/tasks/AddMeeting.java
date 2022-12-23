package reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import reto.model.newmeeting.NewMeeting;
import reto.userinterface.Meeting;

public class AddMeeting implements Task {

    private NewMeeting newMeeting;

    public AddMeeting(NewMeeting newMeeting) {
        this.newMeeting = newMeeting;
    }


    public static AddMeeting finished(NewMeeting newMeeting) {
        return Tasks.instrumented(AddMeeting.class, newMeeting);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Meeting.BARS_BUTTOM),
                Click.on(Meeting.HOME_BUTTOM),
                Click.on(Meeting.MENU_MEETING),
                Click.on(Meeting.FIRST_OPTION_MEETINGS),
                Click.on(Meeting.BTN_NEW_MEETING),
                Enter.theValue(newMeeting.getMeetingName()).into(Meeting.MEETING_NAME),
                Click.on(Meeting.SELECT_MEETING_TYPE),
                Enter.theValue(newMeeting.getMeetingType()).into(Meeting.MEETING_TYPE_INPUT),
                Hit.the(Keys.ENTER).into(Meeting.MEETING_TYPE_INPUT),
                Enter.theValue(newMeeting.getMeetingNumber()).into(Meeting.MEETING_NUMBER),
                Click.on(Meeting.START_DATE),
                Enter.theValue(newMeeting.getStartDate()).into(Meeting.START_DATE),
                SelectFromOptions.byVisibleText(newMeeting.getStartTime()).from(Meeting.START_HOUR),
                Click.on(Meeting.END_DATE),
                Enter.theValue( newMeeting.getEndDate()).into(Meeting.END_DATE),
                SelectFromOptions.byVisibleText(newMeeting.getEndTime()).from(Meeting.END_HOUR),
                Click.on(Meeting.SELECT_LOCATION),
                Enter.theValue(newMeeting.getLocation()).into(Meeting.INPUT_LOCATION),
                Hit.the(Keys.ENTER).into(Meeting.INPUT_LOCATION),
                Click.on(Meeting.SELECT_UNIT),
                Enter.theValue(newMeeting.getUnit()).into(Meeting.INPUT_UNIT),
                Hit.the(Keys.ENTER).into(Meeting.INPUT_UNIT),
                Click.on(Meeting.SELECT_ORGANIZED),
                Enter.theValue(newMeeting.getOrganizer()).into(Meeting.INPUT_ORGANIZED),
                Hit.the(Keys.ENTER).into(Meeting.INPUT_ORGANIZED),
                Click.on(Meeting.SELECT_REPORTER),
                Enter.theValue(newMeeting.getReport()).into(Meeting.INPUT_REPORTER),
                Hit.the(Keys.ENTER).into(Meeting.INPUT_REPORTER),
                Click.on(Meeting.BTN_CHECK_MEET)
        );

    }
}

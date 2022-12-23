package reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import reto.model.newmeeting.NewMeeting;
import reto.userinterface.Meeting;

public class ApprovedNewMeeting implements Question<Boolean> {

    public static ApprovedNewMeeting endSteps(NewMeeting newMeeting) {

        return new ApprovedNewMeeting();

    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String saveSuccess = "Save success";

        String endStep = Text.of(Meeting.SAVE_APPROVED).answeredBy(actor);

        return endStep.equals(saveSuccess);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
    }


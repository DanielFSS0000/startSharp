package reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import reto.model.assignbusiness.AssignBusiness;
import reto.userinterface.BusinessUnit;

public class ApprovedBusinessUnit implements Question<Boolean> {

    public static ApprovedBusinessUnit endStep(AssignBusiness assignBusiness) {

        return new ApprovedBusinessUnit();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String saveSuccess = "Save success";

        String endStep = Text.of(BusinessUnit.SAVE_APPROVED).answeredBy(actor);

        return endStep.equals(saveSuccess);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}

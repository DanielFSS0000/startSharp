package reto.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import reto.model.assignbusiness.AssignBusiness;
import reto.userinterface.BusinessUnit;

public class NewBusinessUnit implements Task {

    private AssignBusiness assignBusiness;

    public NewBusinessUnit(AssignBusiness assignBusiness) {
        this.assignBusiness = assignBusiness;
    }

    public static NewBusinessUnit finished(AssignBusiness assignBusiness) {

        return Tasks.instrumented(NewBusinessUnit.class, assignBusiness);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BusinessUnit.BARS_BUTTOM),
                Click.on(BusinessUnit.HOME_BUTTOM),
                Click.on(BusinessUnit.ORGANIZATION),
                Click.on(BusinessUnit.BUSINESS_UNIT),
                Click.on(BusinessUnit.NEW_BUSINESS),
                Enter.theValue(assignBusiness.getNameBusiness()).into(BusinessUnit.INPUT_NAME_BUSINESS),
                Click.on(BusinessUnit.PARENT_UNIT),
                Enter.theValue(assignBusiness.getParentUnit()).into(BusinessUnit.INPUT_PARENT_UNIT),
                Hit.the(Keys.ENTER).into(BusinessUnit.INPUT_PARENT_UNIT),
                Click.on(BusinessUnit.CONFIRM_NEW_BUSINESS_UNIT)
        );
    }
}

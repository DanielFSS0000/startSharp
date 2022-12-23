package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import reto.model.assignbusiness.AssignBusiness;
import reto.model.authentication.Authentication;
import reto.questions.ApprovedBusinessUnit;
import reto.tasks.AuthUser;
import reto.tasks.NewBusinessUnit;
import reto.tasks.OpenUpStarSharp;

public class primerCriterioStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUpStarSharp.thePage());
    }

    @Given("Authentication user")
    public void authenticationUser(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(AuthUser.finished(Authentication.setData(dataTable).get(0)));
    }

    @When("a new business unit is assigned")
    public void aNewBusinessUnitIsAssigned(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(NewBusinessUnit.finished(AssignBusiness.setData(dataTable).get(0)));
    }
    @Then("Completion of assignment for business unit")
    public void completionOfAssignmentForBusinessUnit(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ApprovedBusinessUnit.endStep(AssignBusiness.setData(dataTable).get(0))));
    }
}

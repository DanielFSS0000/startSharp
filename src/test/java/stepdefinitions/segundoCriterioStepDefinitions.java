package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import reto.model.newmeeting.NewMeeting;
import reto.questions.ApprovedNewMeeting;
import reto.tasks.AddMeeting;
import reto.tasks.OpenUpStarSharp;

public class segundoCriterioStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUpStarSharp.thePage());
    }

    @When("Create a new meeting by filling in all the fields")
    public void createANewMeetingByFillingInAllTheFields(DataTable dataTable) {
            OnStage.theActorInTheSpotlight().attemptsTo(AddMeeting.finished(NewMeeting.setData(dataTable).get(0)));

    }
    @Then("new meeting has been created successfully")
    public void newMeetingHasBeenCreatedSuccessfully(io.cucumber.datatable. DataTable dataTable) {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ApprovedNewMeeting.endSteps(NewMeeting.setData(dataTable).get(0))));
    }
}

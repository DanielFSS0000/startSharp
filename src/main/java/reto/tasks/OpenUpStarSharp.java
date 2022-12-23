package reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import reto.userinterface.StartSharpOnBrowser;


public class OpenUpStarSharp implements Task {

    private StartSharpOnBrowser startSharpOnBrowser;


    public static OpenUpStarSharp thePage() {
        return Tasks.instrumented(OpenUpStarSharp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) { actor.attemptsTo(Open.browserOn(startSharpOnBrowser)); }
}

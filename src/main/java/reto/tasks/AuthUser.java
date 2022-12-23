package reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import reto.model.authentication.Authentication;
import reto.userinterface.AppStartSharp;

public class AuthUser implements Task {

    private Authentication authentication;

    public AuthUser(Authentication authentication){
        this.authentication = authentication;
    }

    public static AuthUser finished(Authentication authentication) {
        return Tasks.instrumented(AuthUser.class, authentication);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(authentication.getUser()).into(AppStartSharp.USER_NAME),
                Enter.theValue(authentication.getKey()).into(AppStartSharp.PASSWORD),
                        Click.on(AppStartSharp.AUTH_BTN)
                );
    }
}

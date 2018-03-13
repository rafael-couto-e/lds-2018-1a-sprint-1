package br.edu.ifrs.canoas.tads.tcc.web.page;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@PageUrl("http://localhost:{port}/")
public class LoginPage extends FluentPage {

    private static final String LOGIN_FORM = "#login-form";

    @FindBy(css = "#submit-button")
    private FluentWebElement submitButton;

    public void isAt() {
        assertThat(window().title()).isEqualTo("IFRS");
    }

    public LoginPage fillAndSubmitForm(String... paramsOrdered) {
        $("input").fill().with(paramsOrdered);
        submitButton.submit();
        //awaitUntilFormDisappear();
        return this;
    }


    private LoginPage awaitUntilFormDisappear() {
        //await().atMost(5, TimeUnit.SECONDS).until(el(LOGIN_FORM)).not().present();
        return this;
    }

}
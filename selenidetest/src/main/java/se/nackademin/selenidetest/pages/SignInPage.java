package se.nackademin.selenidetest.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends MenuPage {

    @FindBy(css = "#input-username")
    private SelenideElement userNameField;

    @FindBy(css = "#input-password")
    private SelenideElement passwordField;

    @FindBy(css = "#login-button")
    private SelenideElement loginButton;

    public void setUserName(String userName) {
        userNameField.setValue(userName);
    }

    public void setPassword(String password) {
        passwordField.setValue(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

}
package se.nackademin.selenidetest.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends MenuPage {

    @FindBy(css = "#gwt-uid-3")
    private SelenideElement userNameField;

    @FindBy(css = "#gwt-uid-5")
    private SelenideElement passwordField;

    @FindBy(css = "#add-user-button")
    private SelenideElement addUserButton;

    public void setUserName(String userName) {
        setTextFieldValue("user name field", userName, userNameField);
    }

    public void setPassword(String password) {
        setTextFieldValue("password field", password, passwordField);
    }

    public void clickAddUserButton() {
        clickButton("add user button", addUserButton);
    }

}

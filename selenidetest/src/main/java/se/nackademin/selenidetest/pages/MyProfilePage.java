package se.nackademin.selenidetest.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage extends MenuPage {

    @FindBy(css = "#gwt-uid-5")
    private SelenideElement userNameField;

    public String getUserName() {
        return userNameField.getText();
    }

}
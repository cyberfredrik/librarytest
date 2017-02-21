package se.nackademin.selenidetest.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MenuPage extends PageBase {

    @FindBy(css = "#side-menu-link-add-user")
    private SelenideElement addUserLink;

    @FindBy(css = "#side-menu-link-sign-in")
    private SelenideElement signInLink;

    @FindBy(css = "#side-menu-link-my-profile")
    private SelenideElement myProfileLink;

    @FindBy(css = "#side-menu-link-browse-books")
    private SelenideElement browseBooksLink;

    public void navigateToAddUserPage() {
        clickButton("add user link", addUserLink);
    }

    public void navigateToSignInPage() {
        clickButton("sign in link", signInLink);
    }

    public void navigateToMyProfilePage() {
        clickButton("my profile link", myProfileLink);
    }

    public void navigateToBrowseBooksPage() {
        clickButton("browse books link", browseBooksLink);
    }

}

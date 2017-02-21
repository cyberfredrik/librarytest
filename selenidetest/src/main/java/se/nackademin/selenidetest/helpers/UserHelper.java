package se.nackademin.selenidetest.helpers;

import se.nackademin.selenidetest.pages.*;

import static com.codeborne.selenide.Selenide.page;

public class UserHelper {

    public static void createNewUser(String userName, String password) {
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToAddUserPage();

        AddUserPage addUserPage = page(AddUserPage.class);
        addUserPage.setUserName(userName);
        addUserPage.setPassword(password);
        addUserPage.clickAddUserButton();
    }

    public static void logInAsUser(String userName, String password) {
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToSignInPage();

        SignInPage signInPage = page(SignInPage.class);
        signInPage.setUserName(userName);
        signInPage.setPassword(password);
        signInPage.clickLoginButton();
    }

}

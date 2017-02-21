package se.nackademin.selenidetest;

import org.junit.Ignore;
import org.junit.Test;
import se.nackademin.selenidetest.helpers.*;
import se.nackademin.selenidetest.models.*;
import se.nackademin.selenidetest.pages.*;

import java.util.UUID;

import static com.codeborne.selenide.Selenide.*;
import static junit.framework.TestCase.assertEquals;

public class SelenideTest extends TestBase {

    @Test
    @Ignore
    public void tableTest() {
        page(MenuPage.class).navigateToBrowseBooksPage();
        BrowseBooksPage browseBooksPage = page(BrowseBooksPage.class);
        browseBooksPage.setTitleField("G");
        browseBooksPage.clickSearchBooksButton();

        Table table = new Table($(".v-grid-tablewrapper"));
        System.out.println("Columns: " + table.getColumnCount());
        System.out.println("Rows: " + table.getRowCount());
        table.searchAndClick("Terry Pratchett", 1);
        sleep(5000);
    }

    @Test
    public void fetchBookTest() {
        Book book = BookHelper.fetchBook("Guards!");
        assertEquals("book title should be 'Guards! Guards!'", "Guards! Guards!", book.getTitle());
    }

    @Test
    @Ignore
    public void loginTest() {
        String uuid = UUID.randomUUID().toString();

        UserHelper.createNewUser(uuid, uuid);
        UserHelper.logInAsUser(uuid, uuid);

        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToMyProfilePage();

        MyProfilePage myProfilePage = page(MyProfilePage.class);
        String retrievedUserName = myProfilePage.getUserName();

        assertEquals("user name should be shown in profile", uuid, retrievedUserName);
    }

}
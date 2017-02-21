package se.nackademin.selenidetest.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class BrowseBooksPage {

    @FindBy(css = "#gwt-uid-3")
    private SelenideElement titleField;

    @FindBy(css = "#search-books-button")
    private SelenideElement searchBooksButton;

    @FindBy(css = "td.v-grid-cell:nth-child(1) > a:nth-child(1)")
    private SelenideElement firstResultTitle;

    public void setTitleField(String title) {
        titleField.setValue(title);
    }

    public void clickSearchBooksButton() {
        searchBooksButton.click();
    }

    public void clickFirstResultTitle() {
        firstResultTitle.click();
    }

}

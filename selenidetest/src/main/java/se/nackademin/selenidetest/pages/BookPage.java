package se.nackademin.selenidetest.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class BookPage {

    @FindBy(css = "#gwt-uid-3")
    private SelenideElement titleField;

    @FindBy(css = "#gwt-uid-5")
    private SelenideElement authorField;

    @FindBy(css = "#gwt-uid-7")
    private SelenideElement descriptionField;

    public String getTitle() {
        return titleField.getText();
    }

    public String getAuthor() {
        return authorField.getText();
    }

    public String getDescription() {
        return descriptionField.getText();
    }

}

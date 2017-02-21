package se.nackademin.selenidetest.pages;

import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PageBase {
    private static final Logger LOG = LoggerFactory.getLogger(MenuPage.class);

    protected void clickButton(String descriptor, SelenideElement element) {
        LOG.info("Clicked " + descriptor);
        element.click();
    }

    protected void setTextFieldValue(String descriptor, String value, SelenideElement element) {
        LOG.info("Setting " + descriptor + " to " + value);
        element.setValue(value);
    }

}

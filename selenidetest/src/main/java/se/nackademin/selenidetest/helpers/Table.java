package se.nackademin.selenidetest.helpers;

import com.codeborne.selenide.SelenideElement;

import java.util.NoSuchElementException;

public class Table {
    private SelenideElement rootElement;

    public Table(SelenideElement rootElement) {
        this.rootElement = rootElement;
    }

    public int getRowCount() {
        return rootElement.$$("tr").size() - 1;
    }

    public int getColumnCount() {
        return rootElement.$("tr").$$("th").size();
    }

    private SelenideElement getCell(int column, int row) {
        return rootElement.$("tr", row + 1).$("td", column);
    }

    public String getCellValue(int column, int row) {
        return getCell(column, row).getText();
    }

    public void clickCell(int column, int row) {
        getCell(column, row).click();
    }

    public void searchAndClick(String query, int column) {
        for(int row = 0; row < getRowCount(); row++) {
            if(query.equals(getCellValue(column, row))) {
                clickCell(column, row);
                return;
            }
        }
        throw new NoSuchElementException("The content could not be found.");
    }

}

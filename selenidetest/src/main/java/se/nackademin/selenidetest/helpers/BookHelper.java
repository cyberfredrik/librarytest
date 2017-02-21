package se.nackademin.selenidetest.helpers;

import se.nackademin.selenidetest.models.Book;
import se.nackademin.selenidetest.pages.BookPage;
import se.nackademin.selenidetest.pages.BrowseBooksPage;
import se.nackademin.selenidetest.pages.MenuPage;

import static com.codeborne.selenide.Selenide.page;

public class BookHelper {

    public static Book fetchBook(String queryTitle) {
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToBrowseBooksPage();

        BrowseBooksPage browseBooksPage = page(BrowseBooksPage.class);
        browseBooksPage.setTitleField(queryTitle);
        browseBooksPage.clickSearchBooksButton();
        browseBooksPage.clickFirstResultTitle();

        BookPage bookPage = page(BookPage.class);
        Book book = new Book();
        book.setTitle(bookPage.getTitle());
        book.setAuthor(bookPage.getAuthor());
        book.setDescription(bookPage.getDescription());

        return book;
    }

}

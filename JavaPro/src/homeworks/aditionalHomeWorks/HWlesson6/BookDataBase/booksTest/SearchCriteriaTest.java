package homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.booksTest;

import homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.Book;
import homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.searshCriteria.AuthorSearchCriteria;
import homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.searshCriteria.SearchCriteria;
import homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.searshCriteria.YearOfIssueSearchCriteria;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SearchCriteriaTest {
    static SearchCriteria authorCriteria = new AuthorSearchCriteria("l1");
    static YearOfIssueSearchCriteria yearCriteria = new YearOfIssueSearchCriteria("2022");
    static Book book1 = new Book("l1", "f1", "2020");
    static Book book2 = new Book("l2", "f2", "2020");
    static Book book3 = new Book("l3", "f3", "2021");
    static Book book4 = new Book("l4", "f4", "2022");
    static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        matchTest(book1);



    }


    public static void matchTest(Book book){
        boolean result = authorCriteria.match(book1);
        assertTrue(result);
    }
}

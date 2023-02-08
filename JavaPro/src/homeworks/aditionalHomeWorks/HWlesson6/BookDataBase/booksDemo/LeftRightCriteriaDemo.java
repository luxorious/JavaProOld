package homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.booksDemo;

import homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.Book;
import homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.bookDB.BookDatabaseImpl;
import homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.searshCriteria.*;

public class LeftRightCriteriaDemo {
    static BookDatabaseImpl b = new BookDatabaseImpl();
    static Book book1 = new Book("l1", "f1", "2022");
    static Book book2 = new Book("l2", "f2", "2022");
    static Book book3 = new Book("l3", "f3", "2021");
    static Book book4 = new Book("l4", "f4", "2020");

    public static void main(String[] args) {
        b.save(book1);
        b.save(book2);
        b.save(book3);
        b.save(book4);


        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("l1");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("f2");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria sc = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        System.out.println(searchCriteria.match(book1));
        System.out.println(sc.match(book1));
    }
}

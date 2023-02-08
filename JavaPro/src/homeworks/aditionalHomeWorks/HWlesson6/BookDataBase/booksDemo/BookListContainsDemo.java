package homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.booksDemo;

import homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.Book;
import homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.bookDB.BookDatabaseImpl;
import homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.searshCriteria.AuthorSearchCriteria;
import homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.searshCriteria.SearchCriteria;

import java.util.ArrayList;
import java.util.List;

public class BookListContainsDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book("A1", "B1", "2022");
        Book book3 = new Book("A1", "BB", "2021");
        Book book4 = new Book("A1", "BBB", "2023");
        Book book2 = new Book("A2", "B2", "2022");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        Book bookInTheList = new Book("A1", "B1", "2022");
        boolean containsBook = books.contains(bookInTheList); // должно быть true

        Book bookNotInTheList = new Book("A3", "B3", "2022");
        boolean notContainsBook = books.contains(bookNotInTheList); // должно быть false

        System.out.println(containsBook);
        System.out.println(notContainsBook);
//-----------------------------------------------------------------------------------------
        BookDatabaseImpl db = new BookDatabaseImpl();

        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);

        System.out.println(db);
//-----------------------------------------------------------------------------------------
//        System.out.println(db.delete(1l));
        System.out.println(db);
//-----------------------------------------------------------------------------------------
//        System.out.println(db.delete(book2));
        System.out.println(db);
//-----------------------------------------------------------------------------------------
        System.out.println(db.findById(2L));
//-----------------------------------------------------------------------------------------
        System.out.println("Hello");
        System.out.println(db.findByAuthor("A1"));
//-----------------------------------------------------------------------------------------
        SearchCriteria sc = new AuthorSearchCriteria("A2");

        System.out.println(db.find(sc));
//-----------------------------------------------------------------------------------------
        Book bbb = new Book("lol", "bol", "3412");
        System.out.println(db.contains(book1));
        System.out.println(db.contains(bbb));
//-----------------------------------------------------------------------------------------
    }
}

package homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.searshCriteria;

import homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.Book;

public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getTitle().equals(this.titleToSearch);
    }
}


package homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.searshCriteria;

import homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.Book;

public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }
    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch);
    }
}

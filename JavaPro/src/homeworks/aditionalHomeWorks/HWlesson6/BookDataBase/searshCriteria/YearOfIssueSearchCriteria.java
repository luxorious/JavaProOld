package homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.searshCriteria;

import homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.Book;

public class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return book.getYearOfIssue().equals(this.yearOfIssueToSearch);

    }


    }
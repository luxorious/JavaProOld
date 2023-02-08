package homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.searshCriteria;

import homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.Book;

public class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;


    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return leftCondition.match(book) || rightCondition.match(book);
    }

}

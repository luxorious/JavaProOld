package homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.searshCriteria;

import homeworks.aditionalHomeWorks.HWlesson6.BookDataBase.Book;

public class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
//        leftCondition.match(book);
//        rightCondition.match(book);
        return leftCondition.match(book) && rightCondition.match(book);

        // допишите реализацию метода
        // return true - если книга удовлетворяет и левому и правому условию
        // иначе return false
    }


}
package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ConcreteAggreate
 * Iterable 구현체적인 집합체 역할을 한다.
 */
public class BookShelf implements Iterable<Book>, Cloneable {

    private ArrayList<Book> books = new ArrayList<>();

    public BookShelf() {

    }

    private BookShelf(ArrayList<Book> books) {
        this.books = books;
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return this.books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    @Override
    public BookShelf clone() {
        // 이펙티브 자바를 보고 인지할 수 있는 참조 객체 클론 주의사항
        return new BookShelf(new ArrayList<>(books));
    }

}

package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Concretelterator
 * 이는 구체적인 반복자 역할을수행한다
 */
public class BookShelfIterator implements Iterator<Book> {

    public BookShelf bookShelf;
    private int index = 0;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf.clone();
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return bookShelf.getBookAt(index++);
    }

}

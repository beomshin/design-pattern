package iterator;

import java.util.ArrayList;
import java.util.Iterator;

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
        return new BookShelf(new ArrayList<>(books));
    }

}

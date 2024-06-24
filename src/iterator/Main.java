package iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Book1"));
        bookShelf.appendBook(new Book("Book2"));
        bookShelf.appendBook(new Book("Book3"));
        bookShelf.appendBook(new Book("Book4"));

        Iterator<Book> bookIterator = bookShelf.iterator();

        while (bookIterator.hasNext()) {
            Book book = bookIterator.next();
            bookShelf.appendBook(new Book("Book5"));
            System.out.println(book.getName());
        }
        System.out.println();

        for(Book book : bookShelf) {
            System.out.println(book.getName());
        }

        System.out.println();
    }
}

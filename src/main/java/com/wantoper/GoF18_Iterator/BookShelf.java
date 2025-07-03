package com.wantoper.GoF18_Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private List<Book> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}


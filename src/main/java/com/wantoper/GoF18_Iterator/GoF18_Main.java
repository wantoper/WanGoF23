package com.wantoper.GoF18_Iterator;

public class GoF18_Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("西游记"));
        bookShelf.appendBook(new Book("红楼梦"));
        bookShelf.appendBook(new Book("水浒传"));
        bookShelf.appendBook(new Book("三国演绎"));

        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
    }
}

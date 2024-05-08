package com.iesam.digitallibrary.digitalresources.book.domain;

public interface BookRepository {


    void modify(Book book);

    void save(Book book);

    void delete(String isbn);
}

package com.iesam.digitallibrary.digitalresources.book.data;

import com.iesam.digitallibrary.digitalresources.book.data.local.BookLocalDataSource;
import com.iesam.digitallibrary.digitalresources.book.domain.Book;
import com.iesam.digitallibrary.digitalresources.book.domain.BookRepository;


public class BookDataRepository implements BookRepository {

     BookLocalDataSource userLocalDataSource;

    public BookDataRepository(BookLocalDataSource userLocalDataSource) {
        this.userLocalDataSource = userLocalDataSource;
    }


    @Override
    public void modify(Book book) {

    }

    @Override
    public void save(Book book) {

    }

    @Override
    public void delete(String isbn) {

    }
}





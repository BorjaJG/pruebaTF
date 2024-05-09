package com.iesam.digitallibrary.digitalresources.book.data;

import com.iesam.digitallibrary.digitalresources.book.data.local.BookLocalDataSource;
import com.iesam.digitallibrary.digitalresources.book.domain.Book;
import com.iesam.digitallibrary.digitalresources.book.domain.BookRepository;


public class BookDataRepository implements BookRepository {

     BookLocalDataSource bookLocalDataSource;

    public BookDataRepository(BookLocalDataSource bookLocalDataSource) {
        this.bookLocalDataSource = bookLocalDataSource;
    }


    @Override
    public void modify(Book book) {
     bookLocalDataSource.ModifyBookUserCase(book);


    }

    @Override
    public void save(Book book) {
        bookLocalDataSource.NewBookUseCase(book);
    }

    @Override
    public void delete(String isbn){
        bookLocalDataSource.DeleteBookUserCase(isbn);
    }
}





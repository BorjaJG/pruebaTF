package com.iesam.digitallibrary.digitalresources.book.data.local;

import com.iesam.digitallibrary.digitalresources.book.domain.Book;

public interface BookLocalDataSource {


    void  NewBookUseCase(Book book);
    void DeleteBookUserCase(String id);
    void ModifyBookUserCase(Book book);





}

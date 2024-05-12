package com.iesam.digitallibrary.digitalresources.domain.book.data.local;

import com.iesam.digitallibrary.digitalresources.domain.book.domain.Book;

public interface BookLocalDataSource {


    void newBookUseCase(Book book);

    void deleteBookUserCase(String id);

    void modifyBookUserCase(Book book);


}

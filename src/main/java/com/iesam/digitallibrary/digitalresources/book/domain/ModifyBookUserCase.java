package com.iesam.digitallibrary.digitalresources.book.domain;

public class ModifyBookUserCase {

    private BookRepository bookRepository;

    public ModifyBookUserCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void modify(Book book){bookRepository.modify(book);
    }
}

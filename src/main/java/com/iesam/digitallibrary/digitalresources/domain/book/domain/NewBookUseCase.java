package com.iesam.digitallibrary.digitalresources.domain.book.domain;

public class NewBookUseCase {
    private BookRepository bookRepository;


    public NewBookUseCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void execute(Book book){
        this.bookRepository.save(book);
    }
}

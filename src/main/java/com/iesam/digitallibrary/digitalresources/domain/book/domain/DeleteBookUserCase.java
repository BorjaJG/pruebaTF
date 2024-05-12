package com.iesam.digitallibrary.digitalresources.domain.book.domain;

public class DeleteBookUserCase {

    public BookRepository bookRepository;

    public DeleteBookUserCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public void execute(String idDigitalResource) {
        this.bookRepository.delete(idDigitalResource);
    }
}

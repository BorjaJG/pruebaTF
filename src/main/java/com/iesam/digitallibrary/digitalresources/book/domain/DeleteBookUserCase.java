package com.iesam.digitallibrary.digitalresources.book.domain;

public class DeleteBookUserCase {

    public BookRepository bookRepository;

    public DeleteBookUserCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public void execute(String isbn) {
        this.bookRepository.delete(isbn);
    }
}

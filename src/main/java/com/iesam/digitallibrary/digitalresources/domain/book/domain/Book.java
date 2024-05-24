package com.iesam.digitallibrary.digitalresources.domain.book.domain;

import com.iesam.digitallibrary.digitalresources.domain.DigitalResource;

public class Book extends DigitalResource {

    public final String title;
    public final String author;
    public final String publicationDate;
    public final String isbn;



    public Book(String idDigitalResource, String title, String author, String publicationDate) {
        super(idDigitalResource);
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.isbn = idDigitalResource;

    }




    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

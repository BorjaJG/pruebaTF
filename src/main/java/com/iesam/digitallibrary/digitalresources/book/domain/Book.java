package com.iesam.digitallibrary.digitalresources.book.domain;

public class Book {

    public final String title;
    public final String author;
    public final String publicationDate;
    public final String isbn;

    public Book(String title, String author, String publicationDate, String isbn) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.isbn = isbn;
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

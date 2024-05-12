package com.iesam.digitallibrary.digitalresources.domain.book.data.local;


import com.iesam.digitallibrary.digitalresources.domain.book.domain.Book;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BookMemLocalDataSource {

    private Map<String, Book> dataStore = new TreeMap<>();
    private static BookMemLocalDataSource instance=null;
    public BookMemLocalDataSource newInstance(){
        if(instance== null){
            instance= new BookMemLocalDataSource();
        }
        return instance;
    }

    public void save(Book book) {
        dataStore.put(book.isbn, book);
    }

    public void saveList(List<Book> books) {
        for (Book book : books) {
            save(book);
        }
    }

    public Book findById(String id) {
        return dataStore.get(id);
    }

    public List<Book> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String id) {
        dataStore.remove(id);
    }
}

package com.iesam.digitallibrary.digitalresources.book.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.digitallibrary.digitalresources.book.domain.Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BookFileLocalDataSource implements BookLocalDataSource {

    private String nameFile = "LibrosListado.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Book>>() {
    }.getType();

    public void NewBookUseCase(Book book) {
        List<Book> books = findAll();
        books.add(book);
        saveToFile(books);

    }

    @Override
    public void DeleteBookUserCase(String id) {
        List<Book> newList = new ArrayList<>();
        List<Book> models = findAll();
        for (Book model : models) {
            if (model.isbn != id) {
                newList.add(model);
            }
        }
        saveList(newList);
    }

    @Override
    public void ModifyBookUserCase(Book book) {

    }

    public void saveList(List<Book> books) {
        saveToFile(books);
    }

    private void saveToFile(List<Book> books) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(books));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }

    public Book findById(String id) {
        List<Book> books = findAll();
        for (Book model : books) {
            if (Objects.equals(model.isbn, id)) {
                return model;
            }
        }
        return null;
    }

    public ArrayList<Book> findAll() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }


}
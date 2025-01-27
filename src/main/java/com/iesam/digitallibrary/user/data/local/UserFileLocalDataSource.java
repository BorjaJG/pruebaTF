package com.iesam.digitallibrary.user.data.local;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.digitallibrary.user.domain.User;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
public class UserFileLocalDataSource  implements UserLocalDataSource {

    private String nameFile = "Biblioteca.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<User>>() {
    }.getType();

    public boolean save(User user) {
        List<User> users = findAll();
        users.add(user);
        saveToFile(users);
        return false;
    }

    public void saveList(List<User> users) {
        saveToFile(users);
    }

    private void saveToFile(List<User> users) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(users));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }

    public User findById(String id) {
        List<User> user = findAll();
        for (User model : user) {
            if (Objects.equals(model.userID, id)) {
                return model;
            }
        }
        return null;
    }

    public ArrayList<User> findAll() {
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

    public void delete(String userId) {
        List<User> newList = new ArrayList<>();
        List<User> models = findAll();
        for (User model : models) {
            if (model.userID!= userId) {
                newList.add(model);
            }
        }
        saveList(newList);
    }

    @Override
    public void modifyUser(User user) {

    }
}
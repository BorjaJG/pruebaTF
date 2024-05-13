package com.iesam.digitallibrary.loan.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.digitallibrary.digitalresources.domain.DigitalResource;
import com.iesam.digitallibrary.loan.domain.Loan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
public class LoanFileLocalDataSource implements LoanLocalDataSource {

    private String nameFile = "Loan.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Loan>>() {
    }.getType();

    public void save(Loan loan) {
        List<Loan> loans = findAll();
        loans.add(loan);
        saveToFile(loans);

    }

    public void saveList(List<Loan> loans) {
        saveToFile(loans);
    }

    private void saveToFile(List<Loan> loans) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(loans));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }

    public Loan findById(String id) {
        List<Loan> loans = findAll();
        for (Loan loan : loans) {
            if (Objects.equals(loan.idLoan, id)) {
                return loan;
            }
        }
        return null;
    }

    public ArrayList<Loan> findAll() {
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
package com.iesam.digitallibrary.loan.domain;

import com.iesam.digitallibrary.digitalresources.domain.DigitalResource;
import com.iesam.digitallibrary.digitalresources.domain.book.domain.Book;
import com.iesam.digitallibrary.user.domain.User;

public class Loan {


    public final String idLoan;
    public final DigitalResource digitalResource;
    public final User user;
    public final String fechaI;
    public final String fechaF;
    public final String fechaE;

    public Loan(String idLoan, DigitalResource digitalResource, User user, String fechaI, String fechaF, String fechaE) {
        this.idLoan = idLoan;
        this.digitalResource = digitalResource;
        this.user = user;
        this.fechaI = fechaI;
        this.fechaF = fechaF;
        this.fechaE = fechaE;
    }

    @Override
    public String toString() {
        return "Loan{" + "idLoan='" + idLoan + '\'' + ", DigitalResource=" + digitalResource + ", user=" + user + ", fechaI='" + fechaI + '\'' + ", fechaF='" + fechaF + '\'' + ", fechaE='" + fechaE + '\'' + '}';
    }
}

package com.iesam.digitallibrary.loan.domain;

public interface LoanRepository {
    void save(Loan loan);

    void deleteLoan(String idLoan);
}

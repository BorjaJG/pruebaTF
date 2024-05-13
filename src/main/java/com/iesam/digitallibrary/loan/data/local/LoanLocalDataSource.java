package com.iesam.digitallibrary.loan.data.local;

import com.iesam.digitallibrary.loan.domain.Loan;


public interface LoanLocalDataSource {

    void save(Loan loan);

    void delete(String idLoan);





}

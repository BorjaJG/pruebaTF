package com.iesam.digitallibrary.loan.data;

import com.iesam.digitallibrary.loan.data.local.LoanFileLocalDataSource;
import com.iesam.digitallibrary.loan.data.local.LoanLocalDataSource;
import com.iesam.digitallibrary.loan.domain.Loan;

public class LoanDataRepository implements LoanLocalDataSource {
    LoanLocalDataSource loanLocalDataSource;

    public LoanDataRepository(LoanFileLocalDataSource loanFileLocalDataSource) {
        this.loanLocalDataSource = loanFileLocalDataSource;
    }

    @Override
    public void save(Loan loan) {
        loanLocalDataSource.save(loan);
    }
}

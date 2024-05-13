package com.iesam.digitallibrary.loan.domain;

public class DeleteLoanUseCase {

    private LoanRepository loanRepository;

    public DeleteLoanUseCase(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    private void execute(String idLoan){
        this.loanRepository.deleteLoan(idLoan);
    }
}

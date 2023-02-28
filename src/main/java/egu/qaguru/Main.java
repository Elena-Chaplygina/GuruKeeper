package egu.qaguru;

import egu.qaguru.db.AccountRepository;
import egu.qaguru.db.impl.PostgresAccountRepository;
import egu.qaguru.entity.AccountEntity;

import javax.swing.*;

public class Main {
    static AccountRepository accountRepository = new PostgresAccountRepository();

    public static void main(String[] args) {
        String accountName = JOptionPane.showInputDialog("Представьтесь, пожалуйста");

        AccountEntity workAccount = accountRepository.getByName(accountName);
        if (workAccount == null) {
            int balance = Integer.parseInt(JOptionPane.showInputDialog("Введите баланс:"));
            AccountEntity account = new AccountEntity().setName(accountName).setValue(balance);
            accountRepository.addAccount(account);

        }


    }

}
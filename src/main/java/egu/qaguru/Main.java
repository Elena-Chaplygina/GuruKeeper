package egu.qaguru;

import egu.qaguru.db.AccountRepository;
import egu.qaguru.db.impl.PostgresAccountRepository;
import egu.qaguru.service.Application;

public class Main {
    static AccountRepository accountRepository = new PostgresAccountRepository();

    public static void main(String[] args) {
        new Application().run();
    }


}


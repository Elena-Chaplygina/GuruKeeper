package egu.qaguru;

import egu.qaguru.db.AccountRepository;
import egu.qaguru.db.impl.PostgresAccountRepository;
import egu.qaguru.service.Application;

public class Main {

    public static void main(String[] args) {
        new Application().run();
    }


}


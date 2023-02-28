package egu.qaguru.db;

import egu.qaguru.entity.AccountEntity;

import java.util.List;

public interface AccountRepository {
    List<AccountEntity> getAll();
    AccountEntity getByName(String accountName);
    void addAccount(AccountEntity account);

}

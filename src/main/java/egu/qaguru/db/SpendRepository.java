package egu.qaguru.db;

import egu.qaguru.entity.AccountEntity;
import egu.qaguru.entity.SpendEntity;

import java.util.List;

public interface SpendRepository {
    List<SpendEntity> getAllForAccount(AccountEntity account);

    void addSpend(SpendEntity spend);

}

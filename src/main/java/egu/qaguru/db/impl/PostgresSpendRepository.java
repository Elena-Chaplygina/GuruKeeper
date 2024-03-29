package egu.qaguru.db.impl;

import egu.qaguru.db.DataSourceProvider;
import egu.qaguru.db.SpendEntityRowMapper;
import egu.qaguru.db.SpendRepository;
import egu.qaguru.entity.AccountEntity;
import egu.qaguru.entity.SpendEntity;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PostgresSpendRepository implements SpendRepository {
    private static final JdbcTemplate template =
            new JdbcTemplate(DataSourceProvider.INSTANCE.getDataSource());

    @Override
    public List<SpendEntity> getAllForAccount(AccountEntity account) {

        return template.query("SELECT * FROM spend WHERE account_id =?",
                new SpendEntityRowMapper(), account.getId());


    }

    @Override
    public void addSpend(SpendEntity spend) {
        template.update("INSERT INTO spend (account_id, spend_category, spend, description) values (?, ?, ?,?)",
                spend.getAccountId(),
                spend.getSpendCategory().toString(),
                spend.getSpend(),
                spend.getDescription());


    }
}

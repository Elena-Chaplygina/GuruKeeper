package egu.qaguru.db;

import egu.qaguru.entity.AccountEntity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountEntityRowMapper implements RowMapper<AccountEntity> {
    @Override
    public AccountEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new AccountEntity()
                .setId(rs.getInt("id"))
                .setName(rs.getString("name"))
                .setValue(rs.getInt("value"));
    }






}

package com.example.restservice.repository;

import com.example.restservice.model.Alert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AlertRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    static class NoticeRowMapper implements RowMapper<Alert> {
        @Override
        public Alert mapRow(ResultSet rs, int rowNum) throws SQLException {
            Alert student = new Alert();
            student.setName(rs.getString("name"));
            return student;
        }
    }
    public List<Alert> findAll() {
        return jdbcTemplate.query("select * from ALERTS", new NoticeRowMapper());
    }

}

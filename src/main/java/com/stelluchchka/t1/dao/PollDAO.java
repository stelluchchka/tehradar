package com.stelluchchka.t1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.stelluchchka.t1.models.Poll;

import java.util.List;

@Component
public class PollDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PollDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Poll> index() {
        return jdbcTemplate.query("SELECT * FROM polls", new BeanPropertyRowMapper<>(Poll.class));
    }

//    public void save(Poll poll) {
//        jdbcTemplate.update("INSERT INTO Polls VALUES(1, ?, ?, ?)", poll.getName(), poll.getAge(),
//                poll.getEmail());
//    }

}
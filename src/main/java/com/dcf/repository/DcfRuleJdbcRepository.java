package com.dcf.repository;

import com.dcf.domain.DcfRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DcfRuleJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public DcfRule findById(Long id){
        return jdbcTemplate.queryForObject("select id, rule_Name from DCF_RULE where id = ?",new Object[]{id}, new BeanPropertyRowMapper<>(DcfRule.class));
    }
}

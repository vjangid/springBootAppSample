package com.dcf.service;

import com.dcf.domain.DcfRule;
import com.dcf.repository.DcfRuleJdbcRepository;
import com.dcf.repository.DcfRulePagingAndSortingRepository;
import com.dcf.repository.DcfRuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class DcfRuleServiceImpl implements DcfRuleService {

    @Autowired
    DcfRuleRepository ruleRepository;
    @Autowired
    DcfRulePagingAndSortingRepository pagingAndSortingRepository;

    @Autowired
    DcfRuleJdbcRepository jdbcRepository;

    @Override
    public Optional<DcfRule> get(String id) {
        //return ruleRepository.findById(Long.parseLong(id));
        return Optional.of(jdbcRepository.findById(Long.parseLong(id)));
    }

    @Override
    public DcfRule add(DcfRule check) {
        return ruleRepository.save(check);
    }

    @Override
    public void delete(String id) {
        ruleRepository.deleteById(Long.parseLong(id));
    }

    @Override
    public DcfRule update(DcfRule check) {
        return ruleRepository.save(check);
    }

    @Override
    public Collection<DcfRule> lisDcfRule(int startPage, int endPage) {
        Page<DcfRule> all = pagingAndSortingRepository.findAll(new PageRequest(startPage, endPage));
        return all.getContent();
    }
}

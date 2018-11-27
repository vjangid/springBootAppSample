package com.dcf.service;

import com.dcf.domain.DcfRule;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public interface DcfRuleService {

    public Optional<DcfRule> get(String id);

    public DcfRule add(DcfRule check);

    public void delete(String id);

    public DcfRule update(DcfRule check);

    public Collection<DcfRule> lisDcfRule(int startPage, int endPage);
}

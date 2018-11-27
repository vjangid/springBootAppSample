package com.dcf.repository;

import com.dcf.domain.DcfRule;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DcfRuleRepository extends CrudRepository<DcfRule, Long> {

    public Optional<DcfRule> findById(Long id);
}

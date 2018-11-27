package com.dcf.repository;

import com.dcf.domain.DcfRule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface DcfRulePagingAndSortingRepository extends CrudRepository<DcfRule, Long> {

    public Iterable<DcfRule> findAll(Sort sort);

    public Page<DcfRule> findAll(Pageable pageable);
}

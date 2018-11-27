package com.dcf.service;

import com.dcf.domain.DcfCheck;
import com.dcf.domain.DcfRule;
import com.dcf.repository.DcfCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DcfCheckServiceImpl implements DcfCheckService {

    @Autowired DcfCheckRepository checkRepository;
    @Autowired DcfRuleService ruleService;

    @Override
    public List<DcfCheck> get(String id) {
        return checkRepository.findById(Long.parseLong(id));
    }

    @Transactional
    @Override
    public DcfCheck add(DcfCheck check) {
        return checkRepository.save(check);
    }

    @Transactional
    @Override
    public void delete(String id) {
        DcfCheck check = checkRepository.findById(Long.parseLong(id)).stream().findFirst().get();
        checkRepository.delete(check);
    }

    @Transactional
    @Override
    public DcfCheck update(DcfCheck check) {
        return checkRepository.save(check);
    }

    @Override
    public Long countByActiveStatus(boolean active) {
        return checkRepository.countByActive(active);
    }


}

package com.dcf.controller;

import com.dcf.domain.DcfRule;
import com.dcf.service.DcfRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;
import java.util.Optional;

@RestController
public class RuleControllerImpl implements RuleController {

    @Autowired
    DcfRuleService ruleService;

    @Override
    public DcfRule get(@PathVariable Optional<String> id) {
        System.out.println("start");
        if (id !=null && !id.get().isEmpty())
            return ruleService.get(id.get()).get();
        return null;
    }

    @Override
    public DcfRule add(DcfRule check) {
        return ruleService.add(check);
    }

    @Override
    public void delete(String id) {
        ruleService.delete(id);
    }

    @Override
    public DcfRule update(DcfRule check) {
        return ruleService.update(check);
    }
}

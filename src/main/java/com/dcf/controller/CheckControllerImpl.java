package com.dcf.controller;

import com.dcf.domain.DcfCheck;
import com.dcf.service.DcfCheckService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CheckControllerImpl implements CheckController
 {

    @Autowired
    DcfCheckService checkService;

    @Override
    public List<DcfCheck> get(@PathVariable Optional<String> id) {
        System.out.println("start");
        if (id !=null && !id.get().isEmpty())
            return checkService.get(id.get());
        return Lists.newArrayList();
    }

    @Override
    public DcfCheck add(@RequestBody DcfCheck check) {
        return checkService.add(check);
    }

    @Override
    public void delete(@PathVariable String id) {
        checkService.delete(id);
    }

    @Override
    public DcfCheck update(@RequestBody DcfCheck check) {
        return checkService.update(check);
    }
}

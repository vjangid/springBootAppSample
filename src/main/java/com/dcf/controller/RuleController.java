package com.dcf.controller;

import com.dcf.domain.DcfRule;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public interface RuleController {

    @GetMapping("/rule/{id}")
    public DcfRule get(@PathVariable Optional<String> id);

    @PostMapping("/rule")
    public DcfRule add(@RequestBody DcfRule check);

    @DeleteMapping("/rule/{id}")
    public void delete(@PathVariable("id") String id);

    @PutMapping("/rule")
    public DcfRule update(@RequestBody DcfRule check);
}

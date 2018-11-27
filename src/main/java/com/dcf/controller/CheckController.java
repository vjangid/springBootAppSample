package com.dcf.controller;

import com.dcf.domain.DcfCheck;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public interface CheckController {

    @GetMapping("/check/{id}")
    public List<DcfCheck> get(@PathVariable Optional<String> id);

    @PostMapping("/check")
    public DcfCheck add(@RequestBody DcfCheck check);

    @DeleteMapping("/check/{id}")
    public void delete(@PathVariable("id") String id);

    @PutMapping("/check")
    public DcfCheck update(@RequestBody DcfCheck check);
}

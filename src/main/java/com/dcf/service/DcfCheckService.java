package com.dcf.service;

import com.dcf.domain.DcfCheck;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DcfCheckService {

    public List<DcfCheck> get(String id);

    public DcfCheck add(DcfCheck check);

    public void delete(String id);

    public DcfCheck update(DcfCheck check);

    public Long countByActiveStatus(boolean active);
}

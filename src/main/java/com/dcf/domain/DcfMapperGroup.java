package com.dcf.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter @Setter
public class DcfMapperGroup extends BaseEntity{

    private String mapperGroupName;
    @OneToMany
    private List<DcfMapper> mappers;
}

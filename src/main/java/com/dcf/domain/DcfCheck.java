package com.dcf.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Cacheable
public class DcfCheck extends BaseEntity{

    private String checkName;
    private boolean active;
    private String ownerName;
    @OneToOne
    private DcfRule parentRule;

}

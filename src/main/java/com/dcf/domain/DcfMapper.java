package com.dcf.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter @Setter
public class DcfMapper extends BaseEntity{

    private String lhsColumnName;
    private String rhsColumnName;
    //condition type
    //tolerance
    //diffor
}

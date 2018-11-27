package com.dcf.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalTime;

@Entity
@Getter @Setter
public class DcfExecution extends BaseEntity {

    private LocalTime executionStart;
    private LocalTime executionEnd;
    //placeholder group
    //override rule
}

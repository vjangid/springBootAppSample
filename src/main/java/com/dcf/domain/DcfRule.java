package com.dcf.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
@Getter @Setter
@NoArgsConstructor
public class DcfRule extends BaseEntity{

    private String ruleName;
    //TODO check how can we achieve this
    @ManyToOne(fetch = FetchType.LAZY)
    private DcfRule parentRule;
    private boolean aggregation;
    private boolean active;

}

package com.dcf.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
public class DcfPlaceholderGroup extends BaseEntity {

    private String name;
   @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
   @JoinColumn(name = "id")
    private List<DcfPlaceholder> placeholders;
}

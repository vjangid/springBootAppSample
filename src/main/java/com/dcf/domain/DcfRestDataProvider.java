package com.dcf.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.lang.reflect.Constructor;

@Entity
@Getter @Setter
@DiscriminatorValue("REST")
public class DcfRestDataProvider extends DcfDataProvider{

}

package com.nit.miniprojectcurdoperation.model;

import lombok.Data;
import org.hibernate.annotations.Columns;

import javax.persistence.*;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer empno;
    private String ename;
    private String job;
    private Float sal;

}

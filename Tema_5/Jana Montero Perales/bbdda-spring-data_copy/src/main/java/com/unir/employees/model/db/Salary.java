package com.unir.employees.model.db;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name="salaries")
@IdClass(SalaryId.class)
@Data
public class Salary {

    @Id
    @ManyToOne
    @JoinColumn(name = "emp_no")
    private Employee employee;

    @Id
    @Column(name="from_date")
    @Temporal(TemporalType.DATE)
    private Date fromDate;

    @Column(name="to_date")
    @Temporal(TemporalType.DATE)
    private Date toDate;

    @Column
    private Integer salary;
}

@Data
class SalaryId implements Serializable {
    private Integer employee;
    private Date fromDate;
}
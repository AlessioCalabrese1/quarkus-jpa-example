package com.techgeeknext.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;



@Entity
@Table(name = "employee")
public class Employee extends PanacheEntity {

    @Column(name = "emp_name")
    private String name;

    @Column(name = "emp_role")
    private String role;

    public Employee(){}

    public Employee(String _name, String _role){
        setName(_name);
        setRole(_role);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

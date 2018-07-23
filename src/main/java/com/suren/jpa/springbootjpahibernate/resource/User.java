package com.suren.jpa.springbootjpahibernate.resource;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    @Id
    private Integer id;
    private String name;
    private String salary;
    private String teamName;

    public User(Integer id, String name, String salary, String teamName) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.teamName = teamName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}

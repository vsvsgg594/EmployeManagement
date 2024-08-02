package com.emp.emp.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class Emp {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String department;
    private String dp;
    private String jd;
    private String salary;
    private String email;
    private String password;
    private String role;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDp() {
        return dp;
    }
    public void setDp(String dp) {
        this.dp = dp;
    }
    public String getJd() {
        return jd;
    }
    public void setJd(String jd) {
        this.jd = jd;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Emp() {
    }
    

    public Emp(int id, String name, String department, String dp, String jd, String salary, String email,
            String password, String role) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.dp = dp;
        this.jd = jd;
        this.salary = salary;
        this.email = email;
        this.password = password;
        this.role = role;
    }
    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", department=" + department + ", dp=" + dp + ", jd=" + jd
                + ", salary=" + salary + ", email=" + email + ", password=" + password + "]";
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    

    
}

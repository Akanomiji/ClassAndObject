/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classandobject;

/**
 *
 * @author com4936
 */
public class Employee {
    private String id,name,sex;
    
    private int salary;

    public Employee(String id,String name,String sex,int salary) {
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.salary=salary;
    }

    
    
    public void setId(String id) {
        this.id=id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setSex(String sex) {
        this.sex=sex;
    }
    public void setSalary(int salary) {
        this.salary=salary;
    }
    public String getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public int getSalary(){
        return salary;
    }

    void print() {
        System.out.println(getId()+", "+getName()+", "+getSex()+", "+getSalary());
    }
}

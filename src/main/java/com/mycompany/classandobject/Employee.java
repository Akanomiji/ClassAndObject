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
    private String id, name;        // Encapsulation
    private String sex;
    private int salary;
    private int raiseSalary;
    private int totalSalary;
    public Employee()               // Construtor Method
    {
    
    }
    
    
    
    public Employee(String id ,String name ,String sex , int salary)
    {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }
    
    public void setID(String id)
    {
        this.id = id;                 //Polymorphism
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setSex(String sex)
    {
        this.sex = sex;
    }
    
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    
    public void raiseSalary(int raiseSalary)
    {
        this.raiseSalary = raiseSalary;
    }
    public void totalSalary(int totalSalary)
    {
        this.totalSalary = totalSalary;
    }
    public String getID()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getSex()
    {
        return sex;
    }
    
    public int getSalary()
    {
        return salary;
    }
    
   public int getRaiseSalary(){
        
        return salary + (salary * raiseSalary/100);
    }
    
    public void print()
    {
        System.out.print( id + "\t" + name + "\t" + sex + "\t" + salary );
    }
    
    public void printSalary(int raiseSalary)
    {
        this.raiseSalary = raiseSalary;
        System.out.println( id + "\t" + name + "\t" + sex + "\t" + (salary + (salary * raiseSalary/100))+"\t");
    }
    
     
    
    public void getTotalSalary(){
        
        System.out.println("TotalSalary"+ (salary+totalSalary));
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classandobject;

import java.util.Scanner;


public class EmployeeTest {
    public static void main(String[] args){
//        Employee emp = new Employee("0001","JJ","M",20000);
          
//        Employee emp = InputData();
//        System.out.println(emp.getId()+", "+emp.getName()+", "+emp.getSex()+", "+emp.getSalary());
          Employee[] emp = new Employee[5];
          emp[0] = new Employee("0001","Mon","F",20000);
    }
    
    public static Employee InputData() {
        Scanner scan = new Scanner(System.in);
        //Employee employee = new Employee();
//        employee.id=scan.next();
//        employee.name=scan.next();
//        employee.sex=scan.next();
//        employee.salary=scan.nextInt();
//        employee.setId(scan.next());
//        employee.setName(scan.next());
//        employee.setSex(scan.next());
//        employee.setSalary(scan.nextInt());
//        return employee;
    }
}

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
          emp[1] = new Employee("0002","Dom","M",402336);
          emp[2] = new Employee("0003","Fon","F",15000);
          emp[3] = new Employee("0004","Ton","M",5000);
          emp[4] = new Employee("0005","Zon","M",1000);
          for(int i = 0;i < emp.length;i++)
        {
            emp[i].print();
        }       
    
    }
    
    public static Employee InputData() {
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();
        employee.setID(scan.next());
        employee.setName(scan.next());
        employee.setSex(scan.next());
        employee.setSalary(scan.nextInt());
        //employee.id = scan.next();
        //employee.name = scan.next();
        //employee.sex = scan.next();
        //employee.salary = scan.nextInt();
        return employee;
    }
}

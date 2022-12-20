package com.example.TestSidekickSpringLimit.Domain;

import com.example.TestSidekickSpringLimit.Data.Employee;
import com.example.TestSidekickSpringLimit.Data.Employees;
import org.springframework.stereotype.Repository;


@Repository
public class EmployeeDAO {
    public static Employees list= new Employees();

    static
    {
        list.getEmployeeList().add(
                new Employee(
                        1,
                        "Name1",
                        "Last1",
                        "name1@gmail.com"));

        list.getEmployeeList().add(
                new Employee(
                        2,
                        "Name2",
                        "Last2",
                        "name2@gmail.com"));

        list.getEmployeeList().add(
                new Employee(
                        3,
                        "Name3",
                        "Last3",
                        "name3@gmail.com"));

    }

    public Employees getAllEmployees()
    {return list;}

    public void addEmployee(Employee employee)
    {list.getEmployeeList().add(employee);}
}
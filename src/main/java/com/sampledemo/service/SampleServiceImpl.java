package com.sampledemo.service;

import com.sampledemo.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class SampleServiceImpl implements SampleService{
    @Override
    public List<Employee> getEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee();
        employee.setEmpId(10000);
        employee.setEmpname("AAAAA");
        employee.setSalary(1000000);
        employee.setJoinedDate(new Date());
        employee.setAddress("London");
        employeeList.add(employee);
        Employee employee2 = new Employee();
        employee2.setEmpId(10001);
        employee2.setEmpname("BBBBB");
        employee2.setSalary(1000000);
        employee2.setJoinedDate(new Date());
        employee2.setAddress("HongKong");
        employeeList.add(employee2);
        Employee employee3 = new Employee();
        employee3.setEmpId(10002);
        employee3.setEmpname("CCCCC");
        employee3.setSalary(1000000);
        employee3.setJoinedDate(new Date());
        employee3.setAddress("Malaysia");
        employeeList.add(employee3);
        Employee employee4 = new Employee();
        employee4.setEmpId(10003);
        employee4.setEmpname("DDDDD");
        employee4.setSalary(1000000);
        employee4.setJoinedDate(new Date());
        employee4.setAddress("Singapore");
        employeeList.add(employee4);
        Employee employee5 = new Employee();
        employee5.setEmpId(10004);
        employee5.setEmpname("EEEEE");
        employee5.setSalary(1000000);
        employee5.setJoinedDate(new Date());
        employee5.setAddress("India");
        employeeList.add(employee5);
        Employee employee6 = new Employee();
        employee6.setEmpId(10005);
        employee6.setEmpname("FFFFF");
        employee6.setSalary(1000000);
        employee6.setJoinedDate(new Date());
        employee6.setAddress("America");
        employeeList.add(employee6);
        Employee employee7 = new Employee();
        employee7.setEmpId(10006);
        employee7.setEmpname("GGGGG");
        employee7.setSalary(1000000);
        employee7.setJoinedDate(new Date());
        employee7.setAddress("Russia");
        employeeList.add(employee7);
        return employeeList;
    }
}

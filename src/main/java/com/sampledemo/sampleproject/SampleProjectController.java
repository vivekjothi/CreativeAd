package com.sampledemo.sampleproject;

import com.sampledemo.entity.Employee;
import com.sampledemo.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleProjectController {

    @Autowired
    private SampleService sampleService;

    @GetMapping(value = "/sample/employees")
    public List<Employee> getEmployees(){
        return sampleService.getEmployees();
    }
}

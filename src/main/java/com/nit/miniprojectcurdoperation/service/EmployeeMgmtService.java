package com.nit.miniprojectcurdoperation.service;

import com.nit.miniprojectcurdoperation.model.Employee;
import com.nit.miniprojectcurdoperation.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class EmployeeMgmtService {
    @Autowired
    IEmployeeRepo repo;

    public List<Employee> getAllEmployee(){
        List<Employee> allemp=repo.findAll();
        System.out.println("Service class return object:: "+allemp);
            return allemp;

    }

    public String registerEmployee(Employee employee){
       int id=repo.save(employee).getEmpno();
       return "Employee is saved with the id values ::"+id;
    }

    public Employee getEmployeeByNo(int no){
        Employee employee=repo.findById(no).get();
        return employee;
    }

    public String editEmployee(Employee emp){
        int no=repo.save(emp).getEmpno();
        return no+" Employee is updated!!!";
    }

    public String deleteEmployee(int no){
        repo.deleteById(no);
        return no+" Employee number is deleted successfully ";
    }

}

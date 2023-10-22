package com.nit.miniprojectcurdoperation.repository;

import com.nit.miniprojectcurdoperation.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee,Integer> {

}

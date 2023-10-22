package com.nit.miniprojectcurdoperation.controller;

import com.nit.miniprojectcurdoperation.model.Employee;
import com.nit.miniprojectcurdoperation.service.EmployeeMgmtService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeMgmtService service;

    @RequestMapping("/")
    public String gethome() {
        return "home";
    }

    @RequestMapping("/report")
    public String showEmpReport(Map<String, Object> map) {
        List<Employee> list = service.getAllEmployee();
        map.put("empsData", list);
        return "employee_report";
    }

    @GetMapping("/add")
    public String showAddEmployeeForm(@ModelAttribute("emp") Employee emp) {
        emp.setJob("CLERK");
        return "employee_register";

    }

    @PostMapping("/add")
    public String addEmployee(RedirectAttributes attrs, @ModelAttribute("emp") Employee emp) {
        String result = service.registerEmployee(emp);
        attrs.addFlashAttribute("resultMsg", result);
        return "redirect:report";

    }

    @GetMapping("edit")
    public String editEmployee(@RequestParam("no") int no, @ModelAttribute("emp") Employee emp) {
        Employee emp1 = service.getEmployeeByNo(no);
        BeanUtils.copyProperties(emp1, emp);
        return "employee_edit";
    }
    @PostMapping("/edit")
    public String updateEmployee(Map<String, Object> map,@ModelAttribute("emp") Employee emp){
        String result=service.editEmployee(emp);
        List<Employee> list = service.getAllEmployee();
        map.put("resultMsg", result);
        map.put("empsData", list);
        return "employee_report";
    }
@GetMapping("/delete")
    public String deleteEmployee(@RequestParam("no") int no, Map<String, Object> map){
        String result=service.deleteEmployee(no);
        List<Employee> list = service.getAllEmployee();
        map.put("resultMsg", result);
        map.put("empsData", list);
        return "employee_report";

    }


}

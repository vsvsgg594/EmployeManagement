package com.emp.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.emp.emp.Repo.EmpRepo;
import com.emp.emp.entity.Emp;

import ch.qos.logback.core.model.Model;

@Controller
public class AppController {

    @Autowired
    private EmpRepo empRepo;

    @GetMapping("/")
    public String homePage(){
        return "index";
    }
    @GetMapping("/loadEmp")
    public String loadEmpSave(org.springframework.ui.Model model){
        List<Emp> emp=empRepo.findAll();
        model.addAttribute("emp", emp);
        System.out.println(emp);
        return "loadEmp";
        

    }

    @GetMapping("/showform")
    public String showForm(){
        return "showform";
    }

    @PostMapping("/saveEmp")
    public String saveForm(Model Model,Emp emp){
        Emp emp1=empRepo.save(emp);

        return "redirect:/loadEmp";

    }

    @GetMapping("deleteEmp/{id}")
    public String deleteEmp(@PathVariable int id){
        empRepo.deleteById(id);
        return "redirect:/loadEmp";
    }
    
    @GetMapping("/updateEmp/{id}")
    public String updateEmp(@PathVariable int id,org.springframework.ui.Model model){

        Emp emp=empRepo.findById(id).get();
        model.addAttribute("emp", emp);
        return "updateEmp";


    }


}

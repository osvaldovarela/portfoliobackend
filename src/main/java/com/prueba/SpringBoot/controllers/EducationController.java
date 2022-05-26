
package com.prueba.SpringBoot.controllers;

import com.prueba.SpringBoot.Interface.IEducationService;
import com.prueba.SpringBoot.models.Education;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/education")

public class EducationController {
    
    @Autowired private IEducationService educationserv;



    @PostMapping("/new")
    public Education save(@RequestBody Education education){
        educationserv.save(education);
        return education;
    }
    

    public void setEducationService(IEducationService educationserv) {
        this.educationserv = educationserv;
    }

    @GetMapping("/")
    @ResponseBody
    public List<Education> list(){
        return educationserv.list();
    }
    @GetMapping("/{id}")
	public Optional<Education> getOne(@PathVariable Long id){
            return educationserv.getOne(id);
             
        }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        educationserv.delete(id);
    }

    @PutMapping("/edit/{id}")
    public Education edit(@PathVariable Long id,@RequestBody Education education){
         educationserv.getOne(id);
        
        education.setPeriodo(education.getPeriodo());
        education.setInstitucion(education.getInstitucion());
        education.setTitulo(education.getTitulo());

        educationserv.save(education);
        return education;
    }
    
}

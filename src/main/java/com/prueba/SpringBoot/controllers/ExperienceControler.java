
package com.prueba.SpringBoot.controllers;

import com.prueba.SpringBoot.Interface.IExperienceService;
import com.prueba.SpringBoot.models.Experience;
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
@RequestMapping("/experience")

public class ExperienceControler {
    
    
    @Autowired private IExperienceService experienceserv;



    @PostMapping("/new")
    public Experience save(@RequestBody Experience experience){
        experienceserv.save(experience);
        return experience;
    }
    

    public void setExperienceService(IExperienceService experienceserv) {
        this.experienceserv = experienceserv;
    }

    @GetMapping("/")
    @ResponseBody
    public List<Experience> list(){
        return experienceserv.list();
    }
    @GetMapping("/{id}")
	public Optional<Experience> getOne(@PathVariable Long id){
            return experienceserv.getOne(id);
             
        }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        experienceserv.delete(id);
    }
    @PutMapping("/edit/{id}")
    public Experience edit(@PathVariable Long id,@RequestBody Experience experience){
         experienceserv.getOne(id);
        
        experience.setPuesto(experience.getPuesto());
        experience.setEmpresa(experience.getEmpresa());
        experience.setPeriodo(experience.getPeriodo());

        experienceserv.save(experience);
        return experience;
    }
}

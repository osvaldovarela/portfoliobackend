
package com.prueba.SpringBoot.controllers;

import com.prueba.SpringBoot.Interface.IProjectService;
import com.prueba.SpringBoot.models.Project;
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
@RequestMapping("/project")

public class ProjectController {
  
    @Autowired private IProjectService projectserv;



    @PostMapping("/new")
    public Project save(@RequestBody Project project){
        projectserv.save(project);
        return project;
    }
    

    public void setProjectService(IProjectService projectserv) {
        this.projectserv = projectserv;
    }

    @GetMapping("/")
    @ResponseBody
    public List<Project> list(){
        return projectserv.list();
    }
    @GetMapping("/{id}")
	public Optional<Project> getOne(@PathVariable Long id){
            return projectserv.getOne(id);
             
        }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        projectserv.delete(id);
    }
    @PutMapping("/edit/{id}")
    public Project edit(@PathVariable Long id,@RequestBody Project project){
         projectserv.getOne(id);
        
        project.setNombre(project.getNombre());
        project.setImagen(project.getImagen());
        project.setEnlace(project.getEnlace());
        project.setDetalle(project.getDetalle());

        projectserv.save(project);
        return project;
    }
}

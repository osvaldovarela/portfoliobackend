
package com.prueba.SpringBoot.services;

import com.prueba.SpringBoot.Interface.IProjectService;
import com.prueba.SpringBoot.models.Project;
import com.prueba.SpringBoot.repositories.IProjectRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProjectService implements IProjectService {
    
     @Autowired
    IProjectRepository projectRepository;

     @Override
    public List<Project> list(){
        return projectRepository.findAll();
    }

     @Override
    public Optional<Project> getOne(Long id){
        return projectRepository.findById(id);
    }

     @Override
    public void  save(Project project){
        projectRepository.save(project);
    }

     @Override
    public void delete(Long id){
        projectRepository.deleteById(id);
    }

     @Override
    public boolean existsById(Long id){
        return projectRepository.existsById(id);
    }
}

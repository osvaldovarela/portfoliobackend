
package com.prueba.SpringBoot.services;

import com.prueba.SpringBoot.Interface.IExperienceService;
import com.prueba.SpringBoot.models.Experience;
import com.prueba.SpringBoot.repositories.IExperienceRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperienceService implements IExperienceService{
    
    @Autowired
    IExperienceRepository experienceRepository;

    @Override
    public List<Experience> list(){
        return experienceRepository.findAll();
    }

    @Override
    public Optional<Experience> getOne(Long id){
        return experienceRepository.findById(id);
    }

    @Override
    public void  save(Experience experience){
        experienceRepository.save(experience);
    }

    @Override
    public void delete(Long id){
        experienceRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Long id){
        return experienceRepository.existsById(id);
    }
}

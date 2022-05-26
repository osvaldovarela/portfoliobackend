
package com.prueba.SpringBoot.services;

import com.prueba.SpringBoot.Interface.IEducationService;
import com.prueba.SpringBoot.models.Education;
import com.prueba.SpringBoot.repositories.IEducationRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpEducationService implements IEducationService {
    
  @Autowired
    IEducationRepository educationRepository;
  @Override
    public List<Education> list(){
        return educationRepository.findAll();
    }

  @Override
    public Optional<Education> getOne(Long id){
        return educationRepository.findById(id);
    }

  @Override
    public void  save(Education education){
        educationRepository.save(education);
    }

  @Override
    public void delete(Long id){
        educationRepository.deleteById(id);
    }

  @Override
    public boolean existsById(Long id){
        return educationRepository.existsById(id);
    }  
    
}

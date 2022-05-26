
package com.prueba.SpringBoot.services;

import com.prueba.SpringBoot.Interface.IAboutService;
import com.prueba.SpringBoot.models.About;
import com.prueba.SpringBoot.repositories.IAboutRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ImpAboutService implements IAboutService {
    
    @Autowired
    IAboutRepository iaboutRepository;

    @Override
    public List<About> list(){
        return iaboutRepository.findAll();
    }

    @Override
    public Optional<About> getOne(Long id){
        return iaboutRepository.findById(id);
    }

    @Override
    public void  save(About about){
        iaboutRepository.save(about);
    }

    @Override
    public void delete(Long id){
        iaboutRepository.deleteById(id);
    }
    
}

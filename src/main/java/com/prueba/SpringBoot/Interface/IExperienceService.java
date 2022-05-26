
package com.prueba.SpringBoot.Interface;

import com.prueba.SpringBoot.models.Experience;
import java.util.List;
import java.util.Optional;


public interface IExperienceService {
    
    public List<Experience> list();
    public Optional<Experience> getOne(Long id);
    public void  save(Experience experience);
    public void delete(Long id);
    public boolean existsById(Long id);
}

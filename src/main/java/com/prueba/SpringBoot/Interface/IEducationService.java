
package com.prueba.SpringBoot.Interface;

import com.prueba.SpringBoot.models.Education;
import java.util.List;
import java.util.Optional;

public interface IEducationService {
    
    public List<Education> list();
    public Optional<Education> getOne(Long id);
    public void  save(Education education);
    public void delete(Long id);
    public boolean existsById(Long id);
}

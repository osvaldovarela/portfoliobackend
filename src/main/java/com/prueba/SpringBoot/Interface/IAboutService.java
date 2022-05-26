
package com.prueba.SpringBoot.Interface;

import com.prueba.SpringBoot.models.About;
import java.util.List;
import java.util.Optional;


public interface IAboutService {
    
    public List<About> list();
    public Optional<About> getOne(Long id);
    public void  save(About about);
    public void delete(Long id);
    
}

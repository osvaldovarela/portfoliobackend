
package com.prueba.SpringBoot.Interface;

import com.prueba.SpringBoot.models.Project;
import java.util.List;
import java.util.Optional;

public interface IProjectService {
 
    public List<Project> list();
    public Optional<Project> getOne(Long id);
    public void  save(Project project);
    public void delete(Long id);
    public boolean existsById(Long id);
}

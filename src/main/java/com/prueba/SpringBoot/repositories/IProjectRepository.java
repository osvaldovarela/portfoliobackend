
package com.prueba.SpringBoot.repositories;

import com.prueba.SpringBoot.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProjectRepository extends JpaRepository <Project, Long> {
    
}

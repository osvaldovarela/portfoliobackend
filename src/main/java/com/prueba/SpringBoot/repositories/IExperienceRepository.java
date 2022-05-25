
package com.prueba.SpringBoot.repositories;

import com.prueba.SpringBoot.models.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IExperienceRepository extends JpaRepository <Experience, Long> {
    
}

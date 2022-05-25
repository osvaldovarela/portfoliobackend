
package com.prueba.SpringBoot.repositories;

import com.prueba.SpringBoot.models.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEducationRepository extends JpaRepository <Education, Long> {
    
}

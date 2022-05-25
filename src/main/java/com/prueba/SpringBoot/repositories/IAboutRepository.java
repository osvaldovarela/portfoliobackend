
package com.prueba.SpringBoot.repositories;

import com.prueba.SpringBoot.models.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAboutRepository extends JpaRepository <About, Long >{
    
}

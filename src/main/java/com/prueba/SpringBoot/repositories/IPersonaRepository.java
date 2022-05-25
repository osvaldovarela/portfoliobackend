
package com.prueba.SpringBoot.repositories;

import com.prueba.SpringBoot.models.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona,Long> {
    @Override
    Optional<Persona> findById(Long id);

    @Override
    Persona getById(Long id);
    
    
}


package com.prueba.SpringBoot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Education {
    
    @Id 
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String institucion;
    private String periodo;
    private String  titulo;

    public Education() {
    }

    public Education(String institucion, String periodo, String titulo) {
        this.institucion = institucion;
        this.periodo = periodo;
        this.titulo = titulo;
    }

      
}

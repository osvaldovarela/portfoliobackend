
package com.prueba.SpringBoot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experience {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long  id;
    private String periodo;
    private String empresa;
    private String puesto;
    
    
    
    
     public Experience() {
    }

    public Experience(String periodo, String empresa, String puesto) {
        this.periodo = periodo;
        this.empresa = empresa;
        this.puesto = puesto;
    }

    

    
}

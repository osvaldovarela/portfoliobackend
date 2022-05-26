
package com.prueba.SpringBoot.controllers;

import com.prueba.SpringBoot.Interface.IAboutService;
import com.prueba.SpringBoot.models.About;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/about")

public class AboutController {
    
    @Autowired private IAboutService aboutserv;

    @PostMapping("/new")
    public About save(@RequestBody About about){
        aboutserv.save(about);
        return about;
    }
    

    public void setAboutserv(IAboutService aboutserv) {
        this.aboutserv = aboutserv;
    }

    @GetMapping("/")
    @ResponseBody
    public List<About> list(){
        return aboutserv.list();
    }
    
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        aboutserv.delete(id);
    }


    @PutMapping("/edit/{id}")
    public About edit(@PathVariable Long id, @RequestBody About about){
        aboutserv.getOne(id);
        about.setText(about.getText());
        aboutserv.save(about);
        return about;
    }
    
}

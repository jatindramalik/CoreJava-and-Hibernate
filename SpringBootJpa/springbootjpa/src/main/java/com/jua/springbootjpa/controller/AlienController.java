package com.jua.springbootjpa.controller;



import java.util.List;
import java.util.Optional;

import com.jua.springbootjpa.dao.AlienRepo;
import com.jua.springbootjpa.model.Alien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }
    @PostMapping("/alien")
    public Alien addAlien(@RequestBody Alien alien){
        repo.save(alien);
        return alien;
    }

    @DeleteMapping("/alien/{aid}")
    public String deleteAlien(@PathVariable int aid){
        Alien a = repo.getOne(aid);
        repo.delete(a);
        return "deleted";


    }
    @GetMapping("/aliens")
    public List<Alien> getAliens(){

        return repo.findAll();
    }
    @RequestMapping("/alien/{aid}")
    public Optional<Alien> getAlien(@PathVariable("aid")int aid){
        return  repo.findById(aid);
    }
    
}

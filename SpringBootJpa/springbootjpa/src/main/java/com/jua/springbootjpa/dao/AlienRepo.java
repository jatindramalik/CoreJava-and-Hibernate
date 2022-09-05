package com.jua.springbootjpa.dao;



import com.jua.springbootjpa.model.Alien;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepo extends JpaRepository<Alien,Integer>{

    
    
}

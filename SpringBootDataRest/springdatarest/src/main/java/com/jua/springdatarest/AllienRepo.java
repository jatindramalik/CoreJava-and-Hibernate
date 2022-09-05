package com.jua.springdatarest;

import com.jua.springdatarest.model.Alien;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource (collectionResourceRel ="aliens",path="aliens")
public interface AllienRepo extends JpaRepository<Alien,Integer> {
    
}

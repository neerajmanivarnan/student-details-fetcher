package com.neeraj.springrest;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface studentRepo  extends JpaRepository<students,Integer>{

    Optional<students> findByName(String name);
    
}

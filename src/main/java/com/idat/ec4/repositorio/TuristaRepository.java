package com.idat.ec4.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ec4.modelo.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer>{

}

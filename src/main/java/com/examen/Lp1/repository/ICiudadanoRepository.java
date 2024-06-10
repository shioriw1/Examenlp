package com.examen.Lp1.repository;

import com.examen.Lp1.model.Ciudadano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICiudadanoRepository extends JpaRepository<Ciudadano, Integer> {
}

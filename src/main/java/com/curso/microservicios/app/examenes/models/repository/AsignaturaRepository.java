package com.curso.microservicios.app.examenes.models.repository;

import com.curso.microservicios.commons.examenes.models.entity.Asignatura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaRepository extends CrudRepository<Asignatura, Long> {

}

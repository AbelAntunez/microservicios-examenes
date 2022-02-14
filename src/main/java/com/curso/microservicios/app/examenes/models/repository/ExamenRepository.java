package com.curso.microservicios.app.examenes.models.repository;


import com.curso.microservicios.commons.examenes.models.entity.Examen;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ExamenRepository extends PagingAndSortingRepository<Examen, Long> {

  @Query("select e from Examen e where e.nombre like %?1%")
  List<Examen> findByNombre(String arg);
}

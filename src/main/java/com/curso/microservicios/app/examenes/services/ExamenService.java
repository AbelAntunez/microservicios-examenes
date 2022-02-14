package com.curso.microservicios.app.examenes.services;

import com.curso.microservicios.commons.examenes.models.entity.Asignatura;
import com.curso.microservicios.commons.examenes.models.entity.Examen;
import com.curso.microservicios.commons.services.CommonService;
import java.util.List;

public interface ExamenService extends CommonService<Examen> {

  List<Examen> findByNombre(String arg);
  List<Asignatura> findAllAsignaturas();
}

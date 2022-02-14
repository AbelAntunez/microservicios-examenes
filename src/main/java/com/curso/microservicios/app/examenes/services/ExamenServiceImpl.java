package com.curso.microservicios.app.examenes.services;

import com.curso.microservicios.app.examenes.models.repository.AsignaturaRepository;
import com.curso.microservicios.app.examenes.models.repository.ExamenRepository;
import com.curso.microservicios.commons.examenes.models.entity.Asignatura;
import com.curso.microservicios.commons.examenes.models.entity.Examen;
import com.curso.microservicios.commons.services.CommonServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements ExamenService {

  @Autowired
  private AsignaturaRepository asignaturaRepository;

  @Override
  @Transactional(readOnly = true)
  public List<Examen> findByNombre(String arg) {
    return repository.findByNombre(arg);
  }

  @Override
  @Transactional(readOnly = true)
  public List<Asignatura> findAllAsignaturas() {
    return (List<Asignatura>) asignaturaRepository.findAll();
  }
}

package pe.com.ControlAsistencia.controlasistencia.service.estudiante;

import pe.com.ControlAsistencia.controlasistencia.entity.estudianteEntity;

import java.util.List;

public interface EstudianteService {
    List<estudianteEntity> findAll();
}

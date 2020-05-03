package pe.com.ControlAsistencia.controlasistencia.service.estudiante.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ControlAsistencia.controlasistencia.entity.estudianteEntity;
import pe.com.ControlAsistencia.controlasistencia.repository.EstudianteRepository;
import pe.com.ControlAsistencia.controlasistencia.service.estudiante.EstudianteService;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<estudianteEntity> findAll() {
        return estudianteRepository.findAll();
    }
}

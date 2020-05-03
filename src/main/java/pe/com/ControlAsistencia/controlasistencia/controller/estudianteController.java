package pe.com.ControlAsistencia.controlasistencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.ControlAsistencia.controlasistencia.entity.estudianteEntity;
import pe.com.ControlAsistencia.controlasistencia.model.Estudiante;
import pe.com.ControlAsistencia.controlasistencia.service.estudiante.EstudianteService;

import java.util.List;

@RestController
@RequestMapping("/tipo-estudiante")
public class estudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/v1/listado-estudiantes")
    public List<estudianteEntity> findAll(){
        return estudianteService.findAll();
    }
}

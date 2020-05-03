package pe.com.ControlAsistencia.controlasistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.ControlAsistencia.controlasistencia.entity.estudianteEntity;

public interface EstudianteRepository extends JpaRepository<estudianteEntity,Integer> {
}

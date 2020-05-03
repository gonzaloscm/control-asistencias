package pe.com.ControlAsistencia.controlasistencia.command;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Data
@Component
@NoArgsConstructor
public class EstudianteCommand {

    private Integer idEstudiante;
    private String nombre;
    private String sexo;
}

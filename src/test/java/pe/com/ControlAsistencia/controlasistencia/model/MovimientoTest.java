package pe.com.ControlAsistencia.controlasistencia.model;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pe.com.ControlAsistencia.controlasistencia.model.businessexception.BusinessException;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovimientoTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void registrarEstudiante() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Movimiento.ESTUDIANTE_REQUERIDO);
        Estudiante estudiante = new Estudiante.EstudianteBuilder()
                .setIdEstudiante(1)
                .setSexo("Masculino")
                .build();
        Movimiento movimiento = new Movimiento.MovimientoBuilder()
                .setFechaIngreso(new Date())
                .setMateria("Ingles")
                .build();
    }
    @Test
    public void estudianteSinRegistrar() throws Exception {
        exception.expect(BusinessException.class);
        exception.expectMessage(Movimiento.VALIDAR_ESTUDIANTE);
        //Estudiante estudiante = new Estudiante.EstudianteBuilder()
                //.setIdEstudiante(1)
                //.setNombre("Damian")
               // .setSexo("Masculino")
                //.build();
        Movimiento movimiento = new Movimiento.MovimientoBuilder()
                .setFechaIngreso(new Date())
                .setMateria("Ingles")
                .build();
    }

}

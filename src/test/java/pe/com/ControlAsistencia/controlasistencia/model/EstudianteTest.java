package pe.com.ControlAsistencia.controlasistencia.model;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pe.com.ControlAsistencia.controlasistencia.model.businessexception.BusinessException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EstudianteTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void registrarEstudiante() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Estudiante.NOMBRE_ESTUDIANTE_VACIO);
        Estudiante estudiante = new Estudiante.EstudianteBuilder()
                .setNombre("")
                .build();
    }

    @Test
    public void registrarEstudianteNull() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Estudiante.NOMBRE_ESTUDIANTE_REQUERIDO);
        Estudiante estudiante = new Estudiante.EstudianteBuilder()
                .build();
    }

    @Test
    public void registrarSexoEstudiante() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Estudiante.SEXO_ESTUDIANTE_VACIO);
        Estudiante estudiante = new Estudiante.EstudianteBuilder()
                .setNombre("Gonzalo")
                .setSexo("")
                .build();
    }

    @Test
    public void registrarSexoEstudianteNull() throws Exception{
        exception.expect(BusinessException.class);
        exception.expectMessage(Estudiante.SEXO_ESTUDIANTE_REQUERIDO);
        Estudiante estudiante = new Estudiante.EstudianteBuilder()
                .setNombre("Damian")
                .build();
    }


}

package pe.com.ControlAsistencia.controlasistencia.model;

import pe.com.ControlAsistencia.controlasistencia.model.businessexception.BusinessException;
import pe.com.ControlAsistencia.controlasistencia.model.util.ValidatorMovimiento;

import java.util.Date;

public class Movimiento {

    public static final String ESTUDIANTE_REQUERIDO = "El nombre del estudiante es requerida";
    public static final String VALIDAR_ESTUDIANTE = "El estudiante no existe en el sistema";
    //public static final String ESTUDIANTE_VACIO = "El nombre del estudiante debe ser llenado";
    public static final String VALIDAR_ASISTENCIAS = "No se puede registrar mas asistencias, la fecha de las clases culmino";

    private Integer idMovimiento;
    private Date fechaIngreso;
    private String materia;
    private Estudiante estudiante;

    private Movimiento(){
        super();
    }

    public static class MovimientoBuilder{

        private Integer idMovimiento;
        private Date fechaIngreso;
        private String materia;
        private Estudiante estudiante;

        public MovimientoBuilder setIdMovimiento(Integer idMovimiento) {
            this.idMovimiento = idMovimiento;
            return this;
        }


        public MovimientoBuilder setFechaIngreso(Date fechaIngreso) {
            this.fechaIngreso = fechaIngreso;
            return this;
        }


        public MovimientoBuilder setMateria(String materia) {
            this.materia = materia;
            return this;
        }

        public MovimientoBuilder setEstudiante(Estudiante estudiante) {
            this.estudiante = estudiante;
            return this;
        }

        public Movimiento build() throws BusinessException {
            Movimiento movimiento = new Movimiento();
            movimiento.idMovimiento = this.idMovimiento;
            ValidatorMovimiento.estudianteNull(estudiante.getNombre(),ESTUDIANTE_REQUERIDO);
            ValidatorMovimiento.estudianteNoExiste(estudiante,VALIDAR_ESTUDIANTE);
            //ValidatorMovimiento.estudianteVacio(estudiante.getNombre(),ESTUDIANTE_VACIO);
            movimiento.estudiante = this.estudiante;
            //ValidatorMovimiento.culminacionDeClases(fechaIngreso,VALIDAR_ASISTENCIAS);
            movimiento.fechaIngreso = this.fechaIngreso;
            movimiento.materia = this.materia;
            return movimiento;
        }

    }
}

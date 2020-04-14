package pe.com.ControlAsistencia.controlasistencia.model;

import pe.com.ControlAsistencia.controlasistencia.model.businessexception.BusinessException;
import pe.com.ControlAsistencia.controlasistencia.model.util.ValidatorEstudiante;

public class Estudiante {

    public static final String NOMBRE_ESTUDIANTE_REQUERIDO = "El nombre del estudiante es requerida";
    public static final String NOMBRE_ESTUDIANTE_VACIO = "El nombre del estudiante debe ser llenado";
    public static final String SEXO_ESTUDIANTE_REQUERIDO = "El sexo del estudiante es requerido";
    public static final String SEXO_ESTUDIANTE_VACIO = "El sexo del estudiante debe ser llenado";

    private Integer idEstudiante;
    private String nombre;
    private String sexo;

    private Estudiante(){
        super();
    }

    public static class EstudianteBuilder{
        private Integer idEstudiante;
        private String nombre;
        private String sexo;

        public EstudianteBuilder setIdEstudiante(Integer idEstudiante) {
            this.idEstudiante = idEstudiante;
            return this;
        }

        public EstudianteBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public EstudianteBuilder setSexo(String sexo) {
            this.sexo = sexo;
            return this;
        }


        public Estudiante build() throws BusinessException {
            Estudiante estudiante = new Estudiante();
            estudiante.idEstudiante = this.idEstudiante;
            ValidatorEstudiante.validarEstudiante(nombre,NOMBRE_ESTUDIANTE_REQUERIDO);
            ValidatorEstudiante.validarNombreVacio(nombre,NOMBRE_ESTUDIANTE_VACIO);
            estudiante.nombre = this.nombre;
            ValidatorEstudiante.validarSexoEstudiante(sexo,SEXO_ESTUDIANTE_REQUERIDO);
            ValidatorEstudiante.validarSexoEstudianteVacio(sexo,SEXO_ESTUDIANTE_VACIO);
            estudiante.sexo = this.sexo;
            return estudiante;
        }
    }

    public Integer getIdEstudiante(){
        return idEstudiante;
    }

    public String getNombre(){
        return nombre;
    }

    public String getSexo(){
        return sexo;
    }


}

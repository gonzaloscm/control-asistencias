package pe.com.ControlAsistencia.controlasistencia.model.util;

import pe.com.ControlAsistencia.controlasistencia.model.businessexception.BusinessException;

public class ValidatorEstudiante {

    public static void validarEstudiante(String nombre, String mensaje) throws BusinessException{
        if(nombre == null){
            throw new BusinessException(mensaje);
        }
    }

    public static void validarNombreVacio(String nombre, String mensaje) throws BusinessException{
        if("".equals(nombre)){
            throw new BusinessException(mensaje);
        }
    }

    public static void validarSexoEstudiante(String sexo, String mensaje) throws BusinessException {
        if(sexo == null){
            throw new BusinessException(mensaje);
        }
    }

    public static void validarSexoEstudianteVacio(String sexo, String mensaje) throws BusinessException {
        if("".equals(sexo)){
            throw new BusinessException(mensaje);
        }
    }
}

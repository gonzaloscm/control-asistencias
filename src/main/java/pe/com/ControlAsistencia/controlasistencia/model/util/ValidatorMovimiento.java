package pe.com.ControlAsistencia.controlasistencia.model.util;

import pe.com.ControlAsistencia.controlasistencia.model.businessexception.BusinessException;

import java.util.Date;

public class ValidatorMovimiento {
    public static void estudianteNull(String estudiante, String mensaje) throws BusinessException {
        if(estudiante == null){
            throw new BusinessException(mensaje);
        }
    }

    public static void estudianteNoExiste(Object object, String mensaje) throws BusinessException {
        if(object == null){
            throw new BusinessException(mensaje);
        }
    }

    public static void estudianteVacio(String estudiante, String mensaje) throws BusinessException {
        if("".equals(estudiante)){
            throw new BusinessException(mensaje);
        }
    }

    //public static void culminacionDeClases(Date fechaIngreso, String mensaje) throws BusinessException {
        //String fechaCulminacion = "15/06/2020";
        //if (fechaIngreso.before(fechaCulminacion)) {
           // throw new BusinessException(mensaje);
        //}
    //}
}

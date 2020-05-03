package pe.com.ControlAsistencia.controlasistencia.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table( name = "estudiante")
public class estudianteEntity {

    @Id
    @Column(name = "idEstudiante")
    private Integer idEstudiante;
    @Column( name = "nombre")
    private String nombre;
    @Column( name = "sexo")
    private String sexo;


}

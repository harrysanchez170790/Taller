package ubilapaz.edu.bo.template.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
@Setter
public class UsuarioDto {
    private String nombre;
    private String usuario;
    private Boolean estado;

    private LocalDateTime fechaRegistro;

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public Boolean getEstado() {
        return estado;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }
}

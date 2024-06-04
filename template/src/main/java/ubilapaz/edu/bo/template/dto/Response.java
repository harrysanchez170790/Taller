package ubilapaz.edu.bo.template.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Response {
    private Boolean estado;
    private String mensaje;
}

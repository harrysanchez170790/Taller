package ubilapaz.edu.bo.template.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private String nombre;
    private String username;
    private String password;
}
